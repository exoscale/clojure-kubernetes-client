(ns clojure-kubernetes-client.specs.v1alpha1-group-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-group-subject-data v1alpha1-group-subject)
(def v1alpha1-group-subject-data
  {
   (ds/req :name) string?
   })

(def v1alpha1-group-subject
  (ds/spec
    {:name ::v1alpha1-group-subject
     :spec v1alpha1-group-subject-data}))

