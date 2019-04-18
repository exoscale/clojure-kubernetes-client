(ns kubernetes.specs.v1/status-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/status-cause :refer :all]
            )
  (:import (java.io File)))


(def v1/status-details-data
  {
   (ds/opt :causes) (s/coll-of v1/status-cause-spec)
   (ds/opt :group) string?
   (ds/opt :kind) string?
   (ds/opt :name) string?
   (ds/opt :retryAfterSeconds) int?
   (ds/opt :uid) string?
   })

(def v1/status-details-spec
  (ds/spec
    {:name ::v1/status-details
     :spec v1/status-details-data}))
