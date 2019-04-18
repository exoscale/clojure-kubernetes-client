(ns kubernetes.specs.v1/horizontal-pod-autoscaler-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/horizontal-pod-autoscaler-spec-data
  {
   (ds/req :maxReplicas) int?
   (ds/opt :minReplicas) int?
   (ds/req :scaleTargetRef) v1/cross-version-object-reference-spec
   (ds/opt :targetCPUUtilizationPercentage) int?
   })

(def v1/horizontal-pod-autoscaler-spec-spec
  (ds/spec
    {:name ::v1/horizontal-pod-autoscaler-spec
     :spec v1/horizontal-pod-autoscaler-spec-data}))
