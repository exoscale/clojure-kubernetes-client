(ns clojure-kubernetes-client.specs.v1beta1-token-review-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-token-review-spec-data v1beta1-token-review-spec)
(def v1beta1-token-review-spec-data
  {
   (ds/opt :audiences) (s/coll-of string?)
   (ds/opt :token) string?
   })

(def v1beta1-token-review-spec
  (ds/spec
    {:name ::v1beta1-token-review-spec
     :spec v1beta1-token-review-spec-data}))

