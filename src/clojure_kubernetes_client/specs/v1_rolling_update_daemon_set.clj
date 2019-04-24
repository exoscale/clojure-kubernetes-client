(ns clojure-kubernetes-client.specs.v1-rolling-update-daemon-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-rolling-update-daemon-set-data v1-rolling-update-daemon-set)
(def v1-rolling-update-daemon-set-data
  {
   (ds/opt :maxUnavailable) any?
   })

(def v1-rolling-update-daemon-set
  (ds/spec
    {:name ::v1-rolling-update-daemon-set
     :spec v1-rolling-update-daemon-set-data}))

