(ns clojure-kubernetes-client.specs.v1-namespace-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-namespace :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-namespace-list-data v1-namespace-list)
(def v1-namespace-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-namespace)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-namespace-list
  (ds/spec
    {:name ::v1-namespace-list
     :spec v1-namespace-list-data}))

