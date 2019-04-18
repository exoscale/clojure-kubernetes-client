(ns kubernetes.specs.v1/horizontal-pod-autoscaler-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/horizontal-pod-autoscaler-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/horizontal-pod-autoscaler-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/horizontal-pod-autoscaler-list-spec
  (ds/spec
    {:name ::v1/horizontal-pod-autoscaler-list
     :spec v1/horizontal-pod-autoscaler-list-data}))
