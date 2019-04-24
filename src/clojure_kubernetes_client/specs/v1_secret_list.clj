(ns clojure-kubernetes-client.specs.v1-secret-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-secret :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-secret-list-data v1-secret-list)
(def v1-secret-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-secret)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-secret-list
  (ds/spec
    {:name ::v1-secret-list
     :spec v1-secret-list-data}))

