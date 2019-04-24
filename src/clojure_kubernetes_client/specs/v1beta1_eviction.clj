(ns clojure-kubernetes-client.specs.v1beta1-eviction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-delete-options :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-eviction-data v1beta1-eviction)
(def v1beta1-eviction-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :deleteOptions) v1-delete-options
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   })

(def v1beta1-eviction
  (ds/spec
    {:name ::v1beta1-eviction
     :spec v1beta1-eviction-data}))

