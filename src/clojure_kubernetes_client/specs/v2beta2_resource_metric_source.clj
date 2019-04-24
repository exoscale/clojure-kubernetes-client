(ns clojure-kubernetes-client.specs.v2beta2-resource-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-target :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-resource-metric-source-data v2beta2-resource-metric-source)
(def v2beta2-resource-metric-source-data
  {
   (ds/req :name) string?
   (ds/req :target) v2beta2-metric-target
   })

(def v2beta2-resource-metric-source
  (ds/spec
    {:name ::v2beta2-resource-metric-source
     :spec v2beta2-resource-metric-source-data}))

