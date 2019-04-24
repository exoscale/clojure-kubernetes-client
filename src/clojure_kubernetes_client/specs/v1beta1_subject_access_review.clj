(ns clojure-kubernetes-client.specs.v1beta1-subject-access-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-access-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-access-review-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-subject-access-review-data v1beta1-subject-access-review)
(def v1beta1-subject-access-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1beta1-subject-access-review-spec
   (ds/opt :status) v1beta1-subject-access-review-status
   })

(def v1beta1-subject-access-review
  (ds/spec
    {:name ::v1beta1-subject-access-review
     :spec v1beta1-subject-access-review-data}))

