(ns clojure-kubernetes-client.specs.v1-token-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-user-info :refer :all]
            )
  (:import (java.io File)))


(declare v1-token-review-status-data v1-token-review-status)
(def v1-token-review-status-data
  {
   (ds/opt :audiences) (s/coll-of string?)
   (ds/opt :authenticated) boolean?
   (ds/opt :error) string?
   (ds/opt :user) v1-user-info
   })

(def v1-token-review-status
  (ds/spec
    {:name ::v1-token-review-status
     :spec v1-token-review-status-data}))

