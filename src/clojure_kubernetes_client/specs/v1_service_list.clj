(ns clojure-kubernetes-client.specs.v1-service-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-service :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-list-data v1-service-list)
(def v1-service-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-service)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-service-list
  (ds/spec
    {:name ::v1-service-list
     :spec v1-service-list-data}))

