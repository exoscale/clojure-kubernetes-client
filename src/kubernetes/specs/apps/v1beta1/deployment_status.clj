(ns kubernetes.specs.apps/v1beta1/deployment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apps/v1beta1/deployment-condition :refer :all]
            )
  (:import (java.io File)))


(def apps/v1beta1/deployment-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :collisionCount) int?
   (ds/opt :conditions) (s/coll-of apps/v1beta1/deployment-condition-spec)
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/opt :replicas) int?
   (ds/opt :unavailableReplicas) int?
   (ds/opt :updatedReplicas) int?
   })

(def apps/v1beta1/deployment-status-spec
  (ds/spec
    {:name ::apps/v1beta1/deployment-status
     :spec apps/v1beta1/deployment-status-data}))
