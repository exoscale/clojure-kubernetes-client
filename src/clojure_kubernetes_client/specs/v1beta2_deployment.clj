(ns clojure-kubernetes-client.specs.v1beta2-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-deployment-data v1beta2-deployment)
(def v1beta2-deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta2-deployment-spec
   (ds/opt :status) v1beta2-deployment-status
   })

(def v1beta2-deployment
  (ds/spec
    {:name ::v1beta2-deployment
     :spec v1beta2-deployment-data}))

