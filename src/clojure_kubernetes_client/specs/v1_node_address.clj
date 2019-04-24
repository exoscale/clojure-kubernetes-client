(ns clojure-kubernetes-client.specs.v1-node-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-node-address-data v1-node-address)
(def v1-node-address-data
  {
   (ds/req :address) string?
   (ds/req :type) string?
   })

(def v1-node-address
  (ds/spec
    {:name ::v1-node-address
     :spec v1-node-address-data}))

