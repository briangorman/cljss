(defproject org.roman01la/cljss "1.6.0"
  :description "Clojure Style Sheets"

  :url "https://github.com/roman01la/cljss"

  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/test.check "0.10.0-alpha2"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]
                 [sablono "0.8.1"]]

  :test-paths ["test/clj"]

  :profiles {:dev {:source-paths ["src" "test/clj"]
                   :plugins      [[lein-doo "0.1.8"]
                                  [lein-cljsbuild "1.1.7"]]}}

  :aliases {"test-all" ["do" ["test"] ["doo" "phantom" "test" "once"]]}

  :cljsbuild
  {:builds [{:id           "test"
             :source-paths ["src" "test/cljs"]
             :compiler     {:output-to     "resources/public/js/testable.js"
                            :main          cljss.runner
                            :optimizations :none}}]})
