(ns kubernetes.specs.v1/glusterfs-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/glusterfs-volume-source-data
  {
   (ds/req :endpoints) string?
   (ds/req :path) string?
   (ds/opt :readOnly) boolean?
   })

(def v1/glusterfs-volume-source-spec
  (ds/spec
    {:name ::v1/glusterfs-volume-source
     :spec v1/glusterfs-volume-source-data}))
