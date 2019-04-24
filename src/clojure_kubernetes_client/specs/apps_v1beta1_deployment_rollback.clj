(ns clojure-kubernetes-client.specs.apps-v1beta1-deployment-rollback
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apps-v1beta1-rollback-config :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-deployment-rollback-data apps-v1beta1-deployment-rollback)
(def apps-v1beta1-deployment-rollback-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/req :rollbackTo) apps-v1beta1-rollback-config
   (ds/opt :updatedAnnotations) (s/map-of string? string?)
   })

(def apps-v1beta1-deployment-rollback
  (ds/spec
    {:name ::apps-v1beta1-deployment-rollback
     :spec apps-v1beta1-deployment-rollback-data}))

