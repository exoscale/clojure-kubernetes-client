(ns kubernetes.specs.v1beta1/self-subject-rules-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1beta1/self-subject-rules-review-spec :refer :all]
            [kubernetes.specs.v1beta1/subject-rules-review-status :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/self-subject-rules-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1beta1/self-subject-rules-review-spec-spec
   (ds/opt :status) v1beta1/subject-rules-review-status-spec
   })

(def v1beta1/self-subject-rules-review-spec
  (ds/spec
    {:name ::v1beta1/self-subject-rules-review
     :spec v1beta1/self-subject-rules-review-data}))
