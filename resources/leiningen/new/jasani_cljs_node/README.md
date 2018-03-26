## Build Commands

### Compile

```shell
# build dev version
lein cljsbuild once dev

# build simple optimized version
lein cljsbuild once simple

# build all versions
lein cljsbuild once
```

Manage your nodejs dependencies in the `:npm-deps` entry in
`project.clj`.  Lein will automatically download the nodejs modules so
you won't have to deal with any `package*.json` files or do `npm install`
manually.

### nREPL

1. Open `src/{{name}}/core.cljs` in emacs
2. `M-x cider-jack-in-clojurescript`
3. Answer prompts, choosing Node as the JS environment
4. You'll start in the `user` namespace, you can load your own.

``` clojure
user> (require '[{{name}}.core])
user> (in-ns '{{name}}.core)
user> (ls)
```

### Run

```shell
node target/{{name}}/{{name}}.js

# with args
node target/{{name}}/{{name}}.js sally

# run the simple optimized version
node target/simple/{{name}}.js
```

### Clean

`lein clean`

## References

* [cljsbuild optimization](https://clojurescript.org/reference/compiler-options)
* [CIDER up and running](https://github.com/clojure-emacs/cider/blob/master/doc/up_and_running.md)
