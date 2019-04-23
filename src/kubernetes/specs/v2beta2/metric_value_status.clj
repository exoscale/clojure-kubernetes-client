(ns kubernetes.specs.v2beta2/metric-value-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta2/metric-value-status-data
  {
   (ds/opt :averageUtilization) int?
   (ds/opt :averageValue) string?
   (ds/opt :value) string?
   })

(def v2beta2/metric-value-status-spec
  (ds/spec
    {:name ::v2beta2/metric-value-status
     :spec v2beta2/metric-value-status-data}))
