(ns clojure-kubernetes-client.specs.v1alpha1-webhook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-webhook-throttle-config :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-webhook-data v1alpha1-webhook)
(def v1alpha1-webhook-data
  {
   (ds/req :clientConfig) v1alpha1-webhook-client-config
   (ds/opt :throttle) v1alpha1-webhook-throttle-config
   })

(def v1alpha1-webhook
  (ds/spec
    {:name ::v1alpha1-webhook
     :spec v1alpha1-webhook-data}))

