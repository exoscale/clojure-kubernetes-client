(ns clojure-kubernetes-client.specs.v1alpha1-webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-service-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-webhook-client-config-data v1alpha1-webhook-client-config)
(def v1alpha1-webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) v1alpha1-service-reference
   (ds/opt :url) string?
   })

(def v1alpha1-webhook-client-config
  (ds/spec
    {:name ::v1alpha1-webhook-client-config
     :spec v1alpha1-webhook-client-config-data}))

