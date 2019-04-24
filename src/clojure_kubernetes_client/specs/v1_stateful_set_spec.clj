(ns clojure-kubernetes-client.specs.v1-stateful-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]
            )
  (:import (java.io File)))


(declare v1-stateful-set-spec-data v1-stateful-set-spec)
(def v1-stateful-set-spec-data
  {
   (ds/opt :podManagementPolicy) string?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/req :selector) v1-label-selector
   (ds/req :serviceName) string?
   (ds/req :template) v1-pod-template-spec
   (ds/opt :updateStrategy) v1-stateful-set-update-strategy
   (ds/opt :volumeClaimTemplates) (s/coll-of v1-persistent-volume-claim)
   })

(def v1-stateful-set-spec
  (ds/spec
    {:name ::v1-stateful-set-spec
     :spec v1-stateful-set-spec-data}))

