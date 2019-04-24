(ns clojure-kubernetes-client.specs.v1-topology-selector-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-topology-selector-label-requirement :refer :all]
            )
  (:import (java.io File)))


(declare v1-topology-selector-term-data v1-topology-selector-term)
(def v1-topology-selector-term-data
  {
   (ds/opt :matchLabelExpressions) (s/coll-of v1-topology-selector-label-requirement)
   })

(def v1-topology-selector-term
  (ds/spec
    {:name ::v1-topology-selector-term
     :spec v1-topology-selector-term-data}))

