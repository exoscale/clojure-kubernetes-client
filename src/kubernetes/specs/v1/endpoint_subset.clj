(ns kubernetes.specs.v1/endpoint-subset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/endpoint-address :refer :all]
            [kubernetes.specs.v1/endpoint-address :refer :all]
            [kubernetes.specs.v1/endpoint-port :refer :all]
            )
  (:import (java.io File)))


(def v1/endpoint-subset-data
  {
   (ds/opt :addresses) (s/coll-of v1/endpoint-address-spec)
   (ds/opt :notReadyAddresses) (s/coll-of v1/endpoint-address-spec)
   (ds/opt :ports) (s/coll-of v1/endpoint-port-spec)
   })

(def v1/endpoint-subset-spec
  (ds/spec
    {:name ::v1/endpoint-subset
     :spec v1/endpoint-subset-data}))
