(ns clojure-kubernetes-client.specs.v1alpha1-priority-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-priority-class-data v1alpha1-priority-class)
(def v1alpha1-priority-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :description) string?
   (ds/opt :globalDefault) boolean?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :preemptionPolicy) string?
   (ds/req :value) int?
   })

(def v1alpha1-priority-class
  (ds/spec
    {:name ::v1alpha1-priority-class
     :spec v1alpha1-priority-class-data}))

