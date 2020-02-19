(ns clojure-kubernetes-client.specs.v1beta1-volume-node-resources
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-volume-node-resources-data v1beta1-volume-node-resources)
(def v1beta1-volume-node-resources-data
  {
   (ds/opt :count) int?
   })

(def v1beta1-volume-node-resources
  (ds/spec
    {:name ::v1beta1-volume-node-resources
     :spec v1beta1-volume-node-resources-data}))

