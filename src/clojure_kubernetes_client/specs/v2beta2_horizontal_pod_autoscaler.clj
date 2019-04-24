(ns clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-status :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-horizontal-pod-autoscaler-data v2beta2-horizontal-pod-autoscaler)
(def v2beta2-horizontal-pod-autoscaler-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v2beta2-horizontal-pod-autoscaler-spec
   (ds/opt :status) v2beta2-horizontal-pod-autoscaler-status
   })

(def v2beta2-horizontal-pod-autoscaler
  (ds/spec
    {:name ::v2beta2-horizontal-pod-autoscaler
     :spec v2beta2-horizontal-pod-autoscaler-data}))

