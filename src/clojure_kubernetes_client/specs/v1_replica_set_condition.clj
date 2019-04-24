(ns clojure-kubernetes-client.specs.v1-replica-set-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-replica-set-condition-data v1-replica-set-condition)
(def v1-replica-set-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-replica-set-condition
  (ds/spec
    {:name ::v1-replica-set-condition
     :spec v1-replica-set-condition-data}))

