(ns clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-pod-security-policy-list-data extensions-v1beta1-pod-security-policy-list)
(def extensions-v1beta1-pod-security-policy-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of extensions-v1beta1-pod-security-policy)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def extensions-v1beta1-pod-security-policy-list
  (ds/spec
    {:name ::extensions-v1beta1-pod-security-policy-list
     :spec extensions-v1beta1-pod-security-policy-list-data}))

