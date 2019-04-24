(ns clojure-kubernetes-client.specs.v1-label-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector-requirement :refer :all]
            )
  (:import (java.io File)))


(declare v1-label-selector-data v1-label-selector)
(def v1-label-selector-data
  {
   (ds/opt :matchExpressions) (s/coll-of v1-label-selector-requirement)
   (ds/opt :matchLabels) (s/map-of string? string?)
   })

(def v1-label-selector
  (ds/spec
    {:name ::v1-label-selector
     :spec v1-label-selector-data}))

