(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-column-definition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-conversion :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-names :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-subresources :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-validation :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-version :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-definition-spec-data v1beta1-custom-resource-definition-spec)
(def v1beta1-custom-resource-definition-spec-data
  {
   (ds/opt :additionalPrinterColumns) (s/coll-of v1beta1-custom-resource-column-definition)
   (ds/opt :conversion) v1beta1-custom-resource-conversion
   (ds/req :group) string?
   (ds/req :names) v1beta1-custom-resource-definition-names
   (ds/opt :preserveUnknownFields) boolean?
   (ds/req :scope) string?
   (ds/opt :subresources) v1beta1-custom-resource-subresources
   (ds/opt :validation) v1beta1-custom-resource-validation
   (ds/opt :version) string?
   (ds/opt :versions) (s/coll-of v1beta1-custom-resource-definition-version)
   })

(def v1beta1-custom-resource-definition-spec
  (ds/spec
    {:name ::v1beta1-custom-resource-definition-spec
     :spec v1beta1-custom-resource-definition-spec-data}))

