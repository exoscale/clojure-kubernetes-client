(ns kubernetes.specs.extensions/v1beta1/ingress-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/ingress-status-data
  {
   (ds/opt :loadBalancer) v1/load-balancer-status-spec
   })

(def extensions/v1beta1/ingress-status-spec
  (ds/spec
    {:name ::extensions/v1beta1/ingress-status
     :spec extensions/v1beta1/ingress-status-data}))
