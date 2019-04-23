(ns kubernetes.specs.v1beta1/custom-resource-conversion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apiextensions/v1beta1/webhook-client-config :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-conversion-data
  {
   (ds/opt :conversionReviewVersions) (s/coll-of string?)
   (ds/req :strategy) string?
   (ds/opt :webhookClientConfig) apiextensions/v1beta1/webhook-client-config-spec
   })

(def v1beta1/custom-resource-conversion-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-conversion
     :spec v1beta1/custom-resource-conversion-data}))
