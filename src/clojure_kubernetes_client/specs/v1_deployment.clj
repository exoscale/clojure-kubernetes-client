(ns clojure-kubernetes-client.specs.v1-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-deployment-data v1-deployment)
(def v1-deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-deployment-spec
   (ds/opt :status) v1-deployment-status
   })

(def v1-deployment
  (ds/spec
    {:name ::v1-deployment
     :spec v1-deployment-data}))

