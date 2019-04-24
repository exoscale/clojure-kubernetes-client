(ns clojure-kubernetes-client.specs.v1-api-versions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-server-address-by-client-cidr :refer :all]
            )
  (:import (java.io File)))


(declare v1-api-versions-data v1-api-versions)
(def v1-api-versions-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :serverAddressByClientCIDRs) (s/coll-of v1-server-address-by-client-cidr)
   (ds/req :versions) (s/coll-of string?)
   })

(def v1-api-versions
  (ds/spec
    {:name ::v1-api-versions
     :spec v1-api-versions-data}))

