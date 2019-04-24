(ns clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy-spec :refer :all]
            )
  (:import (java.io File)))


(declare policy-v1beta1-pod-security-policy-data policy-v1beta1-pod-security-policy)
(def policy-v1beta1-pod-security-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) policy-v1beta1-pod-security-policy-spec
   })

(def policy-v1beta1-pod-security-policy
  (ds/spec
    {:name ::policy-v1beta1-pod-security-policy
     :spec policy-v1beta1-pod-security-policy-data}))

