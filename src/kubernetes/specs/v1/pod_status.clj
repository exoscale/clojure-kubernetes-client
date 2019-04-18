(ns kubernetes.specs.v1/pod-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/pod-condition :refer :all]
            [kubernetes.specs.v1/container-status :refer :all]
            [kubernetes.specs.v1/container-status :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-status-data
  {
   (ds/opt :conditions) (s/coll-of v1/pod-condition-spec)
   (ds/opt :containerStatuses) (s/coll-of v1/container-status-spec)
   (ds/opt :hostIP) string?
   (ds/opt :initContainerStatuses) (s/coll-of v1/container-status-spec)
   (ds/opt :message) string?
   (ds/opt :phase) string?
   (ds/opt :podIP) string?
   (ds/opt :qosClass) string?
   (ds/opt :reason) string?
   (ds/opt :startTime) inst?
   })

(def v1/pod-status-spec
  (ds/spec
    {:name ::v1/pod-status
     :spec v1/pod-status-data}))
