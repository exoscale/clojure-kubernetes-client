(ns kubernetes.specs.v1beta1/json-schema-props
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/json-schema-props-or-bool :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-bool :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-string-array :refer :all]
            [kubernetes.specs.v1beta1/json :refer :all]
            [kubernetes.specs.v1beta1/json :refer :all]
            [kubernetes.specs.v1beta1/external-documentation :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-array :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/json-schema-props-data
  {
   (ds/opt :ref) string?
   (ds/opt :schema) string?
   (ds/opt :additionalItems) v1beta1/json-schema-props-or-bool-spec
   (ds/opt :additionalProperties) v1beta1/json-schema-props-or-bool-spec
   (ds/opt :allOf) (s/coll-of v1beta1/json-schema-props-spec)
   (ds/opt :anyOf) (s/coll-of v1beta1/json-schema-props-spec)
   (ds/opt :default) v1beta1/json-spec
   (ds/opt :definitions) (s/map-of string? v1beta1/json-schema-props-spec)
   (ds/opt :dependencies) (s/map-of string? v1beta1/json-schema-props-or-string-array-spec)
   (ds/opt :description) string?
   (ds/opt :enum) (s/coll-of v1beta1/json-spec)
   (ds/opt :example) v1beta1/json-spec
   (ds/opt :exclusiveMaximum) boolean?
   (ds/opt :exclusiveMinimum) boolean?
   (ds/opt :externalDocs) v1beta1/external-documentation-spec
   (ds/opt :format) string?
   (ds/opt :id) string?
   (ds/opt :items) v1beta1/json-schema-props-or-array-spec
   (ds/opt :maxItems) int?
   (ds/opt :maxLength) int?
   (ds/opt :maxProperties) int?
   (ds/opt :maximum) float?
   (ds/opt :minItems) int?
   (ds/opt :minLength) int?
   (ds/opt :minProperties) int?
   (ds/opt :minimum) float?
   (ds/opt :multipleOf) float?
   (ds/opt :not) v1beta1/json-schema-props-spec
   (ds/opt :oneOf) (s/coll-of v1beta1/json-schema-props-spec)
   (ds/opt :pattern) string?
   (ds/opt :patternProperties) (s/map-of string? v1beta1/json-schema-props-spec)
   (ds/opt :properties) (s/map-of string? v1beta1/json-schema-props-spec)
   (ds/opt :required) (s/coll-of string?)
   (ds/opt :title) string?
   (ds/opt :type) string?
   (ds/opt :uniqueItems) boolean?
   })

(def v1beta1/json-schema-props-spec
  (ds/spec
    {:name ::v1beta1/json-schema-props
     :spec v1beta1/json-schema-props-data}))