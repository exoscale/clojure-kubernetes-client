(ns clojure-kubernetes-client.specs.v1-pod-template-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-template-list-data v1-pod-template-list)
(def v1-pod-template-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-pod-template)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-pod-template-list
  (ds/spec
    {:name ::v1-pod-template-list
     :spec v1-pod-template-list-data}))

