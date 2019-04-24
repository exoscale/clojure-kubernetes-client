(ns clojure-kubernetes-client.specs.v1beta1-daemon-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-daemon-set-status-data v1beta1-daemon-set-status)
(def v1beta1-daemon-set-status-data
  {
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of v1beta1-daemon-set-condition)
   (ds/req :currentNumberScheduled) int?
   (ds/req :desiredNumberScheduled) int?
   (ds/opt :numberAvailable) int?
   (ds/req :numberMisscheduled) int?
   (ds/req :numberReady) int?
   (ds/opt :numberUnavailable) int?
   (ds/opt :observedGeneration) int?
   (ds/opt :updatedNumberScheduled) int?
   })

(def v1beta1-daemon-set-status
  (ds/spec
    {:name ::v1beta1-daemon-set-status
     :spec v1beta1-daemon-set-status-data}))

