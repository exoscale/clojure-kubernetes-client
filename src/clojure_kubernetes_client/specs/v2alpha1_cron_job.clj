(ns clojure-kubernetes-client.specs.v2alpha1-cron-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job-spec :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job-status :refer :all]
            )
  (:import (java.io File)))


(declare v2alpha1-cron-job-data v2alpha1-cron-job)
(def v2alpha1-cron-job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v2alpha1-cron-job-spec
   (ds/opt :status) v2alpha1-cron-job-status
   })

(def v2alpha1-cron-job
  (ds/spec
    {:name ::v2alpha1-cron-job
     :spec v2alpha1-cron-job-data}))

