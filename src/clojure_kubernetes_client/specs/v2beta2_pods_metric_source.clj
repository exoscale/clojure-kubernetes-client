(ns clojure-kubernetes-client.specs.v2beta2-pods-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-metric-identifier :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-target :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-pods-metric-source-data v2beta2-pods-metric-source)
(def v2beta2-pods-metric-source-data
  {
   (ds/req :metric) v2beta2-metric-identifier
   (ds/req :target) v2beta2-metric-target
   })

(def v2beta2-pods-metric-source
  (ds/spec
    {:name ::v2beta2-pods-metric-source
     :spec v2beta2-pods-metric-source-data}))

