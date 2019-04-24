(ns clojure-kubernetes-client.specs.v1beta1-token-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-user-info :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-token-review-status-data v1beta1-token-review-status)
(def v1beta1-token-review-status-data
  {
   (ds/opt :audiences) (s/coll-of string?)
   (ds/opt :authenticated) boolean?
   (ds/opt :error) string?
   (ds/opt :user) v1beta1-user-info
   })

(def v1beta1-token-review-status
  (ds/spec
    {:name ::v1beta1-token-review-status
     :spec v1beta1-token-review-status-data}))

