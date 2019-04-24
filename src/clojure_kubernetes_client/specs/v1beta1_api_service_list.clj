(ns clojure-kubernetes-client.specs.v1beta1-api-service-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-api-service-list-data v1beta1-api-service-list)
(def v1beta1-api-service-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1-api-service)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta1-api-service-list
  (ds/spec
    {:name ::v1beta1-api-service-list
     :spec v1beta1-api-service-list-data}))

