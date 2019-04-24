(ns clojure-kubernetes-client.specs.extensions-v1beta1-host-port-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-host-port-range-data extensions-v1beta1-host-port-range)
(def extensions-v1beta1-host-port-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def extensions-v1beta1-host-port-range
  (ds/spec
    {:name ::extensions-v1beta1-host-port-range
     :spec extensions-v1beta1-host-port-range-data}))

