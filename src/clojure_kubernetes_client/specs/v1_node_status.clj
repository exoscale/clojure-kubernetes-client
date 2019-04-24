(ns clojure-kubernetes-client.specs.v1-node-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-address :refer :all]
            [clojure-kubernetes-client.specs.v1-node-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-node-config-status :refer :all]
            [clojure-kubernetes-client.specs.v1-node-daemon-endpoints :refer :all]
            [clojure-kubernetes-client.specs.v1-container-image :refer :all]
            [clojure-kubernetes-client.specs.v1-node-system-info :refer :all]
            [clojure-kubernetes-client.specs.v1-attached-volume :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-status-data v1-node-status)
(def v1-node-status-data
  {
   (ds/opt :addresses) (s/coll-of v1-node-address)
   (ds/opt :allocatable) (s/map-of string? string?)
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :conditions) (s/coll-of v1-node-condition)
   (ds/opt :config) v1-node-config-status
   (ds/opt :daemonEndpoints) v1-node-daemon-endpoints
   (ds/opt :images) (s/coll-of v1-container-image)
   (ds/opt :nodeInfo) v1-node-system-info
   (ds/opt :phase) string?
   (ds/opt :volumesAttached) (s/coll-of v1-attached-volume)
   (ds/opt :volumesInUse) (s/coll-of string?)
   })

(def v1-node-status
  (ds/spec
    {:name ::v1-node-status
     :spec v1-node-status-data}))

