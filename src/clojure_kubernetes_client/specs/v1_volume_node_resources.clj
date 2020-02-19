(ns clojure-kubernetes-client.specs.v1-volume-node-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-volume-node-resources-data v1-volume-node-resources)
(def v1-volume-node-resources-data
  {
   (ds/opt :count) int?
   })

(def v1-volume-node-resources
  (ds/spec
    {:name ::v1-volume-node-resources
     :spec v1-volume-node-resources-data}))

