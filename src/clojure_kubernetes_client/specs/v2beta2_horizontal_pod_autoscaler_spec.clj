(ns clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-horizontal-pod-autoscaler-spec-data v2beta2-horizontal-pod-autoscaler-spec)
(def v2beta2-horizontal-pod-autoscaler-spec-data
  {
   (ds/req :maxReplicas) int?
   (ds/opt :metrics) (s/coll-of v2beta2-metric-spec)
   (ds/opt :minReplicas) int?
   (ds/req :scaleTargetRef) v2beta2-cross-version-object-reference
   })

(def v2beta2-horizontal-pod-autoscaler-spec
  (ds/spec
    {:name ::v2beta2-horizontal-pod-autoscaler-spec
     :spec v2beta2-horizontal-pod-autoscaler-spec-data}))

