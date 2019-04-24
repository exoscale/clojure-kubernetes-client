(ns clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta1-metric-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-horizontal-pod-autoscaler-spec-data v2beta1-horizontal-pod-autoscaler-spec)
(def v2beta1-horizontal-pod-autoscaler-spec-data
  {
   (ds/req :maxReplicas) int?
   (ds/opt :metrics) (s/coll-of v2beta1-metric-spec)
   (ds/opt :minReplicas) int?
   (ds/req :scaleTargetRef) v2beta1-cross-version-object-reference
   })

(def v2beta1-horizontal-pod-autoscaler-spec
  (ds/spec
    {:name ::v2beta1-horizontal-pod-autoscaler-spec
     :spec v2beta1-horizontal-pod-autoscaler-spec-data}))

