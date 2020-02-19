(ns clojure-kubernetes-client.specs.v1-custom-resource-column-definition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-custom-resource-column-definition-data v1-custom-resource-column-definition)
(def v1-custom-resource-column-definition-data
  {
   (ds/opt :description) string?
   (ds/opt :format) string?
   (ds/req :jsonPath) string?
   (ds/req :name) string?
   (ds/opt :priority) int?
   (ds/req :type) string?
   })

(def v1-custom-resource-column-definition
  (ds/spec
    {:name ::v1-custom-resource-column-definition
     :spec v1-custom-resource-column-definition-data}))

