(ns kubernetes.specs.v2beta1/metric-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta1/external-metric-source :refer :all]
            [kubernetes.specs.v2beta1/object-metric-source :refer :all]
            [kubernetes.specs.v2beta1/pods-metric-source :refer :all]
            [kubernetes.specs.v2beta1/resource-metric-source :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/metric-spec-data
  {
   (ds/opt :external) v2beta1/external-metric-source-spec
   (ds/opt :object) v2beta1/object-metric-source-spec
   (ds/opt :pods) v2beta1/pods-metric-source-spec
   (ds/opt :resource) v2beta1/resource-metric-source-spec
   (ds/req :type) string?
   })

(def v2beta1/metric-spec-spec
  (ds/spec
    {:name ::v2beta1/metric-spec
     :spec v2beta1/metric-spec-data}))
