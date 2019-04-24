(ns clojure-kubernetes-client.specs.v1-token-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-token-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-token-review-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-token-review-data v1-token-review)
(def v1-token-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-token-review-spec
   (ds/opt :status) v1-token-review-status
   })

(def v1-token-review
  (ds/spec
    {:name ::v1-token-review
     :spec v1-token-review-data}))

