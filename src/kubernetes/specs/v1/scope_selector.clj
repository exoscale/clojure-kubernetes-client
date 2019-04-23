(ns kubernetes.specs.v1/scope-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/scoped-resource-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(def v1/scope-selector-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1/scoped-resource-selector-requirement-spec)
   })

(def v1/scope-selector-spec
  (ds/spec
    {:name ::v1/scope-selector
     :spec v1/scope-selector-data}))
