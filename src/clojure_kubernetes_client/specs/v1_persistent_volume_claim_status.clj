(ns clojure-kubernetes-client.specs.v1-persistent-volume-claim-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-claim-status-data v1-persistent-volume-claim-status)
(def v1-persistent-volume-claim-status-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :conditions) (s/coll-of v1-persistent-volume-claim-condition)
   (ds/opt :phase) string?
   })

(def v1-persistent-volume-claim-status
  (ds/spec
    {:name ::v1-persistent-volume-claim-status
     :spec v1-persistent-volume-claim-status-data}))

