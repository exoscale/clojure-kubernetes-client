(ns clojure-kubernetes-client.specs.v1-user-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-user-info-data v1-user-info)
(def v1-user-info-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/opt :uid) string?
   (ds/opt :username) string?
   })

(def v1-user-info
  (ds/spec
    {:name ::v1-user-info
     :spec v1-user-info-data}))

