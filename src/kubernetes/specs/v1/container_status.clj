(ns kubernetes.specs.v1/container-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/container-state :refer :all]
            [kubernetes.specs.v1/container-state :refer :all]
            )
  (:import (java.io File)))


(def v1/container-status-data
  {
   (ds/opt :containerID) string?
   (ds/req :image) string?
   (ds/req :imageID) string?
   (ds/opt :lastState) v1/container-state-spec
   (ds/req :name) string?
   (ds/req :ready) boolean?
   (ds/req :restartCount) int?
   (ds/opt :state) v1/container-state-spec
   })

(def v1/container-status-spec
  (ds/spec
    {:name ::v1/container-status
     :spec v1/container-status-data}))
