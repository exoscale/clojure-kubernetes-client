(ns clojure-kubernetes-client.specs.v1alpha1-cluster-role-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role-ref :refer :all]
            [clojure-kubernetes-client.specs.rbac-v1alpha1-subject :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-cluster-role-binding-data v1alpha1-cluster-role-binding)
(def v1alpha1-cluster-role-binding-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :roleRef) v1alpha1-role-ref
   (ds/opt :subjects) (s/coll-of rbac-v1alpha1-subject)
   })

(def v1alpha1-cluster-role-binding
  (ds/spec
    {:name ::v1alpha1-cluster-role-binding
     :spec v1alpha1-cluster-role-binding-data}))

