(ns clojure-kubernetes-client.specs.v1beta1-webhook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.admissionregistration-v1beta1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-rule-with-operations :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-webhook-data v1beta1-webhook)
(def v1beta1-webhook-data
  {
   (ds/opt :admissionReviewVersions) (s/coll-of string?)
   (ds/req :clientConfig) admissionregistration-v1beta1-webhook-client-config
   (ds/opt :failurePolicy) string?
   (ds/req :name) string?
   (ds/opt :namespaceSelector) v1-label-selector
   (ds/opt :rules) (s/coll-of v1beta1-rule-with-operations)
   (ds/opt :sideEffects) string?
   (ds/opt :timeoutSeconds) int?
   })

(def v1beta1-webhook
  (ds/spec
    {:name ::v1beta1-webhook
     :spec v1beta1-webhook-data}))

