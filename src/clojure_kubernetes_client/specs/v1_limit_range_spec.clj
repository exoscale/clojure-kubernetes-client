(ns clojure-kubernetes-client.specs.v1-limit-range-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-limit-range-item :refer :all]
            )
  (:import (java.io File)))


(declare v1-limit-range-spec-data v1-limit-range-spec)
(def v1-limit-range-spec-data
  {
   (ds/req :limits) (s/coll-of v1-limit-range-item)
   })

(def v1-limit-range-spec
  (ds/spec
    {:name ::v1-limit-range-spec
     :spec v1-limit-range-spec-data}))

