(ns clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-horizontal-pod-autoscaler-data v1-horizontal-pod-autoscaler)
(def v1-horizontal-pod-autoscaler-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-horizontal-pod-autoscaler-spec
   (ds/opt :status) v1-horizontal-pod-autoscaler-status
   })

(def v1-horizontal-pod-autoscaler
  (ds/spec
    {:name ::v1-horizontal-pod-autoscaler
     :spec v1-horizontal-pod-autoscaler-data}))

