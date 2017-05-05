(defproject trmstatcli "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [org.clojure/clojurescript "1.9.494"]
                 [archiet.trm/stac_core "0.1.1-SNAPSHOT"]
                 [funcool/httpurr "0.6.2"]]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.9"]
            [lein-bikeshed "0.2.0"]
            [lein-cljfmt "0.5.6"]
            [lein-kibit "0.1.3"]]
  :source-paths ["src"]
  :cljsbuild {:builds [{:id "trmstatcli"
                        :source-paths ["src"]
                        :compiler {:output-to "trmstatcli.js"
                                   :output-dir "out"
                                   :target :nodejs
                                   :optimizations :simple}}]})
