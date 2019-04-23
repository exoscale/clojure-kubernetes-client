(ns kubernetes.specs.v1/volume-device
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/volume-device-data
  {
   (ds/req :devicePath) string?
   (ds/req :name) string?
   })

(def v1/volume-device-spec
  (ds/spec
    {:name ::v1/volume-device
     :spec v1/volume-device-data}))
