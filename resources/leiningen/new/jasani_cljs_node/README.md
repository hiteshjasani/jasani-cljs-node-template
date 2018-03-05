## Build Commands

### Compile

`lein cljsbuild once`

Manage your nodejs dependencies in the `:npm-deps` entry in
`project.clj`.  Lein will automatically download the nodejs modules so
you won't have to deal with any `package*.json` files or do `npm install`
manually.

### Run

`node target/{{name}}/{{name}}.js`

### Clean

`lein clean`
