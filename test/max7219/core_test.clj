(ns max7219.core-test
  (:use midje.sweet)
  (:require [max7219.core :refer :all]
            [max7219.spi :as spi]))

(def c :channel-0)

(fact "open channel"
  (open! c) => c
  (provided
    (spi/open! c) => c
    (spi/send-bytes! c [(byte 0xb) (byte 0x7)]) => nil   ; scan-limit
    (spi/send-bytes! c [(byte 0x9) (byte 0x0)]) => nil   ; decode mode
    (spi/send-bytes! c [(byte 0xc) (byte 0x1)]) => nil   ; shutdown
    (spi/send-bytes! c [(byte 0xf) (byte 0x0)]) => nil)) ; display test

(fact "set-row"
  (let [input [3 5 7]
        spiout [1 3 1 5 1 7]]
    (set-row! c :row-1 input) => c
    (provided
      (spi/send-bytes! c spiout) => nil)))

(fact "set-rows"
  (set-rows! c (partition 2 (range 16))) => c
  (provided
    (spi/send-bytes! c [1 0 1 1]) => nil
    (spi/send-bytes! c [2 2 2 3]) => nil
    (spi/send-bytes! c [3 4 3 5]) => nil
    (spi/send-bytes! c [4 6 4 7]) => nil
    (spi/send-bytes! c [5 8 5 9]) => nil
    (spi/send-bytes! c [6 10 6 11]) => nil
    (spi/send-bytes! c [7 12 7 13]) => nil
    (spi/send-bytes! c [8 14 8 15]) => nil))

(fact "clear"
  (clear-rows! c) => c
  (provided
    (set-rows! c [[0] [0] [0] [0] [0] [0] [0] [0]]) => nil))

(fact "bits to bytes"
  (bits-to-bytes [1 1 0 0 1 1 0 0]) => [(unchecked-byte 2r11001100)]
  (bits-to-bytes [1 1 0 0 1 1 0 0 1 1 0]) => [(unchecked-byte 2r11001100)
                                              (unchecked-byte 2r11000000)])
