(ns kubernetes.specs.v1beta1/certificate-signing-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-spec :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/certificate-signing-request-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1beta1/certificate-signing-request-spec-spec
   (ds/opt :status) v1beta1/certificate-signing-request-status-spec
   })

(def v1beta1/certificate-signing-request-spec
  (ds/spec
    {:name ::v1beta1/certificate-signing-request
     :spec v1beta1/certificate-signing-request-data}))
