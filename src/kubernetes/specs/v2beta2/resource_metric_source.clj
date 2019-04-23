(ns kubernetes.specs.v2beta2/resource-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/metric-target :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/resource-metric-source-data
  {
   (ds/req :name) string?
   (ds/req :target) v2beta2/metric-target-spec
   })

(def v2beta2/resource-metric-source-spec
  (ds/spec
    {:name ::v2beta2/resource-metric-source
     :spec v2beta2/resource-metric-source-data}))
