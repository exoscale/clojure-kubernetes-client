(ns clojure-kubernetes-client.specs.apps-v1beta1-deployment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-deployment-list-data apps-v1beta1-deployment-list)
(def apps-v1beta1-deployment-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of apps-v1beta1-deployment)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def apps-v1beta1-deployment-list
  (ds/spec
    {:name ::apps-v1beta1-deployment-list
     :spec apps-v1beta1-deployment-list-data}))

