(ns kubernetes.specs.v1/service
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/service-spec :refer :all]
            [kubernetes.specs.v1/service-status :refer :all]
            )
  (:import (java.io File)))


(def v1/service-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/service-spec-spec
   (ds/opt :status) v1/service-status-spec
   })

(def v1/service-spec
  (ds/spec
    {:name ::v1/service
     :spec v1/service-data}))
