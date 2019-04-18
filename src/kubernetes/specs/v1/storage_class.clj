(ns kubernetes.specs.v1/storage-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/storage-class-data
  {
   (ds/opt :allowVolumeExpansion) boolean?
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :mountOptions) (s/coll-of string?)
   (ds/opt :parameters) (s/map-of string? string?)
   (ds/req :provisioner) string?
   (ds/opt :reclaimPolicy) string?
   })

(def v1/storage-class-spec
  (ds/spec
    {:name ::v1/storage-class
     :spec v1/storage-class-data}))
