(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-conversion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apiextensions-v1beta1-webhook-client-config :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-conversion-data v1beta1-custom-resource-conversion)
(def v1beta1-custom-resource-conversion-data
  {
   (ds/opt :conversionReviewVersions) (s/coll-of string?)
   (ds/req :strategy) string?
   (ds/opt :webhookClientConfig) apiextensions-v1beta1-webhook-client-config
   })

(def v1beta1-custom-resource-conversion
  (ds/spec
    {:name ::v1beta1-custom-resource-conversion
     :spec v1beta1-custom-resource-conversion-data}))

