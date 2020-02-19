(ns clojure-kubernetes-client.specs.v1-topology-spread-constraint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-topology-spread-constraint-data v1-topology-spread-constraint)
(def v1-topology-spread-constraint-data
  {
   (ds/opt :labelSelector) v1-label-selector
   (ds/req :maxSkew) int?
   (ds/req :topologyKey) string?
   (ds/req :whenUnsatisfiable) string?
   })

(def v1-topology-spread-constraint
  (ds/spec
    {:name ::v1-topology-spread-constraint
     :spec v1-topology-spread-constraint-data}))

