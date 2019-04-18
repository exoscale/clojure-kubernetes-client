(ns kubernetes.specs.v1beta1/pod-disruption-budget-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            [kubernetes.specs. :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/pod-disruption-budget-spec-data
  {
   (ds/opt :maxUnavailable) any?
   (ds/opt :minAvailable) any?
   (ds/opt :selector) v1/label-selector-spec
   })

(def v1beta1/pod-disruption-budget-spec-spec
  (ds/spec
    {:name ::v1beta1/pod-disruption-budget-spec
     :spec v1beta1/pod-disruption-budget-spec-data}))
