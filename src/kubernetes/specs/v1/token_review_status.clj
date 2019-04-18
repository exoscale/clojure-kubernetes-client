(ns kubernetes.specs.v1/token-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/user-info :refer :all]
            )
  (:import (java.io File)))


(def v1/token-review-status-data
  {
   (ds/opt :authenticated) boolean?
   (ds/opt :error) string?
   (ds/opt :user) v1/user-info-spec
   })

(def v1/token-review-status-spec
  (ds/spec
    {:name ::v1/token-review-status
     :spec v1/token-review-status-data}))
