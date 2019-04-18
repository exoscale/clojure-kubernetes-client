(ns kubernetes.specs.v2beta1/resource-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta1/resource-metric-status-data
  {
   (ds/opt :currentAverageUtilization) int?
   (ds/req :currentAverageValue) string?
   (ds/req :name) string?
   })

(def v2beta1/resource-metric-status-spec
  (ds/spec
    {:name ::v2beta1/resource-metric-status
     :spec v2beta1/resource-metric-status-data}))
