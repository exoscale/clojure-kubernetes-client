(ns clojure-kubernetes-client.specs.v1-subject-rules-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-non-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-rule :refer :all]
            )
  (:import (java.io File)))


(declare v1-subject-rules-review-status-data v1-subject-rules-review-status)
(def v1-subject-rules-review-status-data
  {
   (ds/opt :evaluationError) string?
   (ds/req :incomplete) boolean?
   (ds/req :nonResourceRules) (s/coll-of v1-non-resource-rule)
   (ds/req :resourceRules) (s/coll-of v1-resource-rule)
   })

(def v1-subject-rules-review-status
  (ds/spec
    {:name ::v1-subject-rules-review-status
     :spec v1-subject-rules-review-status-data}))

