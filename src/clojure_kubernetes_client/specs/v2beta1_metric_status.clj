(ns clojure-kubernetes-client.specs.v2beta1-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta1-external-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-object-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-pods-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-resource-metric-status :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-metric-status-data v2beta1-metric-status)
(def v2beta1-metric-status-data
  {
   (ds/opt :external) v2beta1-external-metric-status
   (ds/opt :object) v2beta1-object-metric-status
   (ds/opt :pods) v2beta1-pods-metric-status
   (ds/opt :resource) v2beta1-resource-metric-status
   (ds/req :type) string?
   })

(def v2beta1-metric-status
  (ds/spec
    {:name ::v2beta1-metric-status
     :spec v2beta1-metric-status-data}))

