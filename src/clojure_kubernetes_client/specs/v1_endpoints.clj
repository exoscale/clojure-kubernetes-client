(ns clojure-kubernetes-client.specs.v1-endpoints
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-subset :refer :all]
            )
  (:import (java.io File)))


(declare v1-endpoints-data v1-endpoints)
(def v1-endpoints-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :subsets) (s/coll-of v1-endpoint-subset)
   })

(def v1-endpoints
  (ds/spec
    {:name ::v1-endpoints
     :spec v1-endpoints-data}))

