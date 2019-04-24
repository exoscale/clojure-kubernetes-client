(ns clojure-kubernetes-client.specs.extensions-v1beta1-scale-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-scale-status-data extensions-v1beta1-scale-status)
(def extensions-v1beta1-scale-status-data
  {
   (ds/req :replicas) int?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :targetSelector) string?
   })

(def extensions-v1beta1-scale-status
  (ds/spec
    {:name ::extensions-v1beta1-scale-status
     :spec extensions-v1beta1-scale-status-data}))

