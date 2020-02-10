(ns clojure-kubernetes-client.specs.v1beta1-runtime-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-overhead :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-scheduling :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-runtime-class-data v1beta1-runtime-class)
(def v1beta1-runtime-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :handler) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :overhead) v1beta1-overhead
   (ds/opt :scheduling) v1beta1-scheduling
   })

(def v1beta1-runtime-class
  (ds/spec
    {:name ::v1beta1-runtime-class
     :spec v1beta1-runtime-class-data}))

