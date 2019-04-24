(ns clojure-kubernetes-client.specs.v1-service
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-service-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-service-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-data v1-service)
(def v1-service-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-service-spec
   (ds/opt :status) v1-service-status
   })

(def v1-service
  (ds/spec
    {:name ::v1-service
     :spec v1-service-data}))

