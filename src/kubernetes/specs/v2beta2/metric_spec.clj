(ns kubernetes.specs.v2beta2/metric-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/external-metric-source :refer :all]
            [kubernetes.specs.v2beta2/object-metric-source :refer :all]
            [kubernetes.specs.v2beta2/pods-metric-source :refer :all]
            [kubernetes.specs.v2beta2/resource-metric-source :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/metric-spec-data
  {
   (ds/opt :external) v2beta2/external-metric-source-spec
   (ds/opt :object) v2beta2/object-metric-source-spec
   (ds/opt :pods) v2beta2/pods-metric-source-spec
   (ds/opt :resource) v2beta2/resource-metric-source-spec
   (ds/req :type) string?
   })

(def v2beta2/metric-spec-spec
  (ds/spec
    {:name ::v2beta2/metric-spec
     :spec v2beta2/metric-spec-data}))
