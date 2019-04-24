(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment-rollback
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-rollback-config :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-rollback-data extensions-v1beta1-deployment-rollback)
(def extensions-v1beta1-deployment-rollback-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/req :rollbackTo) extensions-v1beta1-rollback-config
   (ds/opt :updatedAnnotations) (s/map-of string? string?)
   })

(def extensions-v1beta1-deployment-rollback
  (ds/spec
    {:name ::extensions-v1beta1-deployment-rollback
     :spec extensions-v1beta1-deployment-rollback-data}))

