(ns clojure-kubernetes-client.specs.v1alpha1-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-subject-data v1alpha1-subject)
(def v1alpha1-subject-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/opt :namespace) string?
   })

(def v1alpha1-subject
  (ds/spec
    {:name ::v1alpha1-subject
     :spec v1alpha1-subject-data}))

