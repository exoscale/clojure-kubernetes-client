(ns kubernetes.specs.v1beta1/stateful-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/stateful-set-status-data
  {
   (ds/opt :collisionCount) int?
   (ds/opt :currentReplicas) int?
   (ds/opt :currentRevision) string?
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/req :replicas) int?
   (ds/opt :updateRevision) string?
   (ds/opt :updatedReplicas) int?
   })

(def v1beta1/stateful-set-status-spec
  (ds/spec
    {:name ::v1beta1/stateful-set-status
     :spec v1beta1/stateful-set-status-data}))
