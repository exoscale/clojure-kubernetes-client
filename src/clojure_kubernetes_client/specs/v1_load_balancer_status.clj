(ns clojure-kubernetes-client.specs.v1-load-balancer-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-load-balancer-ingress :refer :all]
            )
  (:import (java.io File)))


(declare v1-load-balancer-status-data v1-load-balancer-status)
(def v1-load-balancer-status-data
  {
   (ds/opt :ingress) (s/coll-of v1-load-balancer-ingress)
   })

(def v1-load-balancer-status
  (ds/spec
    {:name ::v1-load-balancer-status
     :spec v1-load-balancer-status-data}))

