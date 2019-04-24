(ns clojure-kubernetes-client.specs.v1beta2-scale-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta2-scale-status-data v1beta2-scale-status)
(def v1beta2-scale-status-data
  {
   (ds/req :replicas) int?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :targetSelector) string?
   })

(def v1beta2-scale-status
  (ds/spec
    {:name ::v1beta2-scale-status
     :spec v1beta2-scale-status-data}))

