(ns clojure-kubernetes-client.specs.v2beta2-metric-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-external-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-object-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-pods-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-resource-metric-source :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-metric-spec-data v2beta2-metric-spec)
(def v2beta2-metric-spec-data
  {
   (ds/opt :external) v2beta2-external-metric-source
   (ds/opt :object) v2beta2-object-metric-source
   (ds/opt :pods) v2beta2-pods-metric-source
   (ds/opt :resource) v2beta2-resource-metric-source
   (ds/req :type) string?
   })

(def v2beta2-metric-spec
  (ds/spec
    {:name ::v2beta2-metric-spec
     :spec v2beta2-metric-spec-data}))

