(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-status-data extensions-v1beta1-ingress-status)
(def extensions-v1beta1-ingress-status-data
  {
   (ds/opt :loadBalancer) v1-load-balancer-status
   })

(def extensions-v1beta1-ingress-status
  (ds/spec
    {:name ::extensions-v1beta1-ingress-status
     :spec extensions-v1beta1-ingress-status-data}))

