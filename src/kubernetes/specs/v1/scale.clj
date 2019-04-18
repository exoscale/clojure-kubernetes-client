(ns kubernetes.specs.v1/scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/scale-spec :refer :all]
            [kubernetes.specs.v1/scale-status :refer :all]
            )
  (:import (java.io File)))


(def v1/scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/scale-spec-spec
   (ds/opt :status) v1/scale-status-spec
   })

(def v1/scale-spec
  (ds/spec
    {:name ::v1/scale
     :spec v1/scale-data}))
