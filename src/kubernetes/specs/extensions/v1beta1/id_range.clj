(ns kubernetes.specs.extensions/v1beta1/id-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extensions/v1beta1/id-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def extensions/v1beta1/id-range-spec
  (ds/spec
    {:name ::extensions/v1beta1/id-range
     :spec extensions/v1beta1/id-range-data}))
