(ns clojure-kubernetes-client.specs.v2beta2-object-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-value-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-cross-version-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-identifier :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-object-metric-status-data v2beta2-object-metric-status)
(def v2beta2-object-metric-status-data
  {
   (ds/req :current) v2beta2-metric-value-status
   (ds/req :describedObject) v2beta2-cross-version-object-reference
   (ds/req :metric) v2beta2-metric-identifier
   })

(def v2beta2-object-metric-status
  (ds/spec
    {:name ::v2beta2-object-metric-status
     :spec v2beta2-object-metric-status-data}))

