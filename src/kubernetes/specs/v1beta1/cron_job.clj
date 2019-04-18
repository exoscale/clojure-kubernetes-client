(ns kubernetes.specs.v1beta1/cron-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/cron-job-spec :refer :all]
            [kubernetes.specs.v1beta1/cron-job-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/cron-job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1beta1/cron-job-spec-spec
   (ds/opt :status) v1beta1/cron-job-status-spec
   })

(def v1beta1/cron-job-spec
  (ds/spec
    {:name ::v1beta1/cron-job
     :spec v1beta1/cron-job-data}))
