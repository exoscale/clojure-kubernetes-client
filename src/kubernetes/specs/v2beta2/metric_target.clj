(ns kubernetes.specs.v2beta2/metric-target
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta2/metric-target-data
  {
   (ds/opt :averageUtilization) int?
   (ds/opt :averageValue) string?
   (ds/req :type) string?
   (ds/opt :value) string?
   })

(def v2beta2/metric-target-spec
  (ds/spec
    {:name ::v2beta2/metric-target
     :spec v2beta2/metric-target-data}))
