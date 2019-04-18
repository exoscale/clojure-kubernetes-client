(ns kubernetes.specs.v1/probe
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/exec-action :refer :all]
            [kubernetes.specs.v1/http-get-action :refer :all]
            [kubernetes.specs.v1/tcp-socket-action :refer :all]
            )
  (:import (java.io File)))


(def v1/probe-data
  {
   (ds/opt :exec) v1/exec-action-spec
   (ds/opt :failureThreshold) int?
   (ds/opt :httpGet) v1/http-get-action-spec
   (ds/opt :initialDelaySeconds) int?
   (ds/opt :periodSeconds) int?
   (ds/opt :successThreshold) int?
   (ds/opt :tcpSocket) v1/tcp-socket-action-spec
   (ds/opt :timeoutSeconds) int?
   })

(def v1/probe-spec
  (ds/spec
    {:name ::v1/probe
     :spec v1/probe-data}))
