(ns kubernetes.specs.v1/resource-quota
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/resource-quota-spec :refer :all]
            [kubernetes.specs.v1/resource-quota-status :refer :all]
            )
  (:import (java.io File)))


(def v1/resource-quota-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/resource-quota-spec-spec
   (ds/opt :status) v1/resource-quota-status-spec
   })

(def v1/resource-quota-spec
  (ds/spec
    {:name ::v1/resource-quota
     :spec v1/resource-quota-data}))
