(ns clojure-kubernetes-client.specs.v1-pod-readiness-gate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-pod-readiness-gate-data v1-pod-readiness-gate)
(def v1-pod-readiness-gate-data
  {
   (ds/req :conditionType) string?
   })

(def v1-pod-readiness-gate
  (ds/spec
    {:name ::v1-pod-readiness-gate
     :spec v1-pod-readiness-gate-data}))

