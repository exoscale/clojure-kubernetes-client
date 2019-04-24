(ns clojure-kubernetes-client.specs.v1-pod-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-weighted-pod-affinity-term :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-affinity-term :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-affinity-data v1-pod-affinity)
(def v1-pod-affinity-data
  {
   (ds/opt :preferredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1-weighted-pod-affinity-term)
   (ds/opt :requiredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1-pod-affinity-term)
   })

(def v1-pod-affinity
  (ds/spec
    {:name ::v1-pod-affinity
     :spec v1-pod-affinity-data}))

