(ns clojure-kubernetes-client.specs.v1-network-policy-peer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-ip-block :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-network-policy-peer-data v1-network-policy-peer)
(def v1-network-policy-peer-data
  {
   (ds/opt :ipBlock) v1-ip-block
   (ds/opt :namespaceSelector) v1-label-selector
   (ds/opt :podSelector) v1-label-selector
   })

(def v1-network-policy-peer
  (ds/spec
    {:name ::v1-network-policy-peer
     :spec v1-network-policy-peer-data}))

