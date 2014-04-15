(ns max7219.core
  (:require [max7219.spi :as spi]))

(def reg {:no-op (byte 0x0)
          :decode-mode (byte 0x9)
          :intensity (byte 0xa)
          :scan-limit (byte 0xb)
          :shutdown (byte 0xc)
          :display-test (byte 0xf)})

(def rows {:row-1 (byte 0x1)
           :row-2 (byte 0x2)
           :row-3 (byte 0x3)
           :row-4 (byte 0x4)
           :row-5 (byte 0x5)
           :row-6 (byte 0x6)
           :row-7 (byte 0x7)
           :row-8 (byte 0x8)})

(defn open! [channel]
  (let [c (spi/open! channel)]
    (if (nil? c) nil
        (do (spi/send-bytes! c [(reg :scan-limit) (byte 0x7)])
            (spi/send-bytes! c [(reg :decode-mode) (byte 0x0)])
            (spi/send-bytes! c [(reg :shutdown) (byte 0x1)])
            (spi/send-bytes! c [(reg :display-test) (byte 0x0)])
            c))))

(defn set-row! [channel row data]
  (->> (interleave (repeat (rows row)) data)
       (spi/send-bytes! channel))
  channel)

(defn set-rows! [channel data]
  (dorun (map (partial set-row! channel)
              (keys rows)
              data))
  channel)

(defn clear-rows! [channel]
  (set-rows! channel (map list (take 8 (repeat 0))))
  channel)

(defn bits-to-long[bits]
  (reduce #(bit-or (bit-shift-left %1 1) %2) bits))

(defn bits-to-bytes [bits]
  (->> (partition 8 8 (repeat 0) bits)
       (map bits-8-to-byte)
       (map unchecked-byte)))
