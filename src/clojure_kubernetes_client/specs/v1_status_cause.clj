(ns clojure-kubernetes-client.specs.v1-status-cause
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-status-cause-data v1-status-cause)
(def v1-status-cause-data
  {
   (ds/opt :field) string?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   })

(def v1-status-cause
  (ds/spec
    {:name ::v1-status-cause
     :spec v1-status-cause-data}))

