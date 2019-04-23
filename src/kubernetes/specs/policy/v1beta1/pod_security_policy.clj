(ns kubernetes.specs.policy/v1beta1/pod-security-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.policy/v1beta1/pod-security-policy-spec :refer :all]
            )
  (:import (java.io File)))


(def policy/v1beta1/pod-security-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) policy/v1beta1/pod-security-policy-spec-spec
   })

(def policy/v1beta1/pod-security-policy-spec
  (ds/spec
    {:name ::policy/v1beta1/pod-security-policy
     :spec policy/v1beta1/pod-security-policy-data}))
