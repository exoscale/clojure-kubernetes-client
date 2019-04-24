(ns clojure-kubernetes-client.specs.v1-volume-attachment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-attachment-data v1-volume-attachment)
(def v1-volume-attachment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-volume-attachment-spec
   (ds/opt :status) v1-volume-attachment-status
   })

(def v1-volume-attachment
  (ds/spec
    {:name ::v1-volume-attachment
     :spec v1-volume-attachment-data}))

