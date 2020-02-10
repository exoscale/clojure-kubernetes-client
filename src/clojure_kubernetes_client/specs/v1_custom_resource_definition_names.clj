(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-names
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-names-data v1-custom-resource-definition-names)
(def v1-custom-resource-definition-names-data
  {
   (ds/opt :categories) (s/coll-of string?)
   (ds/req :kind) string?
   (ds/opt :listKind) string?
   (ds/req :plural) string?
   (ds/opt :shortNames) (s/coll-of string?)
   (ds/opt :singular) string?
   })

(def v1-custom-resource-definition-names
  (ds/spec
    {:name ::v1-custom-resource-definition-names
     :spec v1-custom-resource-definition-names-data}))

