(ns kubernetes.specs.v1/node-selector-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-selector-requirement :refer :all]
            [kubernetes.specs.v1/node-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(def v1/node-selector-term-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1/node-selector-requirement-spec)
   (ds/opt :matchFields) (s/coll-of v1/node-selector-requirement-spec)
   })

(def v1/node-selector-term-spec
  (ds/spec
    {:name ::v1/node-selector-term
     :spec v1/node-selector-term-data}))
