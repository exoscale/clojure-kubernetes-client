(ns clojure-kubernetes-client.specs.apiextensions-v1beta1-webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apiextensions-v1beta1-service-reference :refer :all]
            )
  (:import (java.io File)))


(declare apiextensions-v1beta1-webhook-client-config-data apiextensions-v1beta1-webhook-client-config)
(def apiextensions-v1beta1-webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) apiextensions-v1beta1-service-reference
   (ds/opt :url) string?
   })

(def apiextensions-v1beta1-webhook-client-config
  (ds/spec
    {:name ::apiextensions-v1beta1-webhook-client-config
     :spec apiextensions-v1beta1-webhook-client-config-data}))

