(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-list-data extensions-v1beta1-deployment-list)
(def extensions-v1beta1-deployment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of extensions-v1beta1-deployment)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def extensions-v1beta1-deployment-list
  (ds/spec
    {:name ::extensions-v1beta1-deployment-list
     :spec extensions-v1beta1-deployment-list-data}))

