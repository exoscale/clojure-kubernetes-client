(ns clojure-kubernetes-client.specs.v1-secret
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-secret-data v1-secret)
(def v1-secret-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :data) (s/map-of string? any?)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :stringData) (s/map-of string? string?)
   (ds/opt :type) string?
   })

(def v1-secret
  (ds/spec
    {:name ::v1-secret
     :spec v1-secret-data}))

