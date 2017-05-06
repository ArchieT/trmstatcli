(ns archiet.trm.stac.cli
  (:require [cljs.nodejs :as nodejs]
            [httpurr.client :as http]
            [httpurr.client.node :refer [client]]
            [archiet.trm.stac.core :as st]
            [promesa.core :as p :refer [await] :refer-macros [alet]]))
(def h (nodejs/require "https"))

(defn -main []
  ;;(alet [blah (p/await (http/get client st/url))] (println (-> blah :body str )))
  (.get h st/url #(println (.read %))))

(nodejs/enable-util-print!)

(set! *main-cli-fn* -main)
