(ns clojure-kubernetes-client.specs.v1-weighted-pod-affinity-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-pod-affinity-term :refer :all]
            )
  (:import (java.io File)))


(declare v1-weighted-pod-affinity-term-data v1-weighted-pod-affinity-term)
(def v1-weighted-pod-affinity-term-data
  {
   (ds/req :podAffinityTerm) v1-pod-affinity-term
   (ds/req :weight) int?
   })

(def v1-weighted-pod-affinity-term
  (ds/spec
    {:name ::v1-weighted-pod-affinity-term
     :spec v1-weighted-pod-affinity-term-data}))

