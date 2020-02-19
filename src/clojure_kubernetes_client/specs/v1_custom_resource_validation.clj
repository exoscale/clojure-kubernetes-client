(ns clojure-kubernetes-client.specs.v1-custom-resource-validation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-validation-data v1-custom-resource-validation)
(def v1-custom-resource-validation-data
  {
   (ds/opt :openAPIV3Schema) v1-json-schema-props
   })

(def v1-custom-resource-validation
  (ds/spec
    {:name ::v1-custom-resource-validation
     :spec v1-custom-resource-validation-data}))

