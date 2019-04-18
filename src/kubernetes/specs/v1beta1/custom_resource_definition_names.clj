(ns kubernetes.specs.v1beta1/custom-resource-definition-names
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/custom-resource-definition-names-data
  {
   (ds/req :kind) string?
   (ds/opt :listKind) string?
   (ds/req :plural) string?
   (ds/opt :shortNames) (s/coll-of string?)
   (ds/opt :singular) string?
   })

(def v1beta1/custom-resource-definition-names-spec
  (ds/spec
    {:name ::v1beta1/custom-resource-definition-names
     :spec v1beta1/custom-resource-definition-names-data}))
