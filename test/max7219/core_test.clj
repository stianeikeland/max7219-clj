(ns max7219.core-test
  (:use midje.sweet)
  (:require [max7219.core :refer :all]
            [max7219.spi :as spi]))

(def c :channel-0)
(def connection {:channel c
                 :displays 2})

(fact "open channel"
  (open! c 2) => connection
  (provided
    (spi/open! c) => c
    (spi/send-bytes! c [(byte 0xb) (byte 0x7)]) => nil   ; scan-limit
    (spi/send-bytes! c [(byte 0x9) (byte 0x0)]) => nil   ; decode mode
    (spi/send-bytes! c [(byte 0xc) (byte 0x1)]) => nil   ; shutdown
    (spi/send-bytes! c [(byte 0xf) (byte 0x0)]) => nil)) ; display test

(fact "set-column"
  (let [input [3 5 7]
        spiout [1 3 1 5]]
    (set-column! connection :col-1 input) => connection
    (provided
      (spi/send-bytes! c spiout) => nil)))

(fact "set-column also accept numeric column"
  (set-column! connection 2 [5]) => connection
  (provided
    (spi/send-bytes! c [2 5]) => nil))


(fact "set-columns"
  (set-columns! connection (partition 2 (range 16))) => connection
  (provided
    (spi/send-bytes! c [1 0 1 1]) => nil
    (spi/send-bytes! c [2 2 2 3]) => nil
    (spi/send-bytes! c [3 4 3 5]) => nil
    (spi/send-bytes! c [4 6 4 7]) => nil
    (spi/send-bytes! c [5 8 5 9]) => nil
    (spi/send-bytes! c [6 10 6 11]) => nil
    (spi/send-bytes! c [7 12 7 13]) => nil
    (spi/send-bytes! c [8 14 8 15]) => nil))

(fact "clear-displays"
  (let [output (repeat 8 [0 0])]
    (clear-displays! connection) => connection
    (provided
      (set-columns! connection output) => connection)))

(fact "bits to bytes"
  (bits-to-bytes [1 1 0 0 1 1 0 0]) => [(unchecked-byte 2r11001100)]
  (bits-to-bytes [1 1 0 0 1 1 0 0 1 1 0]) => [(unchecked-byte 2r11001100)
                                              (unchecked-byte 2r11000000)])
(fact "set-displays"
  (set-displays! connection [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16]) => connection
  (provided
    (set-columns! connection [[1 9] [2 10] [3 11] [4 12] [5 13] [6 14] [7 15] [8 16]]) => connection)
  (set-displays! connection [1 2 3]) => connection
  (provided
    (set-columns! connection [[1 0] [2 0] [3 0] [0 0] [0 0] [0 0] [0 0] [0 0]]) => connection))

