(ns kubernetes.specs.v1/handler
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/exec-action :refer :all]
            [kubernetes.specs.v1/http-get-action :refer :all]
            [kubernetes.specs.v1/tcp-socket-action :refer :all]
            )
  (:import (java.io File)))


(def v1/handler-data
  {
   (ds/opt :exec) v1/exec-action-spec
   (ds/opt :httpGet) v1/http-get-action-spec
   (ds/opt :tcpSocket) v1/tcp-socket-action-spec
   })

(def v1/handler-spec
  (ds/spec
    {:name ::v1/handler
     :spec v1/handler-data}))
