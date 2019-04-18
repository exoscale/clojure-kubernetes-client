(ns kubernetes.specs.v1alpha1/role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/policy-rule :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/role-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :rules) (s/coll-of v1alpha1/policy-rule-spec)
   })

(def v1alpha1/role-spec
  (ds/spec
    {:name ::v1alpha1/role
     :spec v1alpha1/role-data}))
