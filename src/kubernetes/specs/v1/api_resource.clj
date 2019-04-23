(ns kubernetes.specs.v1/api-resource
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/api-resource-data
  {
   (ds/opt :categories) (s/coll-of string?)
   (ds/opt :group) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/req :namespaced) boolean?
   (ds/opt :shortNames) (s/coll-of string?)
   (ds/req :singularName) string?
   (ds/opt :storageVersionHash) string?
   (ds/req :verbs) (s/coll-of string?)
   (ds/opt :version) string?
   })

(def v1/api-resource-spec
  (ds/spec
    {:name ::v1/api-resource
     :spec v1/api-resource-data}))
