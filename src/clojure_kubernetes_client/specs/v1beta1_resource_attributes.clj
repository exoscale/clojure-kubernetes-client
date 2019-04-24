(ns clojure-kubernetes-client.specs.v1beta1-resource-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-resource-attributes-data v1beta1-resource-attributes)
(def v1beta1-resource-attributes-data
  {
   (ds/opt :group) string?
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   (ds/opt :resource) string?
   (ds/opt :subresource) string?
   (ds/opt :verb) string?
   (ds/opt :version) string?
   })

(def v1beta1-resource-attributes
  (ds/spec
    {:name ::v1beta1-resource-attributes
     :spec v1beta1-resource-attributes-data}))

