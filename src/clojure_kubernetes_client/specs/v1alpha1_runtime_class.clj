(ns clojure-kubernetes-client.specs.v1alpha1-runtime-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-runtime-class-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-runtime-class-data v1alpha1-runtime-class)
(def v1alpha1-runtime-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1alpha1-runtime-class-spec
   })

(def v1alpha1-runtime-class
  (ds/spec
    {:name ::v1alpha1-runtime-class
     :spec v1alpha1-runtime-class-data}))

