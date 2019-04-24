(ns clojure-kubernetes-client.specs.v1-service-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-status-data v1-service-status)
(def v1-service-status-data
  {
   (ds/opt :loadBalancer) v1-load-balancer-status
   })

(def v1-service-status
  (ds/spec
    {:name ::v1-service-status
     :spec v1-service-status-data}))

