(ns clojure-kubernetes-client.specs.v1-node-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-config-source :refer :all]
            [clojure-kubernetes-client.specs.v1-taint :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-spec-data v1-node-spec)
(def v1-node-spec-data
  {
   (ds/opt :configSource) v1-node-config-source
   (ds/opt :externalID) string?
   (ds/opt :podCIDR) string?
   (ds/opt :podCIDRs) (s/coll-of string?)
   (ds/opt :providerID) string?
   (ds/opt :taints) (s/coll-of v1-taint)
   (ds/opt :unschedulable) boolean?
   })

(def v1-node-spec
  (ds/spec
    {:name ::v1-node-spec
     :spec v1-node-spec-data}))

