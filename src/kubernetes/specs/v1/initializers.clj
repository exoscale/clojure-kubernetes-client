(ns kubernetes.specs.v1/initializers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/initializer :refer :all]
            [kubernetes.specs.v1/status :refer :all]
            )
  (:import (java.io File)))


(def v1/initializers-data
  {
   (ds/req :pending) (s/coll-of v1/initializer-spec)
   (ds/opt :result) v1/status-spec
   })

(def v1/initializers-spec
  (ds/spec
    {:name ::v1/initializers
     :spec v1/initializers-data}))
