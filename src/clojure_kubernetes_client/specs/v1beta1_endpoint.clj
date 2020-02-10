(ns clojure-kubernetes-client.specs.v1beta1-endpoint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-conditions :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-endpoint-data v1beta1-endpoint)
(def v1beta1-endpoint-data
  {
   (ds/req :addresses) (s/coll-of string?)
   (ds/opt :conditions) v1beta1-endpoint-conditions
   (ds/opt :hostname) string?
   (ds/opt :targetRef) v1-object-reference
   (ds/opt :topology) (s/map-of string? string?)
   })

(def v1beta1-endpoint
  (ds/spec
    {:name ::v1beta1-endpoint
     :spec v1beta1-endpoint-data}))

