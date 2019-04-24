(ns clojure-kubernetes-client.specs.v1-probe
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-exec-action :refer :all]
            [clojure-kubernetes-client.specs.v1-http-get-action :refer :all]
            [clojure-kubernetes-client.specs.v1-tcp-socket-action :refer :all]
            )
  (:import (java.io File)))


(declare v1-probe-data v1-probe)
(def v1-probe-data
  {
   (ds/opt :exec) v1-exec-action
   (ds/opt :failureThreshold) int?
   (ds/opt :httpGet) v1-http-get-action
   (ds/opt :initialDelaySeconds) int?
   (ds/opt :periodSeconds) int?
   (ds/opt :successThreshold) int?
   (ds/opt :tcpSocket) v1-tcp-socket-action
   (ds/opt :timeoutSeconds) int?
   })

(def v1-probe
  (ds/spec
    {:name ::v1-probe
     :spec v1-probe-data}))

