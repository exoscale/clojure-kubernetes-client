(ns kubernetes.specs.v1/daemon-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/daemon-set-condition :refer :all]
            )
  (:import (java.io File)))


(def v1/daemon-set-status-data
  {
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of v1/daemon-set-condition-spec)
   (ds/req :currentNumberScheduled) int?
   (ds/req :desiredNumberScheduled) int?
   (ds/opt :numberAvailable) int?
   (ds/req :numberMisscheduled) int?
   (ds/req :numberReady) int?
   (ds/opt :numberUnavailable) int?
   (ds/opt :observedGeneration) int?
   (ds/opt :updatedNumberScheduled) int?
   })

(def v1/daemon-set-status-spec
  (ds/spec
    {:name ::v1/daemon-set-status
     :spec v1/daemon-set-status-data}))
