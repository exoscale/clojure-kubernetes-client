(ns kubernetes.specs.v1/component-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/component-condition :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/component-status-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :conditions) (s/coll-of v1/component-condition-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1/component-status-spec
  (ds/spec
    {:name ::v1/component-status
     :spec v1/component-status-data}))
