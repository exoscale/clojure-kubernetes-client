(ns kubernetes.specs.v2beta2/object-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/metric-value-status :refer :all]
            [kubernetes.specs.v2beta2/cross-version-object-reference :refer :all]
            [kubernetes.specs.v2beta2/metric-identifier :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/object-metric-status-data
  {
   (ds/req :current) v2beta2/metric-value-status-spec
   (ds/req :describedObject) v2beta2/cross-version-object-reference-spec
   (ds/req :metric) v2beta2/metric-identifier-spec
   })

(def v2beta2/object-metric-status-spec
  (ds/spec
    {:name ::v2beta2/object-metric-status
     :spec v2beta2/object-metric-status-data}))
