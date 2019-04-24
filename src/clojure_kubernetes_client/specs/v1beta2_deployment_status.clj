(ns clojure-kubernetes-client.specs.v1beta2-deployment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta2-deployment-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-deployment-status-data v1beta2-deployment-status)
(def v1beta2-deployment-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of v1beta2-deployment-condition)
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/opt :replicas) int?
   (ds/opt :unavailableReplicas) int?
   (ds/opt :updatedReplicas) int?
   })

(def v1beta2-deployment-status
  (ds/spec
    {:name ::v1beta2-deployment-status
     :spec v1beta2-deployment-status-data}))

