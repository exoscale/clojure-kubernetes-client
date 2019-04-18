(ns kubernetes.specs.v1/load-balancer-ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/load-balancer-ingress-data
  {
   (ds/opt :hostname) string?
   (ds/opt :ip) string?
   })

(def v1/load-balancer-ingress-spec
  (ds/spec
    {:name ::v1/load-balancer-ingress
     :spec v1/load-balancer-ingress-data}))
