(ns clojure-kubernetes-client.specs.v1-attached-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-attached-volume-data v1-attached-volume)
(def v1-attached-volume-data
  {
   (ds/req :devicePath) string?
   (ds/req :name) string?
   })

(def v1-attached-volume
  (ds/spec
    {:name ::v1-attached-volume
     :spec v1-attached-volume-data}))

