(ns clojure-kubernetes-client.specs.v1-server-address-by-client-cidr
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-server-address-by-client-cidr-data v1-server-address-by-client-cidr)
(def v1-server-address-by-client-cidr-data
  {
   (ds/req :clientCIDR) string?
   (ds/req :serverAddress) string?
   })

(def v1-server-address-by-client-cidr
  (ds/spec
    {:name ::v1-server-address-by-client-cidr
     :spec v1-server-address-by-client-cidr-data}))

