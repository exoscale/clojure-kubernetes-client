(ns kubernetes.specs.v2beta1/horizontal-pod-autoscaler-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-condition :refer :all]
            [kubernetes.specs.v2beta1/metric-status :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/horizontal-pod-autoscaler-status-data
  {
   (ds/req :conditions) (s/coll-of v2beta1/horizontal-pod-autoscaler-condition-spec)
   (ds/req :currentMetrics) (s/coll-of v2beta1/metric-status-spec)
   (ds/req :currentReplicas) int?
   (ds/req :desiredReplicas) int?
   (ds/opt :lastScaleTime) inst?
   (ds/opt :observedGeneration) int?
   })

(def v2beta1/horizontal-pod-autoscaler-status-spec
  (ds/spec
    {:name ::v2beta1/horizontal-pod-autoscaler-status
     :spec v2beta1/horizontal-pod-autoscaler-status-data}))
