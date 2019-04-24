(ns clojure-kubernetes-client.specs.v2beta2-resource-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-value-status :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-resource-metric-status-data v2beta2-resource-metric-status)
(def v2beta2-resource-metric-status-data
  {
   (ds/req :current) v2beta2-metric-value-status
   (ds/req :name) string?
   })

(def v2beta2-resource-metric-status
  (ds/spec
    {:name ::v2beta2-resource-metric-status
     :spec v2beta2-resource-metric-status-data}))

