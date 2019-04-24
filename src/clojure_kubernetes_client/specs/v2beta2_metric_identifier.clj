(ns clojure-kubernetes-client.specs.v2beta2-metric-identifier
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-metric-identifier-data v2beta2-metric-identifier)
(def v2beta2-metric-identifier-data
  {
   (ds/req :name) string?
   (ds/opt :selector) v1-label-selector
   })

(def v2beta2-metric-identifier
  (ds/spec
    {:name ::v2beta2-metric-identifier
     :spec v2beta2-metric-identifier-data}))

