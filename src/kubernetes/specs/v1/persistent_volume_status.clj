(ns kubernetes.specs.v1/persistent-volume-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/persistent-volume-status-data
  {
   (ds/opt :message) string?
   (ds/opt :phase) string?
   (ds/opt :reason) string?
   })

(def v1/persistent-volume-status-spec
  (ds/spec
    {:name ::v1/persistent-volume-status
     :spec v1/persistent-volume-status-data}))
