(ns kubernetes.specs.v1/service-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(def v1/service-status-data
  {
   (ds/opt :loadBalancer) v1/load-balancer-status-spec
   })

(def v1/service-status-spec
  (ds/spec
    {:name ::v1/service-status
     :spec v1/service-status-data}))
