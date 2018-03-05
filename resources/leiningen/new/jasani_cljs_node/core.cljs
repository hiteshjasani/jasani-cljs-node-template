(ns {{name}}.core
  (:require [cljs.nodejs :as nodejs]
            [clojure.core.async :as async]))

;; example using nodejs module
(defonce str-templ (nodejs/require "string-template"))

(defn -main
  [& args]
  (println (str-templ "Hello {name}!" (clj->js {:name "world"}))))

(set! *main-cli-fn* -main)
