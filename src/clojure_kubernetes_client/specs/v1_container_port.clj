(ns clojure-kubernetes-client.specs.v1-container-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-container-port-data v1-container-port)
(def v1-container-port-data
  {
   (ds/req :containerPort) int?
   (ds/opt :hostIP) string?
   (ds/opt :hostPort) int?
   (ds/opt :name) string?
   (ds/opt :protocol) string?
   })

(def v1-container-port
  (ds/spec
    {:name ::v1-container-port
     :spec v1-container-port-data}))

