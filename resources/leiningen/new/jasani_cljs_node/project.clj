(defproject {{name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure       "1.9.0"]
                 [org.clojure/clojurescript "1.10.64"]
                 [org.clojure/core.async    "0.4.474"]
                 ]
  :plugins [[lein-npm       "0.6.2"]
            [lein-cljsbuild "1.1.7"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src"]
     :compiler {:output-to     "target/{{name}}/{{name}}.js"
                :output-dir    "target/{{name}}"
                :main          "{{name}}.core"
                :target        :nodejs
                ;; Manage nodejs dependencies here
                :npm-deps      {"string-template" "1.0.0"}
                :install-deps  true
                :optimizations :none}}]})
