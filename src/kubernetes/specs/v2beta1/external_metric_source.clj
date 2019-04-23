(ns kubernetes.specs.v2beta1/external-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/external-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/opt :metricSelector) v1/label-selector-spec
   (ds/opt :targetAverageValue) string?
   (ds/opt :targetValue) string?
   })

(def v2beta1/external-metric-source-spec
  (ds/spec
    {:name ::v2beta1/external-metric-source
     :spec v2beta1/external-metric-source-data}))
