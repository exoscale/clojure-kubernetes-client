(ns clojure-kubernetes-client.specs.v1-component-status-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-component-status :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-component-status-list-data v1-component-status-list)
(def v1-component-status-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-component-status)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-component-status-list
  (ds/spec
    {:name ::v1-component-status-list
     :spec v1-component-status-list-data}))

