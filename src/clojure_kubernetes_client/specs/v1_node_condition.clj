(ns clojure-kubernetes-client.specs.v1-node-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-node-condition-data v1-node-condition)
(def v1-node-condition-data
  {
   (ds/opt :lastHeartbeatTime) inst?
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-node-condition
  (ds/spec
    {:name ::v1-node-condition
     :spec v1-node-condition-data}))

