(ns archiet.trm.stac.cli
  (:require [cljs.nodejs :as nodejs]
            [httpurr.client :as http]
            [httpurr.client.node :refer [client]]
            [archiet.trm.stac.core :as st]
            [promesa.core :as p :refer [await] :refer-macros [alet]]))
(defn -main []
  (alet [blah (p/await (http/get client st/url))] (println (-> blah :body str ))))

(nodejs/enable-util-print!)

(set! *main-cli-fn* -main)
