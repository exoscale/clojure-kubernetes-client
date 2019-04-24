(ns clojure-kubernetes-client.specs.v1-controller-revision-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-controller-revision :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-controller-revision-list-data v1-controller-revision-list)
(def v1-controller-revision-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-controller-revision)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-controller-revision-list
  (ds/spec
    {:name ::v1-controller-revision-list
     :spec v1-controller-revision-list-data}))

