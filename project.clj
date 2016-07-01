(defproject play "0.1.0-SNAPSHOT"
  :description "Playing with clojure"
  :url "https://github.com/murielsilveira/clojure-play"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot play.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
