(ns clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-condition :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-status :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-horizontal-pod-autoscaler-status-data v2beta2-horizontal-pod-autoscaler-status)
(def v2beta2-horizontal-pod-autoscaler-status-data
  {
   (ds/req :conditions) (s/coll-of v2beta2-horizontal-pod-autoscaler-condition)
   (ds/opt :currentMetrics) (s/coll-of v2beta2-metric-status)
   (ds/req :currentReplicas) int?
   (ds/req :desiredReplicas) int?
   (ds/opt :lastScaleTime) inst?
   (ds/opt :observedGeneration) int?
   })

(def v2beta2-horizontal-pod-autoscaler-status
  (ds/spec
    {:name ::v2beta2-horizontal-pod-autoscaler-status
     :spec v2beta2-horizontal-pod-autoscaler-status-data}))

