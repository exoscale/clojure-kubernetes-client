(ns kubernetes.specs.v2alpha1/cron-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-spec :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-status :refer :all]
            )
  (:import (java.io File)))


(def v2alpha1/cron-job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v2alpha1/cron-job-spec-spec
   (ds/opt :status) v2alpha1/cron-job-status-spec
   })

(def v2alpha1/cron-job-spec
  (ds/spec
    {:name ::v2alpha1/cron-job
     :spec v2alpha1/cron-job-data}))
