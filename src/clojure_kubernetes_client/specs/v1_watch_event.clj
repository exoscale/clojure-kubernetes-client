(ns clojure-kubernetes-client.specs.v1-watch-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-watch-event-data v1-watch-event)
(def v1-watch-event-data
  {
   (ds/req :object) any?
   (ds/req :type) string?
   })

(def v1-watch-event
  (ds/spec
    {:name ::v1-watch-event
     :spec v1-watch-event-data}))

