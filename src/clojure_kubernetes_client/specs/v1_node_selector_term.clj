(ns clojure-kubernetes-client.specs.v1-node-selector-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-selector-requirement :refer :all]
            [clojure-kubernetes-client.specs.v1-node-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-selector-term-data v1-node-selector-term)
(def v1-node-selector-term-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1-node-selector-requirement)
   (ds/opt :matchFields) (s/coll-of v1-node-selector-requirement)
   })

(def v1-node-selector-term
  (ds/spec
    {:name ::v1-node-selector-term
     :spec v1-node-selector-term-data}))

