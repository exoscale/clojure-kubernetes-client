(ns clojure-kubernetes-client.specs.v1-replication-controller-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-replication-controller-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-replication-controller-status-data v1-replication-controller-status)
(def v1-replication-controller-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :conditions) (s/coll-of v1-replication-controller-condition)
   (ds/opt :fullyLabeledReplicas) int?
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/req :replicas) int?
   })

(def v1-replication-controller-status
  (ds/spec
    {:name ::v1-replication-controller-status
     :spec v1-replication-controller-status-data}))

