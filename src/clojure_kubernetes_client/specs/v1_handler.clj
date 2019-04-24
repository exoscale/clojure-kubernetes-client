(ns clojure-kubernetes-client.specs.v1-handler
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-exec-action :refer :all]
            [clojure-kubernetes-client.specs.v1-http-get-action :refer :all]
            [clojure-kubernetes-client.specs.v1-tcp-socket-action :refer :all]
            )
  (:import (java.io File)))


(declare v1-handler-data v1-handler)
(def v1-handler-data
  {
   (ds/opt :exec) v1-exec-action
   (ds/opt :httpGet) v1-http-get-action
   (ds/opt :tcpSocket) v1-tcp-socket-action
   })

(def v1-handler
  (ds/spec
    {:name ::v1-handler
     :spec v1-handler-data}))

