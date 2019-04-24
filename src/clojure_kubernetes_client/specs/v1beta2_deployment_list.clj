(ns clojure-kubernetes-client.specs.v1beta2-deployment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta2-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-deployment-list-data v1beta2-deployment-list)
(def v1beta2-deployment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta2-deployment)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta2-deployment-list
  (ds/spec
    {:name ::v1beta2-deployment-list
     :spec v1beta2-deployment-list-data}))

