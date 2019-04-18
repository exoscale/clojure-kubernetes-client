(ns kubernetes.specs.v2beta1/pods-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta1/pods-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/req :targetAverageValue) string?
   })

(def v2beta1/pods-metric-source-spec
  (ds/spec
    {:name ::v2beta1/pods-metric-source
     :spec v2beta1/pods-metric-source-data}))
