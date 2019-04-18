(ns kubernetes.specs.v1beta1/pod-disruption-budget
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-spec :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/pod-disruption-budget-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1beta1/pod-disruption-budget-spec-spec
   (ds/opt :status) v1beta1/pod-disruption-budget-status-spec
   })

(def v1beta1/pod-disruption-budget-spec
  (ds/spec
    {:name ::v1beta1/pod-disruption-budget
     :spec v1beta1/pod-disruption-budget-data}))
