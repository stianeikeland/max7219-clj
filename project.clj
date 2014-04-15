(defproject max7219 "0.1.0-SNAPSHOT"
  :description "MAX7219 (led matrix driver) library for the raspberry pi"
  :url "https://github.com/stianeikeland/max7219-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.pi4j/pi4j-core "0.0.5"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.3"]]
                   :dependencies [[midje "1.6.3" :exclusions [org.clojure/clojure]]]}})
