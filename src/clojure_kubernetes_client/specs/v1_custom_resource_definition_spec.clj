(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-custom-resource-conversion :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-names :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-version :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-spec-data v1-custom-resource-definition-spec)
(def v1-custom-resource-definition-spec-data
  {
   (ds/opt :conversion) v1-custom-resource-conversion
   (ds/req :group) string?
   (ds/req :names) v1-custom-resource-definition-names
   (ds/opt :preserveUnknownFields) boolean?
   (ds/req :scope) string?
   (ds/req :versions) (s/coll-of v1-custom-resource-definition-version)
   })

(def v1-custom-resource-definition-spec
  (ds/spec
    {:name ::v1-custom-resource-definition-spec
     :spec v1-custom-resource-definition-spec-data}))

