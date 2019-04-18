(ns kubernetes.specs.v1/weighted-pod-affinity-term
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/pod-affinity-term :refer :all]
            )
  (:import (java.io File)))


(def v1/weighted-pod-affinity-term-data
  {
   (ds/req :podAffinityTerm) v1/pod-affinity-term-spec
   (ds/req :weight) int?
   })

(def v1/weighted-pod-affinity-term-spec
  (ds/spec
    {:name ::v1/weighted-pod-affinity-term
     :spec v1/weighted-pod-affinity-term-data}))
