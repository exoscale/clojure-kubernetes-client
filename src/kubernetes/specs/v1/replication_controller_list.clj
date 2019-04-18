(ns kubernetes.specs.v1/replication-controller-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/replication-controller :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/replication-controller-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/replication-controller-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/replication-controller-list-spec
  (ds/spec
    {:name ::v1/replication-controller-list
     :spec v1/replication-controller-list-data}))
