(ns clojure-kubernetes-client.specs.v2beta2-metric-target
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v2beta2-metric-target-data v2beta2-metric-target)
(def v2beta2-metric-target-data
  {
   (ds/opt :averageUtilization) int?
   (ds/opt :averageValue) string?
   (ds/req :type) string?
   (ds/opt :value) string?
   })

(def v2beta2-metric-target
  (ds/spec
    {:name ::v2beta2-metric-target
     :spec v2beta2-metric-target-data}))

