(ns clojure-kubernetes-client.specs.v1-service-account-token-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-service-account-token-projection-data v1-service-account-token-projection)
(def v1-service-account-token-projection-data
  {
   (ds/opt :audience) string?
   (ds/opt :expirationSeconds) int?
   (ds/req :path) string?
   })

(def v1-service-account-token-projection
  (ds/spec
    {:name ::v1-service-account-token-projection
     :spec v1-service-account-token-projection-data}))

