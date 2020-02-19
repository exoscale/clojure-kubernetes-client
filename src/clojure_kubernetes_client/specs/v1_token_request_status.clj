(ns clojure-kubernetes-client.specs.v1-token-request-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-token-request-status-data v1-token-request-status)
(def v1-token-request-status-data
  {
   (ds/req :expirationTimestamp) inst?
   (ds/req :token) string?
   })

(def v1-token-request-status
  (ds/spec
    {:name ::v1-token-request-status
     :spec v1-token-request-status-data}))

