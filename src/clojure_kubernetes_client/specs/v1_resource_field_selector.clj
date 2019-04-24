(ns clojure-kubernetes-client.specs.v1-resource-field-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-resource-field-selector-data v1-resource-field-selector)
(def v1-resource-field-selector-data
  {
   (ds/opt :containerName) string?
   (ds/opt :divisor) string?
   (ds/req :resource) string?
   })

(def v1-resource-field-selector
  (ds/spec
    {:name ::v1-resource-field-selector
     :spec v1-resource-field-selector-data}))

