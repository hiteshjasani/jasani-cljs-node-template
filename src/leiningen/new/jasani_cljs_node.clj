(ns leiningen.new.jasani-cljs-node
  (:require [leiningen.new.templates :refer [renderer raw-resourcer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jasani-cljs-node"))
(def raw (raw-resourcer "jasani-cljs-node"))

(defn jasani-cljs-node
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jasani-cljs-node project.")
    (->files data
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             )))
