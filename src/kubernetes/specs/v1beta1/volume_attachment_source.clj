(ns kubernetes.specs.v1beta1/volume-attachment-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/volume-attachment-source-data
  {
   (ds/opt :persistentVolumeName) string?
   })

(def v1beta1/volume-attachment-source-spec
  (ds/spec
    {:name ::v1beta1/volume-attachment-source
     :spec v1beta1/volume-attachment-source-data}))
