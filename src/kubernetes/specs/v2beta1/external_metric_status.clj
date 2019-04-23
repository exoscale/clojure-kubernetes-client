(ns kubernetes.specs.v2beta1/external-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/external-metric-status-data
  {
   (ds/opt :currentAverageValue) string?
   (ds/req :currentValue) string?
   (ds/req :metricName) string?
   (ds/opt :metricSelector) v1/label-selector-spec
   })

(def v2beta1/external-metric-status-spec
  (ds/spec
    {:name ::v2beta1/external-metric-status
     :spec v2beta1/external-metric-status-data}))
