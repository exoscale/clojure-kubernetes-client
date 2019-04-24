(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-status :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-data extensions-v1beta1-deployment)
(def extensions-v1beta1-deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) extensions-v1beta1-deployment-spec
   (ds/opt :status) extensions-v1beta1-deployment-status
   })

(def extensions-v1beta1-deployment
  (ds/spec
    {:name ::extensions-v1beta1-deployment
     :spec extensions-v1beta1-deployment-data}))

