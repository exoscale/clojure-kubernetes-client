(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-custom-resource-column-definition :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-validation :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-subresources :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-version-data v1-custom-resource-definition-version)
(def v1-custom-resource-definition-version-data
  {
   (ds/opt :additionalPrinterColumns) (s/coll-of v1-custom-resource-column-definition)
   (ds/req :name) string?
   (ds/opt :schema) v1-custom-resource-validation
   (ds/req :served) boolean?
   (ds/req :storage) boolean?
   (ds/opt :subresources) v1-custom-resource-subresources
   })

(def v1-custom-resource-definition-version
  (ds/spec
    {:name ::v1-custom-resource-definition-version
     :spec v1-custom-resource-definition-version-data}))

