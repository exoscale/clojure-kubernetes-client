(ns clojure-kubernetes-client.specs.v1-api-group-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-api-group :refer :all]
            )
  (:import (java.io File)))


(declare v1-api-group-list-data v1-api-group-list)
(def v1-api-group-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :groups) (s/coll-of v1-api-group)
   (ds/opt :kind) string?
   })

(def v1-api-group-list
  (ds/spec
    {:name ::v1-api-group-list
     :spec v1-api-group-list-data}))

