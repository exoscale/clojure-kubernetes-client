(ns clojure-kubernetes-client.specs.v1-endpoints-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-endpoints-list-data v1-endpoints-list)
(def v1-endpoints-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-endpoints)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-endpoints-list
  (ds/spec
    {:name ::v1-endpoints-list
     :spec v1-endpoints-list-data}))

