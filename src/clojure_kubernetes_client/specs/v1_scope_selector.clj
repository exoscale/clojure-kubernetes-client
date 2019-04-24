(ns clojure-kubernetes-client.specs.v1-scope-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-scoped-resource-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(declare v1-scope-selector-data v1-scope-selector)
(def v1-scope-selector-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1-scoped-resource-selector-requirement)
   })

(def v1-scope-selector
  (ds/spec
    {:name ::v1-scope-selector
     :spec v1-scope-selector-data}))

