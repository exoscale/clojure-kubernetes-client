(ns clojure-kubernetes-client.specs.v1-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-job-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-job-status-data v1-job-status)
(def v1-job-status-data
  {
   (ds/opt :active) int?
   (ds/opt :completionTime) inst?
   (ds/opt :conditions) (s/coll-of v1-job-condition)
   (ds/opt :failed) int?
   (ds/opt :startTime) inst?
   (ds/opt :succeeded) int?
   })

(def v1-job-status
  (ds/spec
    {:name ::v1-job-status
     :spec v1-job-status-data}))

