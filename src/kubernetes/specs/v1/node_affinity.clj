(ns kubernetes.specs.v1/node-affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/preferred-scheduling-term :refer :all]
            [kubernetes.specs.v1/node-selector :refer :all]
            )
  (:import (java.io File)))


(def v1/node-affinity-data
  {
   (ds/opt :preferredDuringSchedulingIgnoredDuringExecution) (s/coll-of v1/preferred-scheduling-term-spec)
   (ds/opt :requiredDuringSchedulingIgnoredDuringExecution) v1/node-selector-spec
   })

(def v1/node-affinity-spec
  (ds/spec
    {:name ::v1/node-affinity
     :spec v1/node-affinity-data}))
