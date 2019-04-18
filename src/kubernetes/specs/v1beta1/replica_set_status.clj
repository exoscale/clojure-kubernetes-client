(ns kubernetes.specs.v1beta1/replica-set-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/replica-set-condition :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/replica-set-status-data
  {
   (ds/opt :availableReplicas) int?
   (ds/opt :conditions) (s/coll-of v1beta1/replica-set-condition-spec)
   (ds/opt :fullyLabeledReplicas) int?
   (ds/opt :observedGeneration) int?
   (ds/opt :readyReplicas) int?
   (ds/req :replicas) int?
   })

(def v1beta1/replica-set-status-spec
  (ds/spec
    {:name ::v1beta1/replica-set-status
     :spec v1beta1/replica-set-status-data}))
