(ns kubernetes.specs.v1alpha1/webhook-throttle-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1alpha1/webhook-throttle-config-data
  {
   (ds/opt :burst) int?
   (ds/opt :qps) int?
   })

(def v1alpha1/webhook-throttle-config-spec
  (ds/spec
    {:name ::v1alpha1/webhook-throttle-config
     :spec v1alpha1/webhook-throttle-config-data}))
