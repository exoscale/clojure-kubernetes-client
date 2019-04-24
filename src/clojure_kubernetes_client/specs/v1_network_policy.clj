(ns clojure-kubernetes-client.specs.v1-network-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-network-policy-data v1-network-policy)
(def v1-network-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-network-policy-spec
   })

(def v1-network-policy
  (ds/spec
    {:name ::v1-network-policy
     :spec v1-network-policy-data}))

