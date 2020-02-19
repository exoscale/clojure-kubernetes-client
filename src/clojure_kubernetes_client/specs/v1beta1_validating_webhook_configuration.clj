(ns clojure-kubernetes-client.specs.v1beta1-validating-webhook-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-validating-webhook :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-validating-webhook-configuration-data v1beta1-validating-webhook-configuration)
(def v1beta1-validating-webhook-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :webhooks) (s/coll-of v1beta1-validating-webhook)
   })

(def v1beta1-validating-webhook-configuration
  (ds/spec
    {:name ::v1beta1-validating-webhook-configuration
     :spec v1beta1-validating-webhook-configuration-data}))

