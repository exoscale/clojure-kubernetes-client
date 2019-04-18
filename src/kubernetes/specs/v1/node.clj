(ns kubernetes.specs.v1/node
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/node-spec :refer :all]
            [kubernetes.specs.v1/node-status :refer :all]
            )
  (:import (java.io File)))


(def v1/node-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/node-spec-spec
   (ds/opt :status) v1/node-status-spec
   })

(def v1/node-spec
  (ds/spec
    {:name ::v1/node
     :spec v1/node-data}))
