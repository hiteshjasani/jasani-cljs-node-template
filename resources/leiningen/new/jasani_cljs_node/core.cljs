(ns {{name}}.core
  (:require [clojure.core.async :as async]))

(defn -main
  [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)
