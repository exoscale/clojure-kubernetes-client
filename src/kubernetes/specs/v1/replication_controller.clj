(ns kubernetes.specs.v1/replication-controller
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/replication-controller-spec :refer :all]
            [kubernetes.specs.v1/replication-controller-status :refer :all]
            )
  (:import (java.io File)))


(def v1/replication-controller-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/replication-controller-spec-spec
   (ds/opt :status) v1/replication-controller-status-spec
   })

(def v1/replication-controller-spec
  (ds/spec
    {:name ::v1/replication-controller
     :spec v1/replication-controller-data}))
