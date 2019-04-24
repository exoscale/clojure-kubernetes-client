(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-validation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-json-schema-props :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-validation-data v1beta1-custom-resource-validation)
(def v1beta1-custom-resource-validation-data
  {
   (ds/opt :openAPIV3Schema) v1beta1-json-schema-props
   })

(def v1beta1-custom-resource-validation
  (ds/spec
    {:name ::v1beta1-custom-resource-validation
     :spec v1beta1-custom-resource-validation-data}))

