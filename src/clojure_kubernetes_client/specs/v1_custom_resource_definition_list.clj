(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-list-data v1-custom-resource-definition-list)
(def v1-custom-resource-definition-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-custom-resource-definition)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-custom-resource-definition-list
  (ds/spec
    {:name ::v1-custom-resource-definition-list
     :spec v1-custom-resource-definition-list-data}))

