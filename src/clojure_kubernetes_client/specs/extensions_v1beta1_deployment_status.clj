(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-condition :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-status-data extensions-v1beta1-deployment-status)
(def extensions-v1beta1-deployment-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of extensions-v1beta1-deployment-condition)
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/opt :replicas) int?
   (ds/opt :unavailableReplicas) int?
   (ds/opt :updatedReplicas) int?
   })

(def extensions-v1beta1-deployment-status
  (ds/spec
    {:name ::extensions-v1beta1-deployment-status
     :spec extensions-v1beta1-deployment-status-data}))

