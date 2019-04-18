(ns kubernetes.specs.v1/replication-controller-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(def v1/replication-controller-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :template) v1/pod-template-spec-spec
   })

(def v1/replication-controller-spec-spec
  (ds/spec
    {:name ::v1/replication-controller-spec
     :spec v1/replication-controller-spec-data}))
