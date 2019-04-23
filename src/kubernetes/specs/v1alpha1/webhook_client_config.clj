(ns kubernetes.specs.v1alpha1/webhook-client-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/service-reference :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/webhook-client-config-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :service) v1alpha1/service-reference-spec
   (ds/opt :url) string?
   })

(def v1alpha1/webhook-client-config-spec
  (ds/spec
    {:name ::v1alpha1/webhook-client-config
     :spec v1alpha1/webhook-client-config-data}))
