(ns kubernetes.specs.v2beta2/object-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta2/cross-version-object-reference :refer :all]
            [kubernetes.specs.v2beta2/metric-identifier :refer :all]
            [kubernetes.specs.v2beta2/metric-target :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/object-metric-source-data
  {
   (ds/req :describedObject) v2beta2/cross-version-object-reference-spec
   (ds/req :metric) v2beta2/metric-identifier-spec
   (ds/req :target) v2beta2/metric-target-spec
   })

(def v2beta2/object-metric-source-spec
  (ds/spec
    {:name ::v2beta2/object-metric-source
     :spec v2beta2/object-metric-source-data}))
