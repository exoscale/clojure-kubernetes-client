(ns clojure-kubernetes-client.specs.v1-network-policy-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-network-policy-port-data v1-network-policy-port)
(def v1-network-policy-port-data
  {
   (ds/opt :port) any?
   (ds/opt :protocol) string?
   })

(def v1-network-policy-port
  (ds/spec
    {:name ::v1-network-policy-port
     :spec v1-network-policy-port-data}))

