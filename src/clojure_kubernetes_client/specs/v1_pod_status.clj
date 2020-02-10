(ns clojure-kubernetes-client.specs.v1-pod-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-container-status :refer :all]
            [clojure-kubernetes-client.specs.v1-container-status :refer :all]
            [clojure-kubernetes-client.specs.v1-container-status :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-ip :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-status-data v1-pod-status)
(def v1-pod-status-data
  {
   (ds/opt :conditions) (s/coll-of v1-pod-condition)
   (ds/opt :containerStatuses) (s/coll-of v1-container-status)
   (ds/opt :ephemeralContainerStatuses) (s/coll-of v1-container-status)
   (ds/opt :hostIP) string?
   (ds/opt :initContainerStatuses) (s/coll-of v1-container-status)
   (ds/opt :message) string?
   (ds/opt :nominatedNodeName) string?
   (ds/opt :phase) string?
   (ds/opt :podIP) string?
   (ds/opt :podIPs) (s/coll-of v1-pod-ip)
   (ds/opt :qosClass) string?
   (ds/opt :reason) string?
   (ds/opt :startTime) inst?
   })

(def v1-pod-status
  (ds/spec
    {:name ::v1-pod-status
     :spec v1-pod-status-data}))

