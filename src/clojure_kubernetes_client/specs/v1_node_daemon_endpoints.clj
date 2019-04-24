(ns clojure-kubernetes-client.specs.v1-node-daemon-endpoints
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-daemon-endpoint :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-daemon-endpoints-data v1-node-daemon-endpoints)
(def v1-node-daemon-endpoints-data
  {
   (ds/opt :kubeletEndpoint) v1-daemon-endpoint
   })

(def v1-node-daemon-endpoints
  (ds/spec
    {:name ::v1-node-daemon-endpoints
     :spec v1-node-daemon-endpoints-data}))

