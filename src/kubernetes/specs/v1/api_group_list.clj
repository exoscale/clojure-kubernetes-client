(ns kubernetes.specs.v1/api-group-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/api-group :refer :all]
            )
  (:import (java.io File)))


(def v1/api-group-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :groups) (s/coll-of v1/api-group-spec)
   (ds/opt :kind) string?
   })

(def v1/api-group-list-spec
  (ds/spec
    {:name ::v1/api-group-list
     :spec v1/api-group-list-data}))
