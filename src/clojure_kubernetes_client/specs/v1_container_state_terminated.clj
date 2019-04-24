(ns clojure-kubernetes-client.specs.v1-container-state-terminated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-container-state-terminated-data v1-container-state-terminated)
(def v1-container-state-terminated-data
  {
   (ds/opt :containerID) string?
   (ds/req :exitCode) int?
   (ds/opt :finishedAt) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/opt :signal) int?
   (ds/opt :startedAt) inst?
   })

(def v1-container-state-terminated
  (ds/spec
    {:name ::v1-container-state-terminated
     :spec v1-container-state-terminated-data}))

