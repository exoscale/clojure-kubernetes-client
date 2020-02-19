(ns clojure-kubernetes-client.specs.v1beta1-endpoint-slice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-endpoint :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-port :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-endpoint-slice-data v1beta1-endpoint-slice)
(def v1beta1-endpoint-slice-data
  {
   (ds/req :addressType) string?
   (ds/opt :apiVersion) string?
   (ds/req :endpoints) (s/coll-of v1beta1-endpoint)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :ports) (s/coll-of v1beta1-endpoint-port)
   })

(def v1beta1-endpoint-slice
  (ds/spec
    {:name ::v1beta1-endpoint-slice
     :spec v1beta1-endpoint-slice-data}))

