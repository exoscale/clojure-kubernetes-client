(ns clojure-kubernetes-client.specs.v1-preconditions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-preconditions-data v1-preconditions)
(def v1-preconditions-data
  {
   (ds/opt :resourceVersion) string?
   (ds/opt :uid) string?
   })

(def v1-preconditions
  (ds/spec
    {:name ::v1-preconditions
     :spec v1-preconditions-data}))

