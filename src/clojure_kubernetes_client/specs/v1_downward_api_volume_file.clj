(ns clojure-kubernetes-client.specs.v1-downward-api-volume-file
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-field-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-field-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-downward-api-volume-file-data v1-downward-api-volume-file)
(def v1-downward-api-volume-file-data
  {
   (ds/opt :fieldRef) v1-object-field-selector
   (ds/opt :mode) int?
   (ds/req :path) string?
   (ds/opt :resourceFieldRef) v1-resource-field-selector
   })

(def v1-downward-api-volume-file
  (ds/spec
    {:name ::v1-downward-api-volume-file
     :spec v1-downward-api-volume-file-data}))

