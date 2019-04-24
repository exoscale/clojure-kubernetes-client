(ns clojure-kubernetes-client.specs.v1-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-node-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-anti-affinity :refer :all]
            )
  (:import (java.io File)))


(declare v1-affinity-data v1-affinity)
(def v1-affinity-data
  {
   (ds/opt :nodeAffinity) v1-node-affinity
   (ds/opt :podAffinity) v1-pod-affinity
   (ds/opt :podAntiAffinity) v1-pod-anti-affinity
   })

(def v1-affinity
  (ds/spec
    {:name ::v1-affinity
     :spec v1-affinity-data}))

