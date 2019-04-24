(ns clojure-kubernetes-client.specs.v1alpha1-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-policy-data v1alpha1-policy)
(def v1alpha1-policy-data
  {
   (ds/req :level) string?
   (ds/opt :stages) (s/coll-of string?)
   })

(def v1alpha1-policy
  (ds/spec
    {:name ::v1alpha1-policy
     :spec v1alpha1-policy-data}))

