(ns kubernetes.specs.v1beta1/api-service-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.apiregistration/v1beta1/service-reference :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/api-service-spec-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :group) string?
   (ds/req :groupPriorityMinimum) int?
   (ds/opt :insecureSkipTLSVerify) boolean?
   (ds/req :service) apiregistration/v1beta1/service-reference-spec
   (ds/opt :version) string?
   (ds/req :versionPriority) int?
   })

(def v1beta1/api-service-spec-spec
  (ds/spec
    {:name ::v1beta1/api-service-spec
     :spec v1beta1/api-service-spec-data}))
