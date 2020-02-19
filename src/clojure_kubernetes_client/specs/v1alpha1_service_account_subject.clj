(ns clojure-kubernetes-client.specs.v1alpha1-service-account-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-service-account-subject-data v1alpha1-service-account-subject)
(def v1alpha1-service-account-subject-data
  {
   (ds/req :name) string?
   (ds/req :namespace) string?
   })

(def v1alpha1-service-account-subject
  (ds/spec
    {:name ::v1alpha1-service-account-subject
     :spec v1alpha1-service-account-subject-data}))

