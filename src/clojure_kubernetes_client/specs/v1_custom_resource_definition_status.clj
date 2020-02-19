(ns clojure-kubernetes-client.specs.v1-custom-resource-definition-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-names :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-custom-resource-definition-status-data v1-custom-resource-definition-status)
(def v1-custom-resource-definition-status-data
  {
   (ds/req :acceptedNames) v1-custom-resource-definition-names
   (ds/opt :conditions) (s/coll-of v1-custom-resource-definition-condition)
   (ds/req :storedVersions) (s/coll-of string?)
   })

(def v1-custom-resource-definition-status
  (ds/spec
    {:name ::v1-custom-resource-definition-status
     :spec v1-custom-resource-definition-status-data}))

