(ns clojure-kubernetes-client.specs.v2beta1-pods-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-pods-metric-status-data v2beta1-pods-metric-status)
(def v2beta1-pods-metric-status-data
  {
   (ds/req :currentAverageValue) string?
   (ds/req :metricName) string?
   (ds/opt :selector) v1-label-selector
   })

(def v2beta1-pods-metric-status
  (ds/spec
    {:name ::v2beta1-pods-metric-status
     :spec v2beta1-pods-metric-status-data}))

