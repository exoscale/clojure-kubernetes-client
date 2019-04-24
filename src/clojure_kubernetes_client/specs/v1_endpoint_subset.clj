(ns clojure-kubernetes-client.specs.v1-endpoint-subset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-endpoint-address :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-address :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-port :refer :all]
            )
  (:import (java.io File)))


(declare v1-endpoint-subset-data v1-endpoint-subset)
(def v1-endpoint-subset-data
  {
   (ds/opt :addresses) (s/coll-of v1-endpoint-address)
   (ds/opt :notReadyAddresses) (s/coll-of v1-endpoint-address)
   (ds/opt :ports) (s/coll-of v1-endpoint-port)
   })

(def v1-endpoint-subset
  (ds/spec
    {:name ::v1-endpoint-subset
     :spec v1-endpoint-subset-data}))

