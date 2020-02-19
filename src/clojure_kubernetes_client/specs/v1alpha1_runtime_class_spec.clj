(ns clojure-kubernetes-client.specs.v1alpha1-runtime-class-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1alpha1-overhead :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-scheduling :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-runtime-class-spec-data v1alpha1-runtime-class-spec)
(def v1alpha1-runtime-class-spec-data
  {
   (ds/opt :overhead) v1alpha1-overhead
   (ds/req :runtimeHandler) string?
   (ds/opt :scheduling) v1alpha1-scheduling
   })

(def v1alpha1-runtime-class-spec
  (ds/spec
    {:name ::v1alpha1-runtime-class-spec
     :spec v1alpha1-runtime-class-spec-data}))

