(ns clojure-kubernetes-client.specs.v1-tcp-socket-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-tcp-socket-action-data v1-tcp-socket-action)
(def v1-tcp-socket-action-data
  {
   (ds/opt :host) string?
   (ds/req :port) any?
   })

(def v1-tcp-socket-action
  (ds/spec
    {:name ::v1-tcp-socket-action
     :spec v1-tcp-socket-action-data}))

