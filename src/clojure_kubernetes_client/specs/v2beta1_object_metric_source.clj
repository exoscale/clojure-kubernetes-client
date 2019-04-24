(ns clojure-kubernetes-client.specs.v2beta1-object-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-object-metric-source-data v2beta1-object-metric-source)
(def v2beta1-object-metric-source-data
  {
   (ds/opt :averageValue) string?
   (ds/req :metricName) string?
   (ds/opt :selector) v1-label-selector
   (ds/req :target) v2beta1-cross-version-object-reference
   (ds/req :targetValue) string?
   })

(def v2beta1-object-metric-source
  (ds/spec
    {:name ::v2beta1-object-metric-source
     :spec v2beta1-object-metric-source-data}))

