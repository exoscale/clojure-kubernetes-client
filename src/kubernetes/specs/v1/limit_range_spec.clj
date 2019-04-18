(ns kubernetes.specs.v1/limit-range-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/limit-range-item :refer :all]
            )
  (:import (java.io File)))


(def v1/limit-range-spec-data
  {
   (ds/req :limits) (s/coll-of v1/limit-range-item-spec)
   })

(def v1/limit-range-spec-spec
  (ds/spec
    {:name ::v1/limit-range-spec
     :spec v1/limit-range-spec-data}))
