(ns kubernetes.specs.v1beta1/non-resource-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/non-resource-rule-data
  {
   (ds/opt :nonResourceURLs) (s/coll-of string?)
   (ds/req :verbs) (s/coll-of string?)
   })

(def v1beta1/non-resource-rule-spec
  (ds/spec
    {:name ::v1beta1/non-resource-rule
     :spec v1beta1/non-resource-rule-data}))
