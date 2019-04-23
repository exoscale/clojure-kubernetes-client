(ns kubernetes.specs.v1/api-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/group-version-for-discovery :refer :all]
            [kubernetes.specs.v1/server-address-by-client-cidr :refer :all]
            [kubernetes.specs.v1/group-version-for-discovery :refer :all]
            )
  (:import (java.io File)))


(def v1/api-group-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :name) string?
   (ds/opt :preferredVersion) v1/group-version-for-discovery-spec
   (ds/opt :serverAddressByClientCIDRs) (s/coll-of v1/server-address-by-client-cidr-spec)
   (ds/req :versions) (s/coll-of v1/group-version-for-discovery-spec)
   })

(def v1/api-group-spec
  (ds/spec
    {:name ::v1/api-group
     :spec v1/api-group-data}))
