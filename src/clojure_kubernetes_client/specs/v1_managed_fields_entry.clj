(ns clojure-kubernetes-client.specs.v1-managed-fields-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-managed-fields-entry-data v1-managed-fields-entry)
(def v1-managed-fields-entry-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :fieldsType) string?
   (ds/opt :fieldsV1) any?
   (ds/opt :manager) string?
   (ds/opt :operation) string?
   (ds/opt :time) inst?
   })

(def v1-managed-fields-entry
  (ds/spec
    {:name ::v1-managed-fields-entry
     :spec v1-managed-fields-entry-data}))

