(ns kubernetes.specs.v1/job-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/job-condition-data
  {
   (ds/opt :lastProbeTime) inst?
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1/job-condition-spec
  (ds/spec
    {:name ::v1/job-condition
     :spec v1/job-condition-data}))
