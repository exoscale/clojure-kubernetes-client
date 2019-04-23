(ns kubernetes.specs.apiextensions/v1beta1/webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apiextensions/v1beta1/service-reference :refer :all]
            )
  (:import (java.io File)))


(def apiextensions/v1beta1/webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) apiextensions/v1beta1/service-reference-spec
   (ds/opt :url) string?
   })

(def apiextensions/v1beta1/webhook-client-config-spec
  (ds/spec
    {:name ::apiextensions/v1beta1/webhook-client-config
     :spec apiextensions/v1beta1/webhook-client-config-data}))
