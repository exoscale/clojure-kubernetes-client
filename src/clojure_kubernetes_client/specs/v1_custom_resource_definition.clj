(ns clojure-kubernetes-client.specs.v1-custom-resource-definition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-data v1-custom-resource-definition)
(def v1-custom-resource-definition-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-custom-resource-definition-spec
   (ds/opt :status) v1-custom-resource-definition-status
   })

(def v1-custom-resource-definition
  (ds/spec
    {:name ::v1-custom-resource-definition
     :spec v1-custom-resource-definition-data}))

