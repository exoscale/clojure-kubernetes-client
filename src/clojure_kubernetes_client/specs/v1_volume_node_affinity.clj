(ns clojure-kubernetes-client.specs.v1-volume-node-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-node-affinity-data v1-volume-node-affinity)
(def v1-volume-node-affinity-data
  {
   (ds/opt :required) v1-node-selector
   })

(def v1-volume-node-affinity
  (ds/spec
    {:name ::v1-volume-node-affinity
     :spec v1-volume-node-affinity-data}))

