(ns clojure-kubernetes-client.specs.v1alpha1-user-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-user-subject-data v1alpha1-user-subject)
(def v1alpha1-user-subject-data
  {
   (ds/req :name) string?
   })

(def v1alpha1-user-subject
  (ds/spec
    {:name ::v1alpha1-user-subject
     :spec v1alpha1-user-subject-data}))

