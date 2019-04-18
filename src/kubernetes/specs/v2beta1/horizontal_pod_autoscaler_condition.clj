(ns kubernetes.specs.v2beta1/horizontal-pod-autoscaler-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta1/horizontal-pod-autoscaler-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v2beta1/horizontal-pod-autoscaler-condition-spec
  (ds/spec
    {:name ::v2beta1/horizontal-pod-autoscaler-condition
     :spec v2beta1/horizontal-pod-autoscaler-condition-data}))
