(ns kubernetes.specs.v1/namespace-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/namespace :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/namespace-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/namespace-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/namespace-list-spec
  (ds/spec
    {:name ::v1/namespace-list
     :spec v1/namespace-list-data}))
