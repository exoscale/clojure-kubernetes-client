(ns clojure-kubernetes-client.specs.v1alpha1-service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-service-reference-data v1alpha1-service-reference)
(def v1alpha1-service-reference-data
  {
   (ds/req :name) string?
   (ds/req :namespace) string?
   (ds/opt :path) string?
   (ds/opt :port) int?
   })

(def v1alpha1-service-reference
  (ds/spec
    {:name ::v1alpha1-service-reference
     :spec v1alpha1-service-reference-data}))

