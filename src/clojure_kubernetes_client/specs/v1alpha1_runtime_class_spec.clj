(ns clojure-kubernetes-client.specs.v1alpha1-runtime-class-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-runtime-class-spec-data v1alpha1-runtime-class-spec)
(def v1alpha1-runtime-class-spec-data
  {
   (ds/req :runtimeHandler) string?
   })

(def v1alpha1-runtime-class-spec
  (ds/spec
    {:name ::v1alpha1-runtime-class-spec
     :spec v1alpha1-runtime-class-spec-data}))

