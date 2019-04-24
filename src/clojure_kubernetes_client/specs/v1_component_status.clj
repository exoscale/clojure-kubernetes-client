(ns clojure-kubernetes-client.specs.v1-component-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-component-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-component-status-data v1-component-status)
(def v1-component-status-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :conditions) (s/coll-of v1-component-condition)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   })

(def v1-component-status
  (ds/spec
    {:name ::v1-component-status
     :spec v1-component-status-data}))

