(ns clojure-kubernetes-client.specs.v2beta2-external-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-value-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-identifier :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-external-metric-status-data v2beta2-external-metric-status)
(def v2beta2-external-metric-status-data
  {
   (ds/req :current) v2beta2-metric-value-status
   (ds/req :metric) v2beta2-metric-identifier
   })

(def v2beta2-external-metric-status
  (ds/spec
    {:name ::v2beta2-external-metric-status
     :spec v2beta2-external-metric-status-data}))

