(ns clojure-kubernetes-client.specs.v1-object-field-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-object-field-selector-data v1-object-field-selector)
(def v1-object-field-selector-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :fieldPath) string?
   })

(def v1-object-field-selector
  (ds/spec
    {:name ::v1-object-field-selector
     :spec v1-object-field-selector-data}))

