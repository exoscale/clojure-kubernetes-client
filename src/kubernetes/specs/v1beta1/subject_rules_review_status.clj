(ns kubernetes.specs.v1beta1/subject-rules-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/non-resource-rule :refer :all]
            [kubernetes.specs.v1beta1/resource-rule :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/subject-rules-review-status-data
  {
   (ds/opt :evaluationError) string?
   (ds/req :incomplete) boolean?
   (ds/req :nonResourceRules) (s/coll-of v1beta1/non-resource-rule-spec)
   (ds/req :resourceRules) (s/coll-of v1beta1/resource-rule-spec)
   })

(def v1beta1/subject-rules-review-status-spec
  (ds/spec
    {:name ::v1beta1/subject-rules-review-status
     :spec v1beta1/subject-rules-review-status-data}))
