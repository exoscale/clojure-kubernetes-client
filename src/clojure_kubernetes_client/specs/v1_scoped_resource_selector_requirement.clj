(ns clojure-kubernetes-client.specs.v1-scoped-resource-selector-requirement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-scoped-resource-selector-requirement-data v1-scoped-resource-selector-requirement)
(def v1-scoped-resource-selector-requirement-data
  {
   (ds/req :operator) string?
   (ds/req :scopeName) string?
   (ds/opt :values) (s/coll-of string?)
   })

(def v1-scoped-resource-selector-requirement
  (ds/spec
    {:name ::v1-scoped-resource-selector-requirement
     :spec v1-scoped-resource-selector-requirement-data}))

