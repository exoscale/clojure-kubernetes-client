(ns clojure-kubernetes-client.specs.v1-resource-quota
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-resource-quota-data v1-resource-quota)
(def v1-resource-quota-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-resource-quota-spec
   (ds/opt :status) v1-resource-quota-status
   })

(def v1-resource-quota
  (ds/spec
    {:name ::v1-resource-quota
     :spec v1-resource-quota-data}))

