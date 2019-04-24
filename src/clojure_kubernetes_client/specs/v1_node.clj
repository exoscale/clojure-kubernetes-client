(ns clojure-kubernetes-client.specs.v1-node
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-node-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-node-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-data v1-node)
(def v1-node-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-node-spec
   (ds/opt :status) v1-node-status
   })

(def v1-node
  (ds/spec
    {:name ::v1-node
     :spec v1-node-data}))

