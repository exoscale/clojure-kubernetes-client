(ns clojure-kubernetes-client.specs.v1-job-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-job-spec-data v1-job-spec)
(def v1-job-spec-data
  {
   (ds/opt :activeDeadlineSeconds) int?
   (ds/opt :backoffLimit) int?
   (ds/opt :completions) int?
   (ds/opt :manualSelector) boolean?
   (ds/opt :parallelism) int?
   (ds/opt :selector) v1-label-selector
   (ds/req :template) v1-pod-template-spec
   (ds/opt :ttlSecondsAfterFinished) int?
   })

(def v1-job-spec
  (ds/spec
    {:name ::v1-job-spec
     :spec v1-job-spec-data}))

