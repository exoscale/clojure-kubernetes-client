(ns clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare policy-v1beta1-pod-security-policy-list-data policy-v1beta1-pod-security-policy-list)
(def policy-v1beta1-pod-security-policy-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of policy-v1beta1-pod-security-policy)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def policy-v1beta1-pod-security-policy-list
  (ds/spec
    {:name ::policy-v1beta1-pod-security-policy-list
     :spec policy-v1beta1-pod-security-policy-list-data}))

