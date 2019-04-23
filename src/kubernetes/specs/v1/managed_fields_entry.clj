(ns kubernetes.specs.v1/managed-fields-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs. :refer :all]
            )
  (:import (java.io File)))


(def v1/managed-fields-entry-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :fields) any?
   (ds/opt :manager) string?
   (ds/opt :operation) string?
   (ds/opt :time) inst?
   })

(def v1/managed-fields-entry-spec
  (ds/spec
    {:name ::v1/managed-fields-entry
     :spec v1/managed-fields-entry-data}))
