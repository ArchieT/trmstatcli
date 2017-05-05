(ns archiet.trm.stac.cli
  (:require [cljs.nodejs :as nodejs]
            [httpurr.client :as http]
            [httpurr.client.node :refer [client]]
            [archiet.trm.stac.core :as st]))
(defn -main []
  (println (http/get client st/url)))

(nodejs/enable-util-print!)

(set! *main-cli-fn* -main)
