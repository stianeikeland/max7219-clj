# max7219

Clojure library for max7219 led matrix driver (on raspberry pi).

[![Max7219 space invader](http://blagg.tadkom.net/images/max7219/anim.gif)](https://vimeo.com/92539944)

```` clojure
[max7219 "0.1.2"]
````

The max7219 is serial interfaced 8x8 (or 7 segment) LED driver.
Several drivers can be chained in series. You use the driver by
sending it a command and data (1 byte + 1 byte) over SPI. Each driver
hold 2 bytes, and will shift out the old values to the next
device in the chain. The driver will execute the command it holds when
slave select is set high at the end of transmission.

The 8x8 matrix display is arranged by 8 columns, each column is
represented by 1 byte (8 bit). This means you can update 1 column on
every display for every round of transmition.

By transmitting `[1 255 1 255]` you turn all leds in
the first column on for two displays. `[1 255 2 0]` turns all leds on
in the first column on the second display, and turns all leds off on
the second column for the first display (commands are shifted to the next
display if a new byte pair is received).

Datasheet: [MAX7219-MAX7221.pdf](http://pdfserv.maximintegrated.com/en/ds/MAX7219-MAX7221.pdf)

More information with examples available in this [blog post](http://blagg.tadkom.net/2014/04/21/max7219-rpi-clojure/).

## Usage

FIXME

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
