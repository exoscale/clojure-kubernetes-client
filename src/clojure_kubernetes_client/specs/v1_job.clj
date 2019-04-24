(ns clojure-kubernetes-client.specs.v1-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-job-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-job-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-job-data v1-job)
(def v1-job-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-job-spec
   (ds/opt :status) v1-job-status
   })

(def v1-job
  (ds/spec
    {:name ::v1-job
     :spec v1-job-data}))

