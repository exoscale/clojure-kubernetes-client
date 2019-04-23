(ns kubernetes.specs.v2beta2/resource-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/metric-value-status :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/resource-metric-status-data
  {
   (ds/req :current) v2beta2/metric-value-status-spec
   (ds/req :name) string?
   })

(def v2beta2/resource-metric-status-spec
  (ds/spec
    {:name ::v2beta2/resource-metric-status
     :spec v2beta2/resource-metric-status-data}))
