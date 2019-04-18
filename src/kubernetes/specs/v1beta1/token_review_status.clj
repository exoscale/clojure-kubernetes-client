(ns kubernetes.specs.v1beta1/token-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/user-info :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/token-review-status-data
  {
   (ds/opt :authenticated) boolean?
   (ds/opt :error) string?
   (ds/opt :user) v1beta1/user-info-spec
   })

(def v1beta1/token-review-status-spec
  (ds/spec
    {:name ::v1beta1/token-review-status
     :spec v1beta1/token-review-status-data}))
