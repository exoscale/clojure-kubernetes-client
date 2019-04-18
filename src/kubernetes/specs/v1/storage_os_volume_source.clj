(ns kubernetes.specs.v1/storage-os-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1/storage-os-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1/local-object-reference-spec
   (ds/opt :volumeName) string?
   (ds/opt :volumeNamespace) string?
   })

(def v1/storage-os-volume-source-spec
  (ds/spec
    {:name ::v1/storage-os-volume-source
     :spec v1/storage-os-volume-source-data}))
