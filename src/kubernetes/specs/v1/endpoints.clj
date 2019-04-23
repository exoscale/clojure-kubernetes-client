(ns kubernetes.specs.v1/endpoints
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/endpoint-subset :refer :all]
            )
  (:import (java.io File)))


(def v1/endpoints-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :subsets) (s/coll-of v1/endpoint-subset-spec)
   })

(def v1/endpoints-spec
  (ds/spec
    {:name ::v1/endpoints
     :spec v1/endpoints-data}))
