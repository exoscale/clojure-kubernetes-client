(ns kubernetes.specs.admissionregistration/v1beta1/webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.admissionregistration/v1beta1/service-reference :refer :all]
            )
  (:import (java.io File)))


(def admissionregistration/v1beta1/webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) admissionregistration/v1beta1/service-reference-spec
   (ds/opt :url) string?
   })

(def admissionregistration/v1beta1/webhook-client-config-spec
  (ds/spec
    {:name ::admissionregistration/v1beta1/webhook-client-config
     :spec admissionregistration/v1beta1/webhook-client-config-data}))
