(ns clojure-kubernetes-client.specs.v1-object-meta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-managed-fields-entry :refer :all]
            [clojure-kubernetes-client.specs.v1-owner-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-object-meta-data v1-object-meta)
(def v1-object-meta-data
  {
   (ds/opt :annotations) (s/map-of string? string?)
   (ds/opt :clusterName) string?
   (ds/opt :creationTimestamp) inst?
   (ds/opt :deletionGracePeriodSeconds) int?
   (ds/opt :deletionTimestamp) inst?
   (ds/opt :finalizers) (s/coll-of string?)
   (ds/opt :generateName) string?
   (ds/opt :generation) int?
   (ds/opt :labels) (s/map-of string? string?)
   (ds/opt :managedFields) (s/coll-of v1-managed-fields-entry)
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   (ds/opt :ownerReferences) (s/coll-of v1-owner-reference)
   (ds/opt :resourceVersion) string?
   (ds/opt :selfLink) string?
   (ds/opt :uid) string?
   })

(def v1-object-meta
  (ds/spec
    {:name ::v1-object-meta
     :spec v1-object-meta-data}))

