(ns kubernetes.specs.policy/v1beta1/id-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def policy/v1beta1/id-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def policy/v1beta1/id-range-spec
  (ds/spec
    {:name ::policy/v1beta1/id-range
     :spec policy/v1beta1/id-range-data}))
