(ns clojure-kubernetes-client.specs.v1-status-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-status-cause :refer :all]
            )
  (:import (java.io File)))


(declare v1-status-details-data v1-status-details)
(def v1-status-details-data
  {
   (ds/opt :causes) (s/coll-of v1-status-cause)
   (ds/opt :group) string?
   (ds/opt :kind) string?
   (ds/opt :name) string?
   (ds/opt :retryAfterSeconds) int?
   (ds/opt :uid) string?
   })

(def v1-status-details
  (ds/spec
    {:name ::v1-status-details
     :spec v1-status-details-data}))

