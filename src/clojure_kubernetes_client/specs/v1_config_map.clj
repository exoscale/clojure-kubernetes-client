(ns clojure-kubernetes-client.specs.v1-config-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-config-map-data v1-config-map)
(def v1-config-map-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :binaryData) (s/map-of string? any?)
   (ds/opt :data) (s/map-of string? string?)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   })

(def v1-config-map
  (ds/spec
    {:name ::v1-config-map
     :spec v1-config-map-data}))

