(ns clojure-kubernetes-client.specs.v1beta2-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-scale-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-scale-data v1beta2-scale)
(def v1beta2-scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta2-scale-spec
   (ds/opt :status) v1beta2-scale-status
   })

(def v1beta2-scale
  (ds/spec
    {:name ::v1beta2-scale
     :spec v1beta2-scale-data}))

