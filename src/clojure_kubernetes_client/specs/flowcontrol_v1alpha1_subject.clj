(ns clojure-kubernetes-client.specs.flowcontrol-v1alpha1-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-group-subject :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-service-account-subject :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-user-subject :refer :all]
            )
  (:import (java.io File)))


(declare flowcontrol-v1alpha1-subject-data flowcontrol-v1alpha1-subject)
(def flowcontrol-v1alpha1-subject-data
  {
   (ds/opt :group) v1alpha1-group-subject
   (ds/req :kind) string?
   (ds/opt :serviceAccount) v1alpha1-service-account-subject
   (ds/opt :user) v1alpha1-user-subject
   })

(def flowcontrol-v1alpha1-subject
  (ds/spec
    {:name ::flowcontrol-v1alpha1-subject
     :spec flowcontrol-v1alpha1-subject-data}))

