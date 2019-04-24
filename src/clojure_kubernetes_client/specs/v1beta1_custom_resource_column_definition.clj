(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-column-definition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-column-definition-data v1beta1-custom-resource-column-definition)
(def v1beta1-custom-resource-column-definition-data
  {
   (ds/req :JSONPath) string?
   (ds/opt :description) string?
   (ds/opt :format) string?
   (ds/req :name) string?
   (ds/opt :priority) int?
   (ds/req :type) string?
   })

(def v1beta1-custom-resource-column-definition
  (ds/spec
    {:name ::v1beta1-custom-resource-column-definition
     :spec v1beta1-custom-resource-column-definition-data}))

