(ns clojure-kubernetes-client.specs.v1-watch-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.runtime-raw-extension :refer :all]
            )
  (:import (java.io File)))


(declare v1-watch-event-data v1-watch-event)
(def v1-watch-event-data
  {
   (ds/req :object) runtime-raw-extension
   (ds/req :type) string?
   })

(def v1-watch-event
  (ds/spec
    {:name ::v1-watch-event
     :spec v1-watch-event-data}))

