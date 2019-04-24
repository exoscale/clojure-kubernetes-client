(ns clojure-kubernetes-client.specs.v1-persistent-volume-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-list-data v1-persistent-volume-list)
(def v1-persistent-volume-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-persistent-volume)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-persistent-volume-list
  (ds/spec
    {:name ::v1-persistent-volume-list
     :spec v1-persistent-volume-list-data}))

