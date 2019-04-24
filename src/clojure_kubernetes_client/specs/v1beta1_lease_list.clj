(ns clojure-kubernetes-client.specs.v1beta1-lease-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-lease :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-lease-list-data v1beta1-lease-list)
(def v1beta1-lease-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1-lease)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta1-lease-list
  (ds/spec
    {:name ::v1beta1-lease-list
     :spec v1beta1-lease-list-data}))

