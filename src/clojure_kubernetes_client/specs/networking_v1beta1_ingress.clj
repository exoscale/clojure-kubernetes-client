(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-spec :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-status :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-data networking-v1beta1-ingress)
(def networking-v1beta1-ingress-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) networking-v1beta1-ingress-spec
   (ds/opt :status) networking-v1beta1-ingress-status
   })

(def networking-v1beta1-ingress
  (ds/spec
    {:name ::networking-v1beta1-ingress
     :spec networking-v1beta1-ingress-data}))

