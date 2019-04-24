(ns clojure-kubernetes-client.specs.v1-load-balancer-ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-load-balancer-ingress-data v1-load-balancer-ingress)
(def v1-load-balancer-ingress-data
  {
   (ds/opt :hostname) string?
   (ds/opt :ip) string?
   })

(def v1-load-balancer-ingress
  (ds/spec
    {:name ::v1-load-balancer-ingress
     :spec v1-load-balancer-ingress-data}))

