(ns kubernetes.specs.v1/pod-anti-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/weighted-pod-affinity-term :refer :all]
            [kubernetes.specs.v1/pod-affinity-term :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-anti-affinity-data
  {
   (ds/opt :preferredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1/weighted-pod-affinity-term-spec)
   (ds/opt :requiredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1/pod-affinity-term-spec)
   })

(def v1/pod-anti-affinity-spec
  (ds/spec
    {:name ::v1/pod-anti-affinity
     :spec v1/pod-anti-affinity-data}))
