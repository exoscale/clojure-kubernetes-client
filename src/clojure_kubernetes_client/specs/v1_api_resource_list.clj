(ns clojure-kubernetes-client.specs.v1-api-resource-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-api-resource :refer :all]
            )
  (:import (java.io File)))


(declare v1-api-resource-list-data v1-api-resource-list)
(def v1-api-resource-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :groupVersion) string?
   (ds/opt :kind) string?
   (ds/req :resources) (s/coll-of v1-api-resource)
   })

(def v1-api-resource-list
  (ds/spec
    {:name ::v1-api-resource-list
     :spec v1-api-resource-list-data}))

