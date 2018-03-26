(ns {{name}}.core
  (:require [cljs.nodejs :as nodejs]
            [clojure.core.async :as async]))

;; example using builtin nodejs module
(defonce fs (nodejs/require "fs"))
;; example using nodejs module
(defonce str-templ (nodejs/require "string-template"))

(defn ls
  ([] (ls "."))
  ([path]
   (js->clj (fs.readdirSync path))))

(defn -main
  [& args]
  (println (str "Current dir: " (ls)))
  (println (str-templ "Hello {name}!" (clj->js {:name "world"}))))

(set! *main-cli-fn* -main)
