(ns clojure-kubernetes-client.specs.v1-pod-anti-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-weighted-pod-affinity-term :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-affinity-term :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-anti-affinity-data v1-pod-anti-affinity)
(def v1-pod-anti-affinity-data
  {
   (ds/opt :preferredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1-weighted-pod-affinity-term)
   (ds/opt :requiredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1-pod-affinity-term)
   })

(def v1-pod-anti-affinity
  (ds/spec
    {:name ::v1-pod-anti-affinity
     :spec v1-pod-anti-affinity-data}))

