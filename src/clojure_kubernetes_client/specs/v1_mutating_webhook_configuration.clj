(ns clojure-kubernetes-client.specs.v1-mutating-webhook-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-mutating-webhook :refer :all]
            )
  (:import (java.io File)))


(declare v1-mutating-webhook-configuration-data v1-mutating-webhook-configuration)
(def v1-mutating-webhook-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :webhooks) (s/coll-of v1-mutating-webhook)
   })

(def v1-mutating-webhook-configuration
  (ds/spec
    {:name ::v1-mutating-webhook-configuration
     :spec v1-mutating-webhook-configuration-data}))

