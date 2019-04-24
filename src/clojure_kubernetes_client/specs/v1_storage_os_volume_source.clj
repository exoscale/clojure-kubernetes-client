(ns clojure-kubernetes-client.specs.v1-storage-os-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-storage-os-volume-source-data v1-storage-os-volume-source)
(def v1-storage-os-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-local-object-reference
   (ds/opt :volumeName) string?
   (ds/opt :volumeNamespace) string?
   })

(def v1-storage-os-volume-source
  (ds/spec
    {:name ::v1-storage-os-volume-source
     :spec v1-storage-os-volume-source-data}))

