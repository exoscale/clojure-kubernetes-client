(ns clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-pod-disruption-budget-data v1beta1-pod-disruption-budget)
(def v1beta1-pod-disruption-budget-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-pod-disruption-budget-spec
   (ds/opt :status) v1beta1-pod-disruption-budget-status
   })

(def v1beta1-pod-disruption-budget
  (ds/spec
    {:name ::v1beta1-pod-disruption-budget
     :spec v1beta1-pod-disruption-budget-data}))

