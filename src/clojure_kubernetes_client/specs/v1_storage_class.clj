(ns clojure-kubernetes-client.specs.v1-storage-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-topology-selector-term :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-storage-class-data v1-storage-class)
(def v1-storage-class-data
  {
   (ds/opt :allowVolumeExpansion) boolean?
   (ds/opt :allowedTopologies) (s/coll-of v1-topology-selector-term)
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :mountOptions) (s/coll-of string?)
   (ds/opt :parameters) (s/map-of string? string?)
   (ds/req :provisioner) string?
   (ds/opt :reclaimPolicy) string?
   (ds/opt :volumeBindingMode) string?
   })

(def v1-storage-class
  (ds/spec
    {:name ::v1-storage-class
     :spec v1-storage-class-data}))

