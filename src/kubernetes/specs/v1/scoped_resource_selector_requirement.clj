(ns kubernetes.specs.v1/scoped-resource-selector-requirement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/scoped-resource-selector-requirement-data
  {
   (ds/req :operator) string?
   (ds/req :scopeName) string?
   (ds/opt :values) (s/coll-of string?)
   })

(def v1/scoped-resource-selector-requirement-spec
  (ds/spec
    {:name ::v1/scoped-resource-selector-requirement
     :spec v1/scoped-resource-selector-requirement-data}))
