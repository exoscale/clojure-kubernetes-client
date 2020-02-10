(ns clojure-kubernetes-client.specs.v1alpha1-volume-attachment-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-persistent-volume-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-volume-attachment-source-data v1alpha1-volume-attachment-source)
(def v1alpha1-volume-attachment-source-data
  {
   (ds/opt :inlineVolumeSpec) v1-persistent-volume-spec
   (ds/opt :persistentVolumeName) string?
   })

(def v1alpha1-volume-attachment-source
  (ds/spec
    {:name ::v1alpha1-volume-attachment-source
     :spec v1alpha1-volume-attachment-source-data}))

