(ns clojure-kubernetes-client.specs.rbac-v1alpha1-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare rbac-v1alpha1-subject-data rbac-v1alpha1-subject)
(def rbac-v1alpha1-subject-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/opt :namespace) string?
   })

(def rbac-v1alpha1-subject
  (ds/spec
    {:name ::rbac-v1alpha1-subject
     :spec rbac-v1alpha1-subject-data}))

