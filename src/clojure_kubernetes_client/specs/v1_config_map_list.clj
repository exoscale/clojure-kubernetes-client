(ns clojure-kubernetes-client.specs.v1-config-map-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-config-map :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-config-map-list-data v1-config-map-list)
(def v1-config-map-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-config-map)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-config-map-list
  (ds/spec
    {:name ::v1-config-map-list
     :spec v1-config-map-list-data}))

