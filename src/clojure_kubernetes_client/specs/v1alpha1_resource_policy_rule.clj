(ns clojure-kubernetes-client.specs.v1alpha1-resource-policy-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-resource-policy-rule-data v1alpha1-resource-policy-rule)
(def v1alpha1-resource-policy-rule-data
  {
   (ds/req :apiGroups) (s/coll-of string?)
   (ds/opt :clusterScope) boolean?
   (ds/opt :namespaces) (s/coll-of string?)
   (ds/req :resources) (s/coll-of string?)
   (ds/req :verbs) (s/coll-of string?)
   })

(def v1alpha1-resource-policy-rule
  (ds/spec
    {:name ::v1alpha1-resource-policy-rule
     :spec v1alpha1-resource-policy-rule-data}))

