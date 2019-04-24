(ns clojure-kubernetes-client.specs.v1-resource-quota-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-resource-quota-list-data v1-resource-quota-list)
(def v1-resource-quota-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-resource-quota)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-resource-quota-list
  (ds/spec
    {:name ::v1-resource-quota-list
     :spec v1-resource-quota-list-data}))

