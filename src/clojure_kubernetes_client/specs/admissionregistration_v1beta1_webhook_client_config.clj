(ns clojure-kubernetes-client.specs.admissionregistration-v1beta1-webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.admissionregistration-v1beta1-service-reference :refer :all]
            )
  (:import (java.io File)))


(declare admissionregistration-v1beta1-webhook-client-config-data admissionregistration-v1beta1-webhook-client-config)
(def admissionregistration-v1beta1-webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) admissionregistration-v1beta1-service-reference
   (ds/opt :url) string?
   })

(def admissionregistration-v1beta1-webhook-client-config
  (ds/spec
    {:name ::admissionregistration-v1beta1-webhook-client-config
     :spec admissionregistration-v1beta1-webhook-client-config-data}))

