(ns kubernetes.specs.policy/v1beta1/host-port-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def policy/v1beta1/host-port-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def policy/v1beta1/host-port-range-spec
  (ds/spec
    {:name ::policy/v1beta1/host-port-range
     :spec policy/v1beta1/host-port-range-data}))
