(ns clojure-kubernetes-client.specs.v1-api-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-group-version-for-discovery :refer :all]
            [clojure-kubernetes-client.specs.v1-server-address-by-client-cidr :refer :all]
            [clojure-kubernetes-client.specs.v1-group-version-for-discovery :refer :all]
            )
  (:import (java.io File)))


(declare v1-api-group-data v1-api-group)
(def v1-api-group-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/opt :preferredVersion) v1-group-version-for-discovery
   (ds/opt :serverAddressByClientCIDRs) (s/coll-of v1-server-address-by-client-cidr)
   (ds/req :versions) (s/coll-of v1-group-version-for-discovery)
   })

(def v1-api-group
  (ds/spec
    {:name ::v1-api-group
     :spec v1-api-group-data}))

