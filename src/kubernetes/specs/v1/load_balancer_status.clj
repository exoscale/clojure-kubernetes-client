(ns kubernetes.specs.v1/load-balancer-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/load-balancer-ingress :refer :all]
            )
  (:import (java.io File)))


(def v1/load-balancer-status-data
  {
   (ds/opt :ingress) (s/coll-of v1/load-balancer-ingress-spec)
   })

(def v1/load-balancer-status-spec
  (ds/spec
    {:name ::v1/load-balancer-status
     :spec v1/load-balancer-status-data}))
