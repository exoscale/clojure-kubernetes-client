(ns clojure-kubernetes-client.specs.v1-scale-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-scale-status-data v1-scale-status)
(def v1-scale-status-data
  {
   (ds/req :replicas) int?
   (ds/opt :selector) string?
   })

(def v1-scale-status
  (ds/spec
    {:name ::v1-scale-status
     :spec v1-scale-status-data}))

