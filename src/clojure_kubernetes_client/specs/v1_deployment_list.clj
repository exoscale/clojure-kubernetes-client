(ns clojure-kubernetes-client.specs.v1-deployment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-deployment-list-data v1-deployment-list)
(def v1-deployment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-deployment)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-deployment-list
  (ds/spec
    {:name ::v1-deployment-list
     :spec v1-deployment-list-data}))

