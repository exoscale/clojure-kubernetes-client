(ns kubernetes.specs.v1/api-resource-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/api-resource :refer :all]
            )
  (:import (java.io File)))


(def v1/api-resource-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :groupVersion) string?
   (ds/opt :kind) string?
   (ds/req :resources) (s/coll-of v1/api-resource-spec)
   })

(def v1/api-resource-list-spec
  (ds/spec
    {:name ::v1/api-resource-list
     :spec v1/api-resource-list-data}))
