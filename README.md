# jasani-cljs-node

[![Clojars Project](https://clojars.org/jasani-cljs-node/lein-template/latest-version.svg)](http://clojars.org/jasani-cljs-node/lein-template)
[![Clojars Project](https://img.shields.io/clojars/v/jasani-cljs-node/lein-template.svg)](https://clojars.org/jasani-cljs-node/lein-template)

A Leiningen template for generating a simple clojurescript project
that can run on [nodejs](https://nodejs.org/).

## Usage

Make sure you have the prerequisites installed.

1. `lein new jasani-cljs-node myapp`
2. `cd myapp`
3. `lein cljsbuild once`

You'll see info about the compilation.

``` shell
Compiling ClojureScript...
Compiling ["target/myapp/myapp.js"] from ["src"]...
Successfully compiled ["target/myapp/myapp.js"] in 4.357 seconds.
```

4. `node target/myapp/myapp.js`

## Prerequisites

* [nodejs & npm](https://nodejs.org/en/)
* [leiningen](https://leiningen.org)

## License

Copyright © 2018 Hitesh Jasani

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
