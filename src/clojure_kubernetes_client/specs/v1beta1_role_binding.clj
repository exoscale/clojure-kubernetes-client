(ns clojure-kubernetes-client.specs.v1beta1-role-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role-ref :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-role-binding-data v1beta1-role-binding)
(def v1beta1-role-binding-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :roleRef) v1beta1-role-ref
   (ds/opt :subjects) (s/coll-of v1beta1-subject)
   })

(def v1beta1-role-binding
  (ds/spec
    {:name ::v1beta1-role-binding
     :spec v1beta1-role-binding-data}))

