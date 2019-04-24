(ns clojure-kubernetes-client.specs.v2beta1-object-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-object-metric-status-data v2beta1-object-metric-status)
(def v2beta1-object-metric-status-data
  {
   (ds/opt :averageValue) string?
   (ds/req :currentValue) string?
   (ds/req :metricName) string?
   (ds/opt :selector) v1-label-selector
   (ds/req :target) v2beta1-cross-version-object-reference
   })

(def v2beta1-object-metric-status
  (ds/spec
    {:name ::v2beta1-object-metric-status
     :spec v2beta1-object-metric-status-data}))

