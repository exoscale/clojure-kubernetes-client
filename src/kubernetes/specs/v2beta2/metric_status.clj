(ns kubernetes.specs.v2beta2/metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/external-metric-status :refer :all]
            [kubernetes.specs.v2beta2/object-metric-status :refer :all]
            [kubernetes.specs.v2beta2/pods-metric-status :refer :all]
            [kubernetes.specs.v2beta2/resource-metric-status :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/metric-status-data
  {
   (ds/opt :external) v2beta2/external-metric-status-spec
   (ds/opt :object) v2beta2/object-metric-status-spec
   (ds/opt :pods) v2beta2/pods-metric-status-spec
   (ds/opt :resource) v2beta2/resource-metric-status-spec
   (ds/req :type) string?
   })

(def v2beta2/metric-status-spec
  (ds/spec
    {:name ::v2beta2/metric-status
     :spec v2beta2/metric-status-data}))
