(ns kubernetes.specs.v1/api-versions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/server-address-by-client-cidr :refer :all]
            )
  (:import (java.io File)))


(def v1/api-versions-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/req :serverAddressByClientCIDRs) (s/coll-of v1/server-address-by-client-cidr-spec)
   (ds/req :versions) (s/coll-of string?)
   })

(def v1/api-versions-spec
  (ds/spec
    {:name ::v1/api-versions
     :spec v1/api-versions-data}))
