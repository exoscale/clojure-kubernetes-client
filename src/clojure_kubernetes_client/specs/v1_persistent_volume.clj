(ns clojure-kubernetes-client.specs.v1-persistent-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-data v1-persistent-volume)
(def v1-persistent-volume-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-persistent-volume-spec
   (ds/opt :status) v1-persistent-volume-status
   })

(def v1-persistent-volume
  (ds/spec
    {:name ::v1-persistent-volume
     :spec v1-persistent-volume-data}))

