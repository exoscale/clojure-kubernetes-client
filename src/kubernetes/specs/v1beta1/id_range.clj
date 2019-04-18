(ns kubernetes.specs.v1beta1/id-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/id-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def v1beta1/id-range-spec
  (ds/spec
    {:name ::v1beta1/id-range
     :spec v1beta1/id-range-data}))
