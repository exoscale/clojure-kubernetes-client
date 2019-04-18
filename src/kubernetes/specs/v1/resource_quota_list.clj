(ns kubernetes.specs.v1/resource-quota-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/resource-quota :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/resource-quota-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/resource-quota-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/resource-quota-list-spec
  (ds/spec
    {:name ::v1/resource-quota-list
     :spec v1/resource-quota-list-data}))
