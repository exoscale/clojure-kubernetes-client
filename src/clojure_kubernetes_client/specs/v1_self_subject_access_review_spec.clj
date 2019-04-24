(ns clojure-kubernetes-client.specs.v1-self-subject-access-review-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-non-resource-attributes :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-attributes :refer :all]
            )
  (:import (java.io File)))


(declare v1-self-subject-access-review-spec-data v1-self-subject-access-review-spec)
(def v1-self-subject-access-review-spec-data
  {
   (ds/opt :nonResourceAttributes) v1-non-resource-attributes
   (ds/opt :resourceAttributes) v1-resource-attributes
   })

(def v1-self-subject-access-review-spec
  (ds/spec
    {:name ::v1-self-subject-access-review-spec
     :spec v1-self-subject-access-review-spec-data}))

