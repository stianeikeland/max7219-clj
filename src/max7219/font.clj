(ns max7219.font)

(def font
  {" " [0x00 0x00 0x00 0x00 0x00 0x00]
   "!" [0x00 0x00 0x00 0x6f 0x00 0x00]
   "\"" [0x00 0x00 0x07 0x00 0x07 0x00]
   "#" [0x00 0x14 0x7f 0x14 0x7f 0x14]
   "$" [0x00 0x00 0x07 0x04 0x1e 0x00]
   "%" [0x00 0x23 0x13 0x08 0x64 0x62]
   "&" [0x00 0x36 0x49 0x56 0x20 0x50]
   "'" [0x00 0x00 0x00 0x07 0x00 0x00]
   "(" [0x00 0x00 0x1c 0x22 0x41 0x00]
   ")" [0x00 0x00 0x41 0x22 0x1c 0x00]
   "*" [0x00 0x14 0x08 0x3e 0x08 0x14]
   "+" [0x00 0x08 0x08 0x3e 0x08 0x08]
   "," [0x00 0x00 0x50 0x30 0x00 0x00]
   "-" [0x00 0x08 0x08 0x08 0x08 0x08]
   "." [0x00 0x00 0x60 0x60 0x00 0x00]
   "/" [0x00 0x20 0x10 0x08 0x04 0x02]
   "0" [0x00 0x3e 0x51 0x49 0x45 0x3e]
   "1" [0x00 0x00 0x42 0x7f 0x40 0x00]
   "2" [0x00 0x42 0x61 0x51 0x49 0x46]
   "3" [0x00 0x21 0x41 0x45 0x4b 0x31]
   "4" [0x00 0x18 0x14 0x12 0x7f 0x10]
   "5" [0x00 0x27 0x45 0x45 0x45 0x39]
   "6" [0x00 0x3c 0x4a 0x49 0x49 0x30]
   "7" [0x00 0x01 0x71 0x09 0x05 0x03]
   "8" [0x00 0x36 0x49 0x49 0x49 0x36]
   "9" [0x00 0x06 0x49 0x49 0x29 0x1e]
   ":" [0x00 0x00 0x36 0x36 0x00 0x00]
   ";" [0x00 0x00 0x56 0x36 0x00 0x00]
   "<" [0x00 0x08 0x14 0x22 0x41 0x00]
   "=" [0x00 0x14 0x14 0x14 0x14 0x14]
   ">" [0x00 0x00 0x41 0x22 0x14 0x08]
   "?" [0x00 0x02 0x01 0x51 0x09 0x06]
   "@" [0x00 0x3e 0x41 0x5d 0x49 0x4e]
   "A" [0x00 0x7e 0x09 0x09 0x09 0x7e]
   "B" [0x00 0x7f 0x49 0x49 0x49 0x36]
   "C" [0x00 0x3e 0x41 0x41 0x41 0x22]
   "D" [0x00 0x7f 0x41 0x41 0x41 0x3e]
   "E" [0x00 0x7f 0x49 0x49 0x49 0x41]
   "F" [0x00 0x7f 0x09 0x09 0x09 0x01]
   "G" [0x00 0x3e 0x41 0x49 0x49 0x7a]
   "H" [0x00 0x7f 0x08 0x08 0x08 0x7f]
   "I" [0x00 0x00 0x41 0x7f 0x41 0x00]
   "J" [0x00 0x20 0x40 0x41 0x3f 0x01]
   "K" [0x00 0x7f 0x08 0x14 0x22 0x41]
   "L" [0x00 0x7f 0x40 0x40 0x40 0x40]
   "M" [0x00 0x7f 0x02 0x0c 0x02 0x7f]
   "N" [0x00 0x7f 0x04 0x08 0x10 0x7f]
   "O" [0x00 0x3e 0x41 0x41 0x41 0x3e]
   "P" [0x00 0x7f 0x09 0x09 0x09 0x06]
   "Q" [0x00 0x3e 0x41 0x51 0x21 0x5e]
   "R" [0x00 0x7f 0x09 0x19 0x29 0x46]
   "S" [0x00 0x46 0x49 0x49 0x49 0x31]
   "T" [0x00 0x01 0x01 0x7f 0x01 0x01]
   "U" [0x00 0x3f 0x40 0x40 0x40 0x3f]
   "V" [0x00 0x0f 0x30 0x40 0x30 0x0f]
   "W" [0x00 0x3f 0x40 0x30 0x40 0x3f]
   "X" [0x00 0x63 0x14 0x08 0x14 0x63]
   "Y" [0x00 0x07 0x08 0x70 0x08 0x07]
   "Z" [0x00 0x61 0x51 0x49 0x45 0x43]
   "[" [0x00 0x3c 0x4a 0x49 0x29 0x1e]
   "\\" [0x00 0x02 0x04 0x08 0x10 0x20]
   "]" [0x00 0x00 0x41 0x7f 0x00 0x00]
   "^" [0x00 0x04 0x02 0x01 0x02 0x04]
   "_" [0x00 0x40 0x40 0x40 0x40 0x40]
   "`" [0x00 0x00 0x00 0x03 0x04 0x00]
   "a" [0x00 0x20 0x54 0x54 0x54 0x78]
   "b" [0x00 0x7f 0x48 0x44 0x44 0x38]
   "c" [0x00 0x38 0x44 0x44 0x44 0x20]
   "d" [0x00 0x38 0x44 0x44 0x48 0x7f]
   "e" [0x00 0x38 0x54 0x54 0x54 0x18]
   "f" [0x00 0x08 0x7e 0x09 0x01 0x02]
   "g" [0x00 0x0c 0x52 0x52 0x52 0x3e]
   "h" [0x00 0x7f 0x08 0x04 0x04 0x78]
   "i" [0x00 0x00 0x44 0x7d 0x40 0x00]
   "j" [0x00 0x20 0x40 0x44 0x3d 0x00]
   "k" [0x00 0x00 0x7f 0x10 0x28 0x44]
   "l" [0x00 0x00 0x41 0x7f 0x40 0x00]
   "m" [0x00 0x7c 0x04 0x18 0x04 0x78]
   "n" [0x00 0x7c 0x08 0x04 0x04 0x78]
   "o" [0x00 0x38 0x44 0x44 0x44 0x38]
   "p" [0x00 0x7c 0x14 0x14 0x14 0x08]
   "q" [0x00 0x08 0x14 0x14 0x18 0x7c]
   "r" [0x00 0x7c 0x08 0x04 0x04 0x08]
   "s" [0x00 0x48 0x54 0x54 0x54 0x20]
   "t" [0x00 0x04 0x3f 0x44 0x40 0x20]
   "u" [0x00 0x3c 0x40 0x40 0x20 0x7c]
   "v" [0x00 0x1c 0x20 0x40 0x20 0x1c]
   "w" [0x00 0x3c 0x40 0x30 0x40 0x3c]
   "x" [0x00 0x44 0x28 0x10 0x28 0x44]
   "y" [0x00 0x0c 0x50 0x50 0x50 0x3c]
   "z" [0x00 0x44 0x64 0x54 0x4c 0x44]
   "{" [0x00 0x00 0x08 0x36 0x41 0x41]
   "|" [0x00 0x00 0x00 0x7f 0x00 0x00]
   "}" [0x00 0x41 0x41 0x36 0x08 0x00]
   "~" [0x00 0x04 0x02 0x04 0x08 0x04]
   ;"¬" [0x00 0x00 0x7c 0x44 0x7c 0x00]
   "‚" [0x00 0x00 0x64 0x54 0x48 0x00]
   "ƒ" [0x00 0x00 0x44 0x54 0x28 0x00]
   "„" [0x00 0x00 0x1c 0x10 0x78 0x00]
   "…" [0x00 0x00 0x5c 0x54 0x24 0x00]
   "†" [0x00 0x00 0x78 0x54 0x74 0x00]
   "‡" [0x00 0x00 0x64 0x14 0x0c 0x00]
   "ˆ" [0x00 0x00 0x7c 0x54 0x7c 0x00]
   "‰" [0x00 0x00 0x5c 0x54 0x3c 0x00]
   "Š" [0x00 0x78 0x24 0x26 0x25 0x78]
   "‹" [0x00 0x78 0x25 0x26 0x24 0x78]
   "Œ" [0x00 0x70 0x2a 0x29 0x2a 0x70]
   ;"}" [0x00 0x20 0x54 0x56 0x55 0x78]
   "‘" [0x00 0x20 0x55 0x54 0x55 0x78]
   "’" [0x00 0x7c 0x54 0x56 0x55 0x44]
   "“" [0x00 0x7c 0x55 0x56 0x54 0x44]
   "”" [0x00 0x7c 0x56 0x55 0x56 0x44]
   "•" [0x00 0x7c 0x55 0x54 0x55 0x44]
   "–" [0x00 0x38 0x54 0x56 0x55 0x18]
   "—" [0x00 0x38 0x55 0x56 0x54 0x18]
   "˜" [0x00 0x38 0x56 0x55 0x56 0x18]
   "™" [0x00 0x38 0x55 0x54 0x55 0x18]
   "š" [0x00 0x00 0x44 0x7e 0x45 0x00]
   "›" [0x00 0x00 0x45 0x7e 0x44 0x00]
   "œ" [0x00 0x00 0x46 0x7d 0x46 0x00]
   ;"~" [0x00 0x00 0x48 0x7a 0x41 0x00]
   "Ÿ" [0x00 0x00 0x49 0x7a 0x40 0x00]
   "¡" [0x00 0x00 0x49 0x78 0x41 0x00]
   "¢" [0x00 0x38 0x44 0x46 0x45 0x38]
   "£" [0x00 0x38 0x45 0x46 0x44 0x38]
   "¤" [0x00 0x38 0x46 0x45 0x46 0x38]
   "¥" [0x00 0x38 0x45 0x44 0x45 0x38]
   "¦" [0x00 0x30 0x48 0x4a 0x49 0x30]
   "§" [0x00 0x30 0x49 0x4a 0x48 0x30]
   "¨" [0x00 0x30 0x4a 0x49 0x4a 0x30]
   "©" [0x00 0x30 0x49 0x48 0x49 0x30]
   "ª" [0x00 0x3c 0x40 0x42 0x41 0x3c]
   "«" [0x00 0x3c 0x41 0x42 0x40 0x3c]
   "¬" [0x00 0x3c 0x42 0x41 0x42 0x3c]
   "®" [0x00 0x3c 0x40 0x42 0x21 0x7c]
   "¯" [0x00 0x3c 0x41 0x42 0x20 0x7c]
   "°" [0x00 0x38 0x42 0x41 0x22 0x78]
   "±" [0x00 0x3c 0x41 0x40 0x21 0x7c]
   "²" [0x00 0x4e 0x51 0x71 0x11 0x0a]
   "³" [0x00 0x58 0x64 0x64 0x24 0x10]
   "´" [0x00 0x7c 0x0a 0x11 0x22 0x7d]
   "µ" [0x00 0x78 0x12 0x09 0x0a 0x71]
   "¶" [0x00 0x00 0x00 0x04 0x02 0x01]
   "·" [0x00 0x01 0x02 0x04 0x00 0x00]
   "¸" [0x00 0x00 0x02 0x00 0x02 0x00]
   "¹" [0x00 0x30 0x48 0x45 0x40 0x20]
   "º" [0x00 0x00 0x00 0x7b 0x00 0x00]
   "»" [0x00 0x38 0x44 0x44 0x38 0x44]
   "¼" [0x00 0x40 0x3e 0x49 0x49 0x36]
   "½" [0x00 0x08 0x04 0x08 0x70 0x0c]
   "¾" [0x00 0x60 0x50 0x48 0x50 0x60]
   "¿" [0x00 0x20 0x52 0x55 0x59 0x30]
   "À" [0x00 0x38 0x54 0x54 0x54 0x00]
   "Á" [0x00 0x00 0x00 0x7f 0x41 0x00]
   "Â" [0x00 0x40 0x22 0x14 0x18 0x60]
   "Ã" [0x00 0x7c 0x20 0x20 0x1c 0x20]
   "Ä" [0x00 0x44 0x3c 0x04 0x7c 0x44]
   "Å" [0x00 0x40 0x3c 0x12 0x12 0x0c]
   "Æ" [0x00 0x41 0x63 0x55 0x49 0x41]
   "Ç" [0x00 0x38 0x44 0x44 0x3c 0x04]
   "È" [0x00 0x08 0x04 0x3c 0x44 0x24]
   "É" [0x00 0x08 0x14 0x7f 0x14 0x08]
   "Ê" [0x00 0x4e 0x71 0x01 0x71 0x4e]
   "Ë" [0x00 0x45 0x29 0x11 0x29 0x45]
   "Ì" [0x00 0x0d 0x51 0x51 0x51 0x3d]
   "Í" [0x00 0x00 0x00 0x05 0x02 0x05]
   "Î" [0x00 0x40 0x00 0x40 0x00 0x40]
   "Ï" [0x00 0x00 0x08 0x1c 0x3e 0x00]
   "Ð" [0x00 0x1c 0x1c 0x1c 0x00 0x00]
   "Ñ" [0x00 0x00 0x70 0x08 0x07 0x00]
   "Ò" [0x00 0x00 0x08 0x08 0x08 0x00]
   "Ó" [0x00 0x00 0x1d 0x15 0x17 0x00]
   "Ô" [0x00 0x00 0x07 0x05 0x07 0x00]
   "Õ" [0x00 0x00 0x11 0x15 0x0a 0x00]
   "Ö" [0x00 0x00 0x00 0x00 0x00 0x00]
   "×" [0x00 0x04 0x3c 0x41 0x20 0x00]
   "Ø" [0x00 0x7c 0x16 0x15 0x16 0x08]
   "Ù" [0x00 0x21 0x16 0x08 0x34 0x42]
   "Ú" [0x00 0x7f 0x09 0x1d 0x01 0x03]
   "Û" [0x00 0x38 0x54 0x54 0x14 0x08]
   "Ü" [0x00 0x00 0x00 0x7c 0x40 0x40]
   "Ý" [0x00 0x7f 0x0e 0x1c 0x38 0x7f]
   "Þ" [0x00 0x41 0x22 0x5d 0x22 0x1c]
   "ß" [0x00 0x1c 0x3e 0x1c 0x08 0x00]
   "à" [0x00 0x7f 0x7f 0x7f 0x7f 0x7f]
   "á" [0x00 0x77 0x7b 0x01 0x7b 0x77]
   "â" [0x00 0x7f 0x43 0x75 0x43 0x7f]
   "ã" [0x00 0x7f 0x6f 0x55 0x43 0x7f]
   "ä" [0x00 0x40 0x40 0x40 0x40 0x40]
   "å" [0x00 0x44 0x42 0x5f 0x42 0x44]
   "æ" [0x00 0x40 0x5e 0x45 0x5e 0x40]
   "ç" [0x00 0x40 0x48 0x55 0x5e 0x40]
   "è" [0x00 0x00 0x04 0x08 0x10 0x20]
   "é" [0x00 0x03 0x07 0x0e 0x1c 0x38]
   "ê" [0x00 0x01 0x03 0x07 0x0f 0x1f]
   "ë" [0x00 0x7c 0x78 0x70 0x60 0x40]
   "ì" [0x00 0x08 0x08 0x1c 0x22 0x1c]
   "í" [0x00 0x00 0x1c 0x22 0x1c 0x00]
   "î" [0x00 0x02 0x00 0x08 0x00 0x20]
   "ï" [0x00 0x04 0x3e 0x3f 0x3e 0x04]
   "ð" [0x00 0x10 0x3e 0x7e 0x3e 0x10]
   "ñ" [0x00 0x55 0x2a 0x55 0x2a 0x55]
   "ò" [0x00 0x24 0x2a 0x7f 0x2a 0x12]
   "ó" [0x00 0x04 0x1e 0x1f 0x1e 0x04]})

(defn str-to-bitmap [text]
  (-> (map #(font (str %) (font " ")) text)
      (vec)
      (conj 0)
      (flatten)))
