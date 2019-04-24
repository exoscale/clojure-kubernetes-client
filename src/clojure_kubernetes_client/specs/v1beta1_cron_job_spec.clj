(ns clojure-kubernetes-client.specs.v1beta1-cron-job-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-job-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-cron-job-spec-data v1beta1-cron-job-spec)
(def v1beta1-cron-job-spec-data
  {
   (ds/opt :concurrencyPolicy) string?
   (ds/opt :failedJobsHistoryLimit) int?
   (ds/req :jobTemplate) v1beta1-job-template-spec
   (ds/req :schedule) string?
   (ds/opt :startingDeadlineSeconds) int?
   (ds/opt :successfulJobsHistoryLimit) int?
   (ds/opt :suspend) boolean?
   })

(def v1beta1-cron-job-spec
  (ds/spec
    {:name ::v1beta1-cron-job-spec
     :spec v1beta1-cron-job-spec-data}))

