(ns clojure-kubernetes-client.specs.v1beta1-non-resource-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-non-resource-attributes-data v1beta1-non-resource-attributes)
(def v1beta1-non-resource-attributes-data
  {
   (ds/opt :path) string?
   (ds/opt :verb) string?
   })

(def v1beta1-non-resource-attributes
  (ds/spec
    {:name ::v1beta1-non-resource-attributes
     :spec v1beta1-non-resource-attributes-data}))

