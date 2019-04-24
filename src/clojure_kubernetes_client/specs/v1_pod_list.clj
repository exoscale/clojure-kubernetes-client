(ns clojure-kubernetes-client.specs.v1-pod-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-list-data v1-pod-list)
(def v1-pod-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-pod)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-pod-list
  (ds/spec
    {:name ::v1-pod-list
     :spec v1-pod-list-data}))

