(ns archiet.trm.stac.cli
  (:require [cljs.nodejs :as node]
            [httpurr.client :as http]
            [httpurr.client.node :refer [client]]
            [archiet.trm.stac.core :as st]))
(def http (node/require "http"))
(def url (node/require "url"))
(defn get-url [url-str callback]
  (let [parsed-url (.parse url url-str)
        req (.request http parsed-url callback)]
    (.end req)
    ))
(defn -main []
  (println (get-url st/url (comp println prn-str))))

(node/enable-util-print!)

(set! *main-cli-fn* -main)
