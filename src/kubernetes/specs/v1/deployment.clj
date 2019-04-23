(ns kubernetes.specs.v1/deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/deployment-spec :refer :all]
            [kubernetes.specs.v1/deployment-status :refer :all]
            )
  (:import (java.io File)))


(def v1/deployment-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/deployment-spec-spec
   (ds/opt :status) v1/deployment-status-spec
   })

(def v1/deployment-spec
  (ds/spec
    {:name ::v1/deployment
     :spec v1/deployment-data}))
