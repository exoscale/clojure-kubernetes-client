(ns clojure-kubernetes-client.specs.v1beta1-cron-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-cron-job-data v1beta1-cron-job)
(def v1beta1-cron-job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-cron-job-spec
   (ds/opt :status) v1beta1-cron-job-status
   })

(def v1beta1-cron-job
  (ds/spec
    {:name ::v1beta1-cron-job
     :spec v1beta1-cron-job-data}))

