(ns kubernetes.specs.v2beta2/metric-identifier
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v2beta2/metric-identifier-data
  {
   (ds/req :name) string?
   (ds/opt :selector) v1/label-selector-spec
   })

(def v2beta2/metric-identifier-spec
  (ds/spec
    {:name ::v2beta2/metric-identifier
     :spec v2beta2/metric-identifier-data}))
