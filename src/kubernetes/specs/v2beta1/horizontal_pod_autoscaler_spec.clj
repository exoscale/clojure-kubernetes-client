(ns kubernetes.specs.v2beta1/horizontal-pod-autoscaler-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta1/metric-spec :refer :all]
            [kubernetes.specs.v2beta1/cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/horizontal-pod-autoscaler-spec-data
  {
   (ds/req :maxReplicas) int?
   (ds/opt :metrics) (s/coll-of v2beta1/metric-spec-spec)
   (ds/opt :minReplicas) int?
   (ds/req :scaleTargetRef) v2beta1/cross-version-object-reference-spec
   })

(def v2beta1/horizontal-pod-autoscaler-spec-spec
  (ds/spec
    {:name ::v2beta1/horizontal-pod-autoscaler-spec
     :spec v2beta1/horizontal-pod-autoscaler-spec-data}))
