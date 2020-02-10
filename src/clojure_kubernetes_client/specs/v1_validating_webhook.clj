(ns clojure-kubernetes-client.specs.v1-validating-webhook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.admissionregistration-v1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-rule-with-operations :refer :all]
            )
  (:import (java.io File)))


(declare v1-validating-webhook-data v1-validating-webhook)
(def v1-validating-webhook-data
  {
   (ds/req :admissionReviewVersions) (s/coll-of string?)
   (ds/req :clientConfig) admissionregistration-v1-webhook-client-config
   (ds/opt :failurePolicy) string?
   (ds/opt :matchPolicy) string?
   (ds/req :name) string?
   (ds/opt :namespaceSelector) v1-label-selector
   (ds/opt :objectSelector) v1-label-selector
   (ds/opt :rules) (s/coll-of v1-rule-with-operations)
   (ds/req :sideEffects) string?
   (ds/opt :timeoutSeconds) int?
   })

(def v1-validating-webhook
  (ds/spec
    {:name ::v1-validating-webhook
     :spec v1-validating-webhook-data}))

