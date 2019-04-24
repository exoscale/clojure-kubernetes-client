(ns clojure-kubernetes-client.specs.v1-service-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-account-data v1-service-account)
(def v1-service-account-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :automountServiceAccountToken) boolean?
   (ds/opt :imagePullSecrets) (s/coll-of v1-local-object-reference)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :secrets) (s/coll-of v1-object-reference)
   })

(def v1-service-account
  (ds/spec
    {:name ::v1-service-account
     :spec v1-service-account-data}))

