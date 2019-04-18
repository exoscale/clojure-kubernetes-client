(ns kubernetes.specs.v2beta1/resource-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta1/resource-metric-source-data
  {
   (ds/req :name) string?
   (ds/opt :targetAverageUtilization) int?
   (ds/opt :targetAverageValue) string?
   })

(def v2beta1/resource-metric-source-spec
  (ds/spec
    {:name ::v2beta1/resource-metric-source
     :spec v2beta1/resource-metric-source-data}))
