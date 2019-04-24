(ns clojure-kubernetes-client.specs.v1-pod-affinity-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-affinity-term-data v1-pod-affinity-term)
(def v1-pod-affinity-term-data
  {
   (ds/opt :labelSelector) v1-label-selector
   (ds/opt :namespaces) (s/coll-of string?)
   (ds/req :topologyKey) string?
   })

(def v1-pod-affinity-term
  (ds/spec
    {:name ::v1-pod-affinity-term
     :spec v1-pod-affinity-term-data}))

