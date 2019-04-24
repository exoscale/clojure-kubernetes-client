(ns clojure-kubernetes-client.specs.v1-event-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-event :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-event-list-data v1-event-list)
(def v1-event-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-event)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-event-list
  (ds/spec
    {:name ::v1-event-list
     :spec v1-event-list-data}))

