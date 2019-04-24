(ns clojure-kubernetes-client.specs.v1beta1-self-subject-rules-review-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-self-subject-rules-review-spec-data v1beta1-self-subject-rules-review-spec)
(def v1beta1-self-subject-rules-review-spec-data
  {
   (ds/opt :namespace) string?
   })

(def v1beta1-self-subject-rules-review-spec
  (ds/spec
    {:name ::v1beta1-self-subject-rules-review-spec
     :spec v1beta1-self-subject-rules-review-spec-data}))

