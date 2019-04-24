(ns clojure-kubernetes-client.specs.v1-pod-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-pod-condition-data v1-pod-condition)
(def v1-pod-condition-data
  {
   (ds/opt :lastProbeTime) inst?
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-pod-condition
  (ds/spec
    {:name ::v1-pod-condition
     :spec v1-pod-condition-data}))

