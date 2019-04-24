(ns clojure-kubernetes-client.specs.v1-job-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-job :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-job-list-data v1-job-list)
(def v1-job-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-job)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-job-list
  (ds/spec
    {:name ::v1-job-list
     :spec v1-job-list-data}))

