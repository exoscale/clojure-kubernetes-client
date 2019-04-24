(ns clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-horizontal-pod-autoscaler-status-data v1-horizontal-pod-autoscaler-status)
(def v1-horizontal-pod-autoscaler-status-data
  {
   (ds/opt :currentCPUUtilizationPercentage) int?
   (ds/req :currentReplicas) int?
   (ds/req :desiredReplicas) int?
   (ds/opt :lastScaleTime) inst?
   (ds/opt :observedGeneration) int?
   })

(def v1-horizontal-pod-autoscaler-status
  (ds/spec
    {:name ::v1-horizontal-pod-autoscaler-status
     :spec v1-horizontal-pod-autoscaler-status-data}))

