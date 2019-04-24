(ns clojure-kubernetes-client.specs.v1beta1-subject-rules-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-non-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-resource-rule :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-subject-rules-review-status-data v1beta1-subject-rules-review-status)
(def v1beta1-subject-rules-review-status-data
  {
   (ds/opt :evaluationError) string?
   (ds/req :incomplete) boolean?
   (ds/req :nonResourceRules) (s/coll-of v1beta1-non-resource-rule)
   (ds/req :resourceRules) (s/coll-of v1beta1-resource-rule)
   })

(def v1beta1-subject-rules-review-status
  (ds/spec
    {:name ::v1beta1-subject-rules-review-status
     :spec v1beta1-subject-rules-review-status-data}))

