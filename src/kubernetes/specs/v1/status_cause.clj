(ns kubernetes.specs.v1/status-cause
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/status-cause-data
  {
   (ds/opt :field) string?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   })

(def v1/status-cause-spec
  (ds/spec
    {:name ::v1/status-cause
     :spec v1/status-cause-data}))
