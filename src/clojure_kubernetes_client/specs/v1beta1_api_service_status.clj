(ns clojure-kubernetes-client.specs.v1beta1-api-service-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-api-service-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-api-service-status-data v1beta1-api-service-status)
(def v1beta1-api-service-status-data
  {
   (ds/opt :conditions) (s/coll-of v1beta1-api-service-condition)
   })

(def v1beta1-api-service-status
  (ds/spec
    {:name ::v1beta1-api-service-status
     :spec v1beta1-api-service-status-data}))

