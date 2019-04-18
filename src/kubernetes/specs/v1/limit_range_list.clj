(ns kubernetes.specs.v1/limit-range-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/limit-range :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/limit-range-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/limit-range-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/limit-range-list-spec
  (ds/spec
    {:name ::v1/limit-range-list
     :spec v1/limit-range-list-data}))
