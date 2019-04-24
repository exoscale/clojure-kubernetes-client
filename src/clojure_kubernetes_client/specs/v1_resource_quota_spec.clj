(ns clojure-kubernetes-client.specs.v1-resource-quota-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-scope-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-resource-quota-spec-data v1-resource-quota-spec)
(def v1-resource-quota-spec-data
  {
   (ds/opt :hard) (s/map-of string? string?)
   (ds/opt :scopeSelector) v1-scope-selector
   (ds/opt :scopes) (s/coll-of string?)
   })

(def v1-resource-quota-spec
  (ds/spec
    {:name ::v1-resource-quota-spec
     :spec v1-resource-quota-spec-data}))

