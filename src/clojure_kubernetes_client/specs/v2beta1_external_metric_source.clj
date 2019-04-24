(ns clojure-kubernetes-client.specs.v2beta1-external-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-external-metric-source-data v2beta1-external-metric-source)
(def v2beta1-external-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/opt :metricSelector) v1-label-selector
   (ds/opt :targetAverageValue) string?
   (ds/opt :targetValue) string?
   })

(def v2beta1-external-metric-source
  (ds/spec
    {:name ::v2beta1-external-metric-source
     :spec v2beta1-external-metric-source-data}))

