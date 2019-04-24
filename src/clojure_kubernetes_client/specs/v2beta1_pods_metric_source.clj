(ns clojure-kubernetes-client.specs.v2beta1-pods-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-pods-metric-source-data v2beta1-pods-metric-source)
(def v2beta1-pods-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/opt :selector) v1-label-selector
   (ds/req :targetAverageValue) string?
   })

(def v2beta1-pods-metric-source
  (ds/spec
    {:name ::v2beta1-pods-metric-source
     :spec v2beta1-pods-metric-source-data}))

