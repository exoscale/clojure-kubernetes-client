(ns kubernetes.specs.v1alpha1/cluster-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1alpha1/aggregation-rule :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/policy-rule :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/cluster-role-data
  {
   (ds/opt :aggregationRule) v1alpha1/aggregation-rule-spec
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :rules) (s/coll-of v1alpha1/policy-rule-spec)
   })

(def v1alpha1/cluster-role-spec
  (ds/spec
    {:name ::v1alpha1/cluster-role
     :spec v1alpha1/cluster-role-data}))
