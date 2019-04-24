(ns clojure-kubernetes-client.specs.v1-service-account-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-service-account :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-account-list-data v1-service-account-list)
(def v1-service-account-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-service-account)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-service-account-list
  (ds/spec
    {:name ::v1-service-account-list
     :spec v1-service-account-list-data}))

