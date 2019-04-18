(ns kubernetes.specs.v1beta1/custom-resource-validation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-validation-data
  {
   (ds/opt :openAPIV3Schema) v1beta1/json-schema-props-spec
   })

(def v1beta1/custom-resource-validation-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-validation
     :spec v1beta1/custom-resource-validation-data}))
