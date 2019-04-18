(ns kubernetes.specs.v1/delete-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/preconditions :refer :all]
            )
  (:import (java.io File)))


(def v1/delete-options-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :gracePeriodSeconds) int?
   (ds/opt :kind) string?
   (ds/opt :orphanDependents) boolean?
   (ds/opt :preconditions) v1/preconditions-spec
   (ds/opt :propagationPolicy) string?
   })

(def v1/delete-options-spec
  (ds/spec
    {:name ::v1/delete-options
     :spec v1/delete-options-data}))
