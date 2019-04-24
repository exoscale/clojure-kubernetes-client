(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-status-data networking-v1beta1-ingress-status)
(def networking-v1beta1-ingress-status-data
  {
   (ds/opt :loadBalancer) v1-load-balancer-status
   })

(def networking-v1beta1-ingress-status
  (ds/spec
    {:name ::networking-v1beta1-ingress-status
     :spec networking-v1beta1-ingress-status-data}))

