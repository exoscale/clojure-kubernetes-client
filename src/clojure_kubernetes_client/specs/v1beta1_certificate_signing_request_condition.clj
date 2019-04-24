(ns clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-certificate-signing-request-condition-data v1beta1-certificate-signing-request-condition)
(def v1beta1-certificate-signing-request-condition-data
  {
   (ds/opt :lastUpdateTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :type) string?
   })

(def v1beta1-certificate-signing-request-condition
  (ds/spec
    {:name ::v1beta1-certificate-signing-request-condition
     :spec v1beta1-certificate-signing-request-condition-data}))

