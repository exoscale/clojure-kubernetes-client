(ns clojure-kubernetes-client.specs.v1-persistent-volume-claim-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-claim-condition-data v1-persistent-volume-claim-condition)
(def v1-persistent-volume-claim-condition-data
  {
   (ds/opt :lastProbeTime) inst?
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-persistent-volume-claim-condition
  (ds/spec
    {:name ::v1-persistent-volume-claim-condition
     :spec v1-persistent-volume-claim-condition-data}))

