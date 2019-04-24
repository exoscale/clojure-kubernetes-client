(ns clojure-kubernetes-client.specs.v1-azure-disk-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-azure-disk-volume-source-data v1-azure-disk-volume-source)
(def v1-azure-disk-volume-source-data
  {
   (ds/opt :cachingMode) string?
   (ds/req :diskName) string?
   (ds/req :diskURI) string?
   (ds/opt :fsType) string?
   (ds/opt :kind) string?
   (ds/opt :readOnly) boolean?
   })

(def v1-azure-disk-volume-source
  (ds/spec
    {:name ::v1-azure-disk-volume-source
     :spec v1-azure-disk-volume-source-data}))

