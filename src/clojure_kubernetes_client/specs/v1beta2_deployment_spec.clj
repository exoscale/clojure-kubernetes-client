(ns clojure-kubernetes-client.specs.v1beta2-deployment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-deployment-spec-data v1beta2-deployment-spec)
(def v1beta2-deployment-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :paused) boolean?
   (ds/opt :progressDeadlineSeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/req :selector) v1-label-selector
   (ds/opt :strategy) v1beta2-deployment-strategy
   (ds/req :template) v1-pod-template-spec
   })

(def v1beta2-deployment-spec
  (ds/spec
    {:name ::v1beta2-deployment-spec
     :spec v1beta2-deployment-spec-data}))

