(ns kubernetes.specs.v1/subject-access-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/subject-access-review-status :refer :all]
            )
  (:import (java.io File)))


(def v1/subject-access-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1/subject-access-review-spec-spec
   (ds/opt :status) v1/subject-access-review-status-spec
   })

(def v1/subject-access-review-spec
  (ds/spec
    {:name ::v1/subject-access-review
     :spec v1/subject-access-review-data}))
