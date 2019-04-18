(ns kubernetes.specs.v1/limit-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/limit-range-spec :refer :all]
            )
  (:import (java.io File)))


(def v1/limit-range-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/limit-range-spec-spec
   })

(def v1/limit-range-spec
  (ds/spec
    {:name ::v1/limit-range
     :spec v1/limit-range-data}))
