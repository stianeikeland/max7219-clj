(ns max7219.core
  (:require [max7219.spi :as spi]
            [max7219.font :as font]))

(def reg {:no-op (byte 0x0)
          :decode-mode (byte 0x9)
          :intensity (byte 0xa)
          :scan-limit (byte 0xb)
          :shutdown (byte 0xc)
          :display-test (byte 0xf)})

(def columns {:col-1 (byte 0x1)
              :col-2 (byte 0x2)
              :col-3 (byte 0x3)
              :col-4 (byte 0x4)
              :col-5 (byte 0x5)
              :col-6 (byte 0x6)
              :col-7 (byte 0x7)
              :col-8 (byte 0x8)})

(defn open!
  "Open a connection a SPI channel x for y displays"
  [channel display-count]
  (let [c (spi/open! channel)]
    (if (nil? c) nil
        (do
          (doseq [x [[(reg :scan-limit) (byte 0x7)]
                     [(reg :decode-mode) (byte 0x0)]
                     [(reg :shutdown) (byte 0x1)]
                     [(reg :display-test) (byte 0x0)]]]
            (->> (repeat display-count x)
                 (flatten)
                   (spi/send-bytes! c)))
          {:channel channel
           :displays display-count}))))

(defn set-column!
  "Set column x on all displays to value from list"
  [connection col data]
  (->> (interleave (repeat (columns col col))
                   (take (:displays connection) data))
       (spi/send-bytes! (:channel connection)))
  connection)

(defn set-columns!
  "Set all columns on all displays to values from list"
  [connection data]
  (dorun (map (partial set-column! connection)
              (keys columns)
              data))
  connection)

(defn clear-displays!
  "Clear all display (set all columns on all displays to 0)"
  [connection]
  (let [col-data (repeat (:displays connection) 0)]
    (set-columns! connection (repeat 8 col-data))))

(defn set-displays!
  "Render x displays * 8 bytes"
  [connection data]
  (let [partitioned (->> (concat data (repeat 0))
                         (partition 8)
                         (take (:displays connection))) ; split into 8s
        cols (apply map list partitioned)]              ; transpose
    (set-columns! connection cols)))

(defn scroll-text! [connection text delay]
  (loop [data (->> (font/str-to-bitmap text)
                   (concat (take (* 8 (:displays connection)) (repeat 0))))]
    (set-displays! connection data)
    (Thread/sleep delay)
    (let [r (rest data)]
      (if (empty? r) connection
          (recur r)))))

(defn bits-to-long[bits]
  (reduce #(bit-or (bit-shift-left %1 1) %2) bits))

(defn bits-to-bytes [bits]
  (->> (partition 8 8 (repeat 0) bits)
       (map bits-to-long)
       (map unchecked-byte)))

