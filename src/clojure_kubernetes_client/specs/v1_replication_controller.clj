(ns clojure-kubernetes-client.specs.v1-replication-controller
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-replication-controller-data v1-replication-controller)
(def v1-replication-controller-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-replication-controller-spec
   (ds/opt :status) v1-replication-controller-status
   })

(def v1-replication-controller
  (ds/spec
    {:name ::v1-replication-controller
     :spec v1-replication-controller-data}))

