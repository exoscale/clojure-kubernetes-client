(ns clojure-kubernetes-client.specs.extensions-v1beta1-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-scale-status :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-scale-data extensions-v1beta1-scale)
(def extensions-v1beta1-scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) extensions-v1beta1-scale-spec
   (ds/opt :status) extensions-v1beta1-scale-status
   })

(def extensions-v1beta1-scale
  (ds/spec
    {:name ::extensions-v1beta1-scale
     :spec extensions-v1beta1-scale-data}))

