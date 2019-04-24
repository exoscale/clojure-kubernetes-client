(ns clojure-kubernetes-client.specs.v1-limit-range-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-limit-range-item-data v1-limit-range-item)
(def v1-limit-range-item-data
  {
   (ds/opt :default) (s/map-of string? string?)
   (ds/opt :defaultRequest) (s/map-of string? string?)
   (ds/opt :max) (s/map-of string? string?)
   (ds/opt :maxLimitRequestRatio) (s/map-of string? string?)
   (ds/opt :min) (s/map-of string? string?)
   (ds/opt :type) string?
   })

(def v1-limit-range-item
  (ds/spec
    {:name ::v1-limit-range-item
     :spec v1-limit-range-item-data}))

