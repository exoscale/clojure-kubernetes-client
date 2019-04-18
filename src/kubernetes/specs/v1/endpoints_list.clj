(ns kubernetes.specs.v1/endpoints-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/endpoints :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/endpoints-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/endpoints-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/endpoints-list-spec
  (ds/spec
    {:name ::v1/endpoints-list
     :spec v1/endpoints-list-data}))
