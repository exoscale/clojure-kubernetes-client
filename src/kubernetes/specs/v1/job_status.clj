(ns kubernetes.specs.v1/job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/job-condition :refer :all]
            )
  (:import (java.io File)))


(def v1/job-status-data
  {
   (ds/opt :active) int?
   (ds/opt :completionTime) inst?
   (ds/opt :conditions) (s/coll-of v1/job-condition-spec)
   (ds/opt :failed) int?
   (ds/opt :startTime) inst?
   (ds/opt :succeeded) int?
   })

(def v1/job-status-spec
  (ds/spec
    {:name ::v1/job-status
     :spec v1/job-status-data}))
