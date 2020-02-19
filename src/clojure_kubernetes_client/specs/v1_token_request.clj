(ns clojure-kubernetes-client.specs.v1-token-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-token-request-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-token-request-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-token-request-data v1-token-request)
(def v1-token-request-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-token-request-spec
   (ds/opt :status) v1-token-request-status
   })

(def v1-token-request
  (ds/spec
    {:name ::v1-token-request
     :spec v1-token-request-data}))

