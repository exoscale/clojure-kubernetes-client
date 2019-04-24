(ns clojure-kubernetes-client.specs.v1beta1-api-service
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-api-service-data v1beta1-api-service)
(def v1beta1-api-service-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-api-service-spec
   (ds/opt :status) v1beta1-api-service-status
   })

(def v1beta1-api-service
  (ds/spec
    {:name ::v1beta1-api-service
     :spec v1beta1-api-service-data}))

