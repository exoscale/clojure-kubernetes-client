(ns clojure-kubernetes-client.specs.v1beta1-self-subject-rules-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-self-subject-rules-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-rules-review-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-self-subject-rules-review-data v1beta1-self-subject-rules-review)
(def v1beta1-self-subject-rules-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1beta1-self-subject-rules-review-spec
   (ds/opt :status) v1beta1-subject-rules-review-status
   })

(def v1beta1-self-subject-rules-review
  (ds/spec
    {:name ::v1beta1-self-subject-rules-review
     :spec v1beta1-self-subject-rules-review-data}))

