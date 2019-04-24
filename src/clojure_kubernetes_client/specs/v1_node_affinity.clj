(ns clojure-kubernetes-client.specs.v1-node-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-preferred-scheduling-term :refer :all]
            [clojure-kubernetes-client.specs.v1-node-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-node-affinity-data v1-node-affinity)
(def v1-node-affinity-data
  {
   (ds/opt :preferredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1-preferred-scheduling-term)
   (ds/opt :requiredDuringSchedulingIgnoredDuringExecution) v1-node-selector
   })

(def v1-node-affinity
  (ds/spec
    {:name ::v1-node-affinity
     :spec v1-node-affinity-data}))

