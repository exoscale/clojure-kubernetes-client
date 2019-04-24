(ns clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-certificate-signing-request-status-data v1beta1-certificate-signing-request-status)
(def v1beta1-certificate-signing-request-status-data
  {
   (ds/opt :certificate) any?
   (ds/opt :conditions) (s/coll-of v1beta1-certificate-signing-request-condition)
   })

(def v1beta1-certificate-signing-request-status
  (ds/spec
    {:name ::v1beta1-certificate-signing-request-status
     :spec v1beta1-certificate-signing-request-status-data}))

