(ns kubernetes.specs.v1beta1/host-port-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/host-port-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def v1beta1/host-port-range-spec
  (ds/spec
    {:name ::v1beta1/host-port-range
     :spec v1beta1/host-port-range-data}))
