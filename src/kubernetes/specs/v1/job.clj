(ns kubernetes.specs.v1/job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/job-spec :refer :all]
            [kubernetes.specs.v1/job-status :refer :all]
            )
  (:import (java.io File)))


(def v1/job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/job-spec-spec
   (ds/opt :status) v1/job-status-spec
   })

(def v1/job-spec
  (ds/spec
    {:name ::v1/job
     :spec v1/job-data}))
