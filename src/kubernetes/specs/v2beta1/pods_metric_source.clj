(ns kubernetes.specs.v2beta1/pods-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/pods-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/opt :selector) v1/label-selector-spec
   (ds/req :targetAverageValue) string?
   })

(def v2beta1/pods-metric-source-spec
  (ds/spec
    {:name ::v2beta1/pods-metric-source
     :spec v2beta1/pods-metric-source-data}))
