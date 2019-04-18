(ns kubernetes.specs.v1beta1/cron-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-reference :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/cron-job-status-data
  {
   (ds/opt :active) (s/coll-of v1/object-reference-spec)
   (ds/opt :lastScheduleTime) inst?
   })

(def v1beta1/cron-job-status-spec
  (ds/spec
    {:name ::v1beta1/cron-job-status
     :spec v1beta1/cron-job-status-data}))
