(ns clojure-kubernetes-client.specs.v1-service-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            )
  (:import (java.io File)))


(declare v1-service-port-data v1-service-port)
(def v1-service-port-data
  {
   (ds/opt :name) string?
   (ds/opt :nodePort) int?
   (ds/req :port) int?
   (ds/opt :protocol) string?
   (ds/opt :targetPort) any?
   })

(def v1-service-port
  (ds/spec
    {:name ::v1-service-port
     :spec v1-service-port-data}))

