(ns clojure-kubernetes-client.specs.v1-delete-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-preconditions :refer :all]
            )
  (:import (java.io File)))


(declare v1-delete-options-data v1-delete-options)
(def v1-delete-options-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :dryRun) (s/coll-of string?)
   (ds/opt :gracePeriodSeconds) int?
   (ds/opt :kind) string?
   (ds/opt :orphanDependents) boolean?
   (ds/opt :preconditions) v1-preconditions
   (ds/opt :propagationPolicy) string?
   })

(def v1-delete-options
  (ds/spec
    {:name ::v1-delete-options
     :spec v1-delete-options-data}))

