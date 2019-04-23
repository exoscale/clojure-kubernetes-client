(ns kubernetes.specs.v1beta1/webhook
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.admissionregistration/v1beta1/webhook-client-config :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1beta1/rule-with-operations :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/webhook-data
  {
   (ds/opt :admissionReviewVersions) (s/coll-of string?)
   (ds/req :clientConfig) admissionregistration/v1beta1/webhook-client-config-spec
   (ds/opt :failurePolicy) string?
   (ds/req :name) string?
   (ds/opt :namespaceSelector) v1/label-selector-spec
   (ds/opt :rules) (s/coll-of v1beta1/rule-with-operations-spec)
   (ds/opt :sideEffects) string?
   (ds/opt :timeoutSeconds) int?
   })

(def v1beta1/webhook-spec
  (ds/spec
    {:name ::v1beta1/webhook
     :spec v1beta1/webhook-data}))
