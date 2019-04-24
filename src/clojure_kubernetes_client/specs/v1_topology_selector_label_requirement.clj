(ns clojure-kubernetes-client.specs.v1-topology-selector-label-requirement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-topology-selector-label-requirement-data v1-topology-selector-label-requirement)
(def v1-topology-selector-label-requirement-data
  {
   (ds/req :key) string?
   (ds/req :values) (s/coll-of string?)
   })

(def v1-topology-selector-label-requirement
  (ds/spec
    {:name ::v1-topology-selector-label-requirement
     :spec v1-topology-selector-label-requirement-data}))

