(ns kubernetes.specs.v1beta1/validating-webhook-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/webhook :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/validating-webhook-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :webhooks) (s/coll-of v1beta1/webhook-spec)
   })

(def v1beta1/validating-webhook-configuration-spec
  (ds/spec
    {:name ::v1beta1/validating-webhook-configuration
     :spec v1beta1/validating-webhook-configuration-data}))
