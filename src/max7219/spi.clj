(ns max7219.spi
  (:import (com.pi4j.wiringpi Spi)))

(def channels {:channel-0 Spi/CHANNEL_0
               :channel-1 Spi/CHANNEL_1})

(defn open! [channel]
  (let [c (channels channel)]
    (Spi/wiringPiSPISetup c 10000000)
    channel))

(defn send-bytes! [channel data]
  (let [c (channels channel)]
    (Spi/wiringPiSPIDataRW c (byte-array (map unchecked-byte data)) (count data))
    (count data)))
