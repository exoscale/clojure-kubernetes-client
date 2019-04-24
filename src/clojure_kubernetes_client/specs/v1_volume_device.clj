(ns clojure-kubernetes-client.specs.v1-volume-device
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-volume-device-data v1-volume-device)
(def v1-volume-device-data
  {
   (ds/req :devicePath) string?
   (ds/req :name) string?
   })

(def v1-volume-device
  (ds/spec
    {:name ::v1-volume-device
     :spec v1-volume-device-data}))

