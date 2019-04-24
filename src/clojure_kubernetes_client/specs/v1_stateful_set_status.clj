(ns clojure-kubernetes-client.specs.v1-stateful-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-stateful-set-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-stateful-set-status-data v1-stateful-set-status)
(def v1-stateful-set-status-data
  {
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of v1-stateful-set-condition)
   (ds/opt :currentReplicas) int?
   (ds/opt :currentRevision) string?
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/req :replicas) int?
   (ds/opt :updateRevision) string?
   (ds/opt :updatedReplicas) int?
   })

(def v1-stateful-set-status
  (ds/spec
    {:name ::v1-stateful-set-status
     :spec v1-stateful-set-status-data}))

