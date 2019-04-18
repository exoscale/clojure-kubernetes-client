(ns kubernetes.specs.v1/horizontal-pod-autoscaler
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-status :refer :all]
            )
  (:import (java.io File)))


(def v1/horizontal-pod-autoscaler-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/horizontal-pod-autoscaler-spec-spec
   (ds/opt :status) v1/horizontal-pod-autoscaler-status-spec
   })

(def v1/horizontal-pod-autoscaler-spec
  (ds/spec
    {:name ::v1/horizontal-pod-autoscaler
     :spec v1/horizontal-pod-autoscaler-data}))
