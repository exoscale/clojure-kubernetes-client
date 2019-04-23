(ns kubernetes.specs.extensions/v1beta1/pod-security-policy-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/pod-security-policy :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/pod-security-policy-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of extensions/v1beta1/pod-security-policy-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def extensions/v1beta1/pod-security-policy-list-spec
  (ds/spec
    {:name ::extensions/v1beta1/pod-security-policy-list
     :spec extensions/v1beta1/pod-security-policy-list-data}))
