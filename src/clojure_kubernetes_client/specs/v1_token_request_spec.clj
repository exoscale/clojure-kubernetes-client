(ns clojure-kubernetes-client.specs.v1-token-request-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-bound-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-token-request-spec-data v1-token-request-spec)
(def v1-token-request-spec-data
  {
   (ds/req :audiences) (s/coll-of string?)
   (ds/opt :boundObjectRef) v1-bound-object-reference
   (ds/opt :expirationSeconds) int?
   })

(def v1-token-request-spec
  (ds/spec
    {:name ::v1-token-request-spec
     :spec v1-token-request-spec-data}))

