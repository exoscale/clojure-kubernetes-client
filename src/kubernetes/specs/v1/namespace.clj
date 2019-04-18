(ns kubernetes.specs.v1/namespace
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/namespace-spec :refer :all]
            [kubernetes.specs.v1/namespace-status :refer :all]
            )
  (:import (java.io File)))


(def v1/namespace-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/namespace-spec-spec
   (ds/opt :status) v1/namespace-status-spec
   })

(def v1/namespace-spec
  (ds/spec
    {:name ::v1/namespace
     :spec v1/namespace-data}))
