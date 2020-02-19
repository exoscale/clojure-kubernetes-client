(ns clojure-kubernetes-client.specs.v1-json-schema-props
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            
            [clojure-kubernetes-client.specs.v1-external-documentation :refer :all]
            
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            )
  (:import (java.io File)))


(declare v1-json-schema-props-data v1-json-schema-props)
(def v1-json-schema-props-data
  {
   (ds/opt :ref) string?
   (ds/opt :schema) string?
   (ds/opt :additionalItems) any?
   (ds/opt :additionalProperties) any?
   (ds/opt :allOf) (s/coll-of v1-json-schema-props)
   (ds/opt :anyOf) (s/coll-of v1-json-schema-props)
   (ds/opt :default) any?
   (ds/opt :definitions) (s/map-of string? v1-json-schema-props)
   (ds/opt :dependencies) (s/map-of string? any?)
   (ds/opt :description) string?
   (ds/opt :enum) (s/coll-of any?)
   (ds/opt :example) any?
   (ds/opt :exclusiveMaximum) boolean?
   (ds/opt :exclusiveMinimum) boolean?
   (ds/opt :externalDocs) v1-external-documentation
   (ds/opt :format) string?
   (ds/opt :id) string?
   (ds/opt :items) any?
   (ds/opt :maxItems) int?
   (ds/opt :maxLength) int?
   (ds/opt :maxProperties) int?
   (ds/opt :maximum) float?
   (ds/opt :minItems) int?
   (ds/opt :minLength) int?
   (ds/opt :minProperties) int?
   (ds/opt :minimum) float?
   (ds/opt :multipleOf) float?
   (ds/opt :not) v1-json-schema-props
   (ds/opt :nullable) boolean?
   (ds/opt :oneOf) (s/coll-of v1-json-schema-props)
   (ds/opt :pattern) string?
   (ds/opt :patternProperties) (s/map-of string? v1-json-schema-props)
   (ds/opt :properties) (s/map-of string? v1-json-schema-props)
   (ds/opt :required) (s/coll-of string?)
   (ds/opt :title) string?
   (ds/opt :type) string?
   (ds/opt :uniqueItems) boolean?
   (ds/opt :x-kubernetes-embedded-resource) boolean?
   (ds/opt :x-kubernetes-int-or-string) boolean?
   (ds/opt :x-kubernetes-list-map-keys) (s/coll-of string?)
   (ds/opt :x-kubernetes-list-type) string?
   (ds/opt :x-kubernetes-map-type) string?
   (ds/opt :x-kubernetes-preserve-unknown-fields) boolean?
   })

(def v1-json-schema-props
  (ds/spec
    {:name ::v1-json-schema-props
     :spec v1-json-schema-props-data}))

