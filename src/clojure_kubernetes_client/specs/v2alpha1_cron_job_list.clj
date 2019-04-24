(ns clojure-kubernetes-client.specs.v2alpha1-cron-job-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v2alpha1-cron-job-list-data v2alpha1-cron-job-list)
(def v2alpha1-cron-job-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v2alpha1-cron-job)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v2alpha1-cron-job-list
  (ds/spec
    {:name ::v2alpha1-cron-job-list
     :spec v2alpha1-cron-job-list-data}))

