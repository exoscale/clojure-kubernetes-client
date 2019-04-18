(ns kubernetes.specs.v1/node-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-address :refer :all]
            [kubernetes.specs.v1/node-condition :refer :all]
            [kubernetes.specs.v1/node-daemon-endpoints :refer :all]
            [kubernetes.specs.v1/container-image :refer :all]
            [kubernetes.specs.v1/node-system-info :refer :all]
            [kubernetes.specs.v1/attached-volume :refer :all]
            )
  (:import (java.io File)))


(def v1/node-status-data
  {
   (ds/opt :addresses) (s/coll-of v1/node-address-spec)
   (ds/opt :allocatable) (s/map-of string? string?)
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :conditions) (s/coll-of v1/node-condition-spec)
   (ds/opt :daemonEndpoints) v1/node-daemon-endpoints-spec
   (ds/opt :images) (s/coll-of v1/container-image-spec)
   (ds/opt :nodeInfo) v1/node-system-info-spec
   (ds/opt :phase) string?
   (ds/opt :volumesAttached) (s/coll-of v1/attached-volume-spec)
   (ds/opt :volumesInUse) (s/coll-of string?)
   })

(def v1/node-status-spec
  (ds/spec
    {:name ::v1/node-status
     :spec v1/node-status-data}))
