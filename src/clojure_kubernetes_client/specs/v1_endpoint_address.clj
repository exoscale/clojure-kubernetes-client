(ns clojure-kubernetes-client.specs.v1-endpoint-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-endpoint-address-data v1-endpoint-address)
(def v1-endpoint-address-data
  {
   (ds/opt :hostname) string?
   (ds/req :ip) string?
   (ds/opt :nodeName) string?
   (ds/opt :targetRef) v1-object-reference
   })

(def v1-endpoint-address
  (ds/spec
    {:name ::v1-endpoint-address
     :spec v1-endpoint-address-data}))

