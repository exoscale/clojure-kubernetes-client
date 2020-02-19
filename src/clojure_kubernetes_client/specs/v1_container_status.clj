(ns clojure-kubernetes-client.specs.v1-container-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-container-state :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state :refer :all]
            )
  (:import (java.io File)))


(declare v1-container-status-data v1-container-status)
(def v1-container-status-data
  {
   (ds/opt :containerID) string?
   (ds/req :image) string?
   (ds/req :imageID) string?
   (ds/opt :lastState) v1-container-state
   (ds/req :name) string?
   (ds/req :ready) boolean?
   (ds/req :restartCount) int?
   (ds/opt :started) boolean?
   (ds/opt :state) v1-container-state
   })

(def v1-container-status
  (ds/spec
    {:name ::v1-container-status
     :spec v1-container-status-data}))

