(ns kubernetes.specs.v1/topology-selector-label-requirement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/topology-selector-label-requirement-data
  {
   (ds/req :key) string?
   (ds/req :values) (s/coll-of string?)
   })

(def v1/topology-selector-label-requirement-spec
  (ds/spec
    {:name ::v1/topology-selector-label-requirement
     :spec v1/topology-selector-label-requirement-data}))
