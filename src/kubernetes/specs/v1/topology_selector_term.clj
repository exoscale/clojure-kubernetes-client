(ns kubernetes.specs.v1/topology-selector-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/topology-selector-label-requirement :refer :all]
            )
  (:import (java.io File)))


(def v1/topology-selector-term-data
  {
   (ds/opt :matchLabelExpressions) (s/coll-of v1/topology-selector-label-requirement-spec)
   })

(def v1/topology-selector-term-spec
  (ds/spec
    {:name ::v1/topology-selector-term
     :spec v1/topology-selector-term-data}))
