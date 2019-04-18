(ns kubernetes.specs.v1beta2/controller-revision-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta2/controller-revision :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/controller-revision-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta2/controller-revision-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1beta2/controller-revision-list-spec
  (ds/spec
    {:name ::v1beta2/controller-revision-list
     :spec v1beta2/controller-revision-list-data}))
