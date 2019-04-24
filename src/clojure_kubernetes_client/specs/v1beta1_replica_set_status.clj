(ns clojure-kubernetes-client.specs.v1beta1-replica-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-replica-set-status-data v1beta1-replica-set-status)
(def v1beta1-replica-set-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :conditions) (s/coll-of v1beta1-replica-set-condition)
   (ds/opt :fullyLabeledReplicas) int?
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/req :replicas) int?
   })

(def v1beta1-replica-set-status
  (ds/spec
    {:name ::v1beta1-replica-set-status
     :spec v1beta1-replica-set-status-data}))

