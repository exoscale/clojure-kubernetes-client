(ns clojure-kubernetes-client.specs.v1-replication-controller-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-replication-controller-list-data v1-replication-controller-list)
(def v1-replication-controller-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-replication-controller)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-replication-controller-list
  (ds/spec
    {:name ::v1-replication-controller-list
     :spec v1-replication-controller-list-data}))

