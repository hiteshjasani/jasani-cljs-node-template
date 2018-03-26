(defproject {{name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure       "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [org.clojure/core.async    "0.4.474"]
                 ]
  :plugins [[lein-npm       "0.6.2"]
            [lein-cljsbuild "1.1.7"]
            [cider/cider-nrepl "0.17.0-SNAPSHOT"]]
  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src"]
     :compiler {:output-to     "target/{{name}}/{{name}}.js"
                :output-dir    "target/{{name}}"
                :main          "{{name}}.core"
                :target        :nodejs
                ;; Manage nodejs dependencies here
                :npm-deps      {"string-template" "1.0.0"}
                :install-deps  true
                :optimizations :none}}
    ]}
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]
                                  [org.clojure/tools.nrepl "0.2.10"]]
                   :repl-options
                   {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
  )
