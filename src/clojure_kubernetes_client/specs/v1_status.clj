(ns clojure-kubernetes-client.specs.v1-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-status-details :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-status-data v1-status)
(def v1-status-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :code) int?
   (ds/opt :details) v1-status-details
   (ds/opt :kind) string?
   (ds/opt :message) string?
   (ds/opt :metadata) v1-list-meta
   (ds/opt :reason) string?
   (ds/opt :status) string?
   })

(def v1-status
  (ds/spec
    {:name ::v1-status
     :spec v1-status-data}))

