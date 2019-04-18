(ns kubernetes.specs.v2beta1/object-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta1/cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/object-metric-status-data
  {
   (ds/req :currentValue) string?
   (ds/req :metricName) string?
   (ds/req :target) v2beta1/cross-version-object-reference-spec
   })

(def v2beta1/object-metric-status-spec
  (ds/spec
    {:name ::v2beta1/object-metric-status
     :spec v2beta1/object-metric-status-data}))
