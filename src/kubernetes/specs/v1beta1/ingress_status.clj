(ns kubernetes.specs.v1beta1/ingress-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/ingress-status-data
  {
   (ds/opt :loadBalancer) v1/load-balancer-status-spec
   })

(def v1beta1/ingress-status-spec
  (ds/spec
    {:name ::v1beta1/ingress-status
     :spec v1beta1/ingress-status-data}))
