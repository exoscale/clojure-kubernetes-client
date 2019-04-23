(ns kubernetes.specs.admissionregistration/v1beta1/service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def admissionregistration/v1beta1/service-reference-data
  {
   (ds/req :name) string?
   (ds/req :namespace) string?
   (ds/opt :path) string?
   })

(def admissionregistration/v1beta1/service-reference-spec
  (ds/spec
    {:name ::admissionregistration/v1beta1/service-reference
     :spec admissionregistration/v1beta1/service-reference-data}))
