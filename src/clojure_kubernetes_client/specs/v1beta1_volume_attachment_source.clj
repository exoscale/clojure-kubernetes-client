(ns clojure-kubernetes-client.specs.v1beta1-volume-attachment-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-volume-attachment-source-data v1beta1-volume-attachment-source)
(def v1beta1-volume-attachment-source-data
  {
   (ds/opt :persistentVolumeName) string?
   })

(def v1beta1-volume-attachment-source
  (ds/spec
    {:name ::v1beta1-volume-attachment-source
     :spec v1beta1-volume-attachment-source-data}))

