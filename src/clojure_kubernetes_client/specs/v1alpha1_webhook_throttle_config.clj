(ns clojure-kubernetes-client.specs.v1alpha1-webhook-throttle-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-webhook-throttle-config-data v1alpha1-webhook-throttle-config)
(def v1alpha1-webhook-throttle-config-data
  {
   (ds/opt :burst) int?
   (ds/opt :qps) int?
   })

(def v1alpha1-webhook-throttle-config
  (ds/spec
    {:name ::v1alpha1-webhook-throttle-config
     :spec v1alpha1-webhook-throttle-config-data}))

