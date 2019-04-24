(ns clojure-kubernetes-client.specs.v2alpha1-cron-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v2alpha1-cron-job-status-data v2alpha1-cron-job-status)
(def v2alpha1-cron-job-status-data
  {
   (ds/opt :active) (s/coll-of v1-object-reference)
   (ds/opt :lastScheduleTime) inst?
   })

(def v2alpha1-cron-job-status
  (ds/spec
    {:name ::v2alpha1-cron-job-status
     :spec v2alpha1-cron-job-status-data}))

