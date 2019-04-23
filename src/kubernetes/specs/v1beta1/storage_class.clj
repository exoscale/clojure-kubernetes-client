(ns kubernetes.specs.v1beta1/storage-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/topology-selector-term :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/storage-class-data
  {
   (ds/opt :allowVolumeExpansion) boolean?
   (ds/opt :allowedTopologies) (s/coll-of v1/topology-selector-term-spec)
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :mountOptions) (s/coll-of string?)
   (ds/opt :parameters) (s/map-of string? string?)
   (ds/req :provisioner) string?
   (ds/opt :reclaimPolicy) string?
   (ds/opt :volumeBindingMode) string?
   })

(def v1beta1/storage-class-spec
  (ds/spec
    {:name ::v1beta1/storage-class
     :spec v1beta1/storage-class-data}))
