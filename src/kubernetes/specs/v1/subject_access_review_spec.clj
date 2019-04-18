(ns kubernetes.specs.v1/subject-access-review-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1/resource-attributes :refer :all]
            )
  (:import (java.io File)))


(def v1/subject-access-review-spec-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/opt :nonResourceAttributes) v1/non-resource-attributes-spec
   (ds/opt :resourceAttributes) v1/resource-attributes-spec
   (ds/opt :uid) string?
   (ds/opt :user) string?
   })

(def v1/subject-access-review-spec-spec
  (ds/spec
    {:name ::v1/subject-access-review-spec
     :spec v1/subject-access-review-spec-data}))
