(ns kubernetes.specs.v2alpha1/cron-job-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2alpha1/cron-job :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v2alpha1/cron-job-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v2alpha1/cron-job-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v2alpha1/cron-job-list-spec
  (ds/spec
    {:name ::v2alpha1/cron-job-list
     :spec v2alpha1/cron-job-list-data}))
