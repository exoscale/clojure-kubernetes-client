(ns clojure-kubernetes-client.specs.v1-persistent-volume-claim-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-requirements :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-claim-spec-data v1-persistent-volume-claim-spec)
(def v1-persistent-volume-claim-spec-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :dataSource) v1-typed-local-object-reference
   (ds/opt :resources) v1-resource-requirements
   (ds/opt :selector) v1-label-selector
   (ds/opt :storageClassName) string?
   (ds/opt :volumeMode) string?
   (ds/opt :volumeName) string?
   })

(def v1-persistent-volume-claim-spec
  (ds/spec
    {:name ::v1-persistent-volume-claim-spec
     :spec v1-persistent-volume-claim-spec-data}))

