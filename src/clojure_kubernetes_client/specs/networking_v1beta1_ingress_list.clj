(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-list-data networking-v1beta1-ingress-list)
(def networking-v1beta1-ingress-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of networking-v1beta1-ingress)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def networking-v1beta1-ingress-list
  (ds/spec
    {:name ::networking-v1beta1-ingress-list
     :spec networking-v1beta1-ingress-list-data}))

