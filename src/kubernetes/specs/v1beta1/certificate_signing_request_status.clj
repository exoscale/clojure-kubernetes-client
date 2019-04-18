(ns kubernetes.specs.v1beta1/certificate-signing-request-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/certificate-signing-request-condition :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/certificate-signing-request-status-data
  {
   (ds/opt :certificate) any?
   (ds/opt :conditions) (s/coll-of v1beta1/certificate-signing-request-condition-spec)
   })

(def v1beta1/certificate-signing-request-status-spec
  (ds/spec
    {:name ::v1beta1/certificate-signing-request-status
     :spec v1beta1/certificate-signing-request-status-data}))
