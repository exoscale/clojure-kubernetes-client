(ns kubernetes.specs.v1/self-subject-access-review-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1/resource-attributes :refer :all]
            )
  (:import (java.io File)))


(def v1/self-subject-access-review-spec-data
  {
   (ds/opt :nonResourceAttributes) v1/non-resource-attributes-spec
   (ds/opt :resourceAttributes) v1/resource-attributes-spec
   })

(def v1/self-subject-access-review-spec-spec
  (ds/spec
    {:name ::v1/self-subject-access-review-spec
     :spec v1/self-subject-access-review-spec-data}))
