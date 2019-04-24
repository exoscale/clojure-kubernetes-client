(ns clojure-kubernetes-client.specs.v1beta1-volume-attachment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-volume-attachment-list-data v1beta1-volume-attachment-list)
(def v1beta1-volume-attachment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1-volume-attachment)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta1-volume-attachment-list
  (ds/spec
    {:name ::v1beta1-volume-attachment-list
     :spec v1beta1-volume-attachment-list-data}))

