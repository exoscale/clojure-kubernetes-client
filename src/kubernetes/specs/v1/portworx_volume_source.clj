(ns kubernetes.specs.v1/portworx-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/portworx-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/req :volumeID) string?
   })

(def v1/portworx-volume-source-spec
  (ds/spec
    {:name ::v1/portworx-volume-source
     :spec v1/portworx-volume-source-data}))
