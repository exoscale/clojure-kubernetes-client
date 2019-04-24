(ns clojure-kubernetes-client.specs.v1-replication-controller-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-replication-controller-spec-data v1-replication-controller-spec)
(def v1-replication-controller-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :template) v1-pod-template-spec
   })

(def v1-replication-controller-spec
  (ds/spec
    {:name ::v1-replication-controller-spec
     :spec v1-replication-controller-spec-data}))

