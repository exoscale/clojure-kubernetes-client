(ns kubernetes.specs.v1/affinity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/node-affinity :refer :all]
            [kubernetes.specs.v1/pod-affinity :refer :all]
            [kubernetes.specs.v1/pod-anti-affinity :refer :all]
            )
  (:import (java.io File)))


(def v1/affinity-data
  {
   (ds/opt :nodeAffinity) v1/node-affinity-spec
   (ds/opt :podAffinity) v1/pod-affinity-spec
   (ds/opt :podAntiAffinity) v1/pod-anti-affinity-spec
   })

(def v1/affinity-spec
  (ds/spec
    {:name ::v1/affinity
     :spec v1/affinity-data}))
