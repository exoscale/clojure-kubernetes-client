(ns kubernetes.specs.extensions/v1beta1/pod-security-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.extensions/v1beta1/pod-security-policy-spec :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/pod-security-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) extensions/v1beta1/pod-security-policy-spec-spec
   })

(def extensions/v1beta1/pod-security-policy-spec
  (ds/spec
    {:name ::extensions/v1beta1/pod-security-policy
     :spec extensions/v1beta1/pod-security-policy-data}))
