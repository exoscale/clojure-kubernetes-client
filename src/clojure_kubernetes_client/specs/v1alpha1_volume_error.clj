(ns clojure-kubernetes-client.specs.v1alpha1-volume-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-volume-error-data v1alpha1-volume-error)
(def v1alpha1-volume-error-data
  {
   (ds/opt :message) string?
   (ds/opt :time) inst?
   })

(def v1alpha1-volume-error
  (ds/spec
    {:name ::v1alpha1-volume-error
     :spec v1alpha1-volume-error-data}))

