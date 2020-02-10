(ns clojure-kubernetes-client.specs.v1-csi-node
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-node-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-csi-node-data v1-csi-node)
(def v1-csi-node-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-csi-node-spec
   })

(def v1-csi-node
  (ds/spec
    {:name ::v1-csi-node
     :spec v1-csi-node-data}))

