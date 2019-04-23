(ns kubernetes.specs.v1alpha1/webhook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/webhook-client-config :refer :all]
            [kubernetes.specs.v1alpha1/webhook-throttle-config :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/webhook-data
  {
   (ds/req :clientConfig) v1alpha1/webhook-client-config-spec
   (ds/opt :throttle) v1alpha1/webhook-throttle-config-spec
   })

(def v1alpha1/webhook-spec
  (ds/spec
    {:name ::v1alpha1/webhook
     :spec v1alpha1/webhook-data}))
