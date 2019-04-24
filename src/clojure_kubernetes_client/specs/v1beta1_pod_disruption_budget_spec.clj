(ns clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-pod-disruption-budget-spec-data v1beta1-pod-disruption-budget-spec)
(def v1beta1-pod-disruption-budget-spec-data
  {
   (ds/opt :maxUnavailable) any?
   (ds/opt :minAvailable) any?
   (ds/opt :selector) v1-label-selector
   })

(def v1beta1-pod-disruption-budget-spec
  (ds/spec
    {:name ::v1beta1-pod-disruption-budget-spec
     :spec v1beta1-pod-disruption-budget-spec-data}))

