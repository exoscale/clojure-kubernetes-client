(ns clojure-kubernetes-client.specs.apps-v1beta1-scale-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare apps-v1beta1-scale-status-data apps-v1beta1-scale-status)
(def apps-v1beta1-scale-status-data
  {
   (ds/req :replicas) int?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :targetSelector) string?
   })

(def apps-v1beta1-scale-status
  (ds/spec
    {:name ::apps-v1beta1-scale-status
     :spec apps-v1beta1-scale-status-data}))

