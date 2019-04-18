(ns kubernetes.specs.v1/label-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(def v1/label-selector-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1/label-selector-requirement-spec)
   (ds/opt :matchLabels) (s/map-of string? string?)
   })

(def v1/label-selector-spec
  (ds/spec
    {:name ::v1/label-selector
     :spec v1/label-selector-data}))
