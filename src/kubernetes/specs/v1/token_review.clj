(ns kubernetes.specs.v1/token-review
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/token-review-spec :refer :all]
            [kubernetes.specs.v1/token-review-status :refer :all]
            )
  (:import (java.io File)))


(def v1/token-review-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/req :spec) v1/token-review-spec-spec
   (ds/opt :status) v1/token-review-status-spec
   })

(def v1/token-review-spec
  (ds/spec
    {:name ::v1/token-review
     :spec v1/token-review-data}))
