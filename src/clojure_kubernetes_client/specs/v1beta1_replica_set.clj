(ns clojure-kubernetes-client.specs.v1beta1-replica-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-replica-set-data v1beta1-replica-set)
(def v1beta1-replica-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-replica-set-spec
   (ds/opt :status) v1beta1-replica-set-status
   })

(def v1beta1-replica-set
  (ds/spec
    {:name ::v1beta1-replica-set
     :spec v1beta1-replica-set-data}))

