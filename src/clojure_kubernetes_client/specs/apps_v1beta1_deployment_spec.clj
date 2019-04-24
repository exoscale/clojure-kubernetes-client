(ns clojure-kubernetes-client.specs.apps-v1beta1-deployment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apps-v1beta1-rollback-config :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-deployment-spec-data apps-v1beta1-deployment-spec)
(def apps-v1beta1-deployment-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :paused) boolean?
   (ds/opt :progressDeadlineSeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/opt :rollbackTo) apps-v1beta1-rollback-config
   (ds/opt :selector) v1-label-selector
   (ds/opt :strategy) apps-v1beta1-deployment-strategy
   (ds/req :template) v1-pod-template-spec
   })

(def apps-v1beta1-deployment-spec
  (ds/spec
    {:name ::apps-v1beta1-deployment-spec
     :spec apps-v1beta1-deployment-spec-data}))

