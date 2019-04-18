(ns kubernetes.specs.v1/endpoint-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/endpoint-port-data
  {
   (ds/opt :name) string?
   (ds/req :port) int?
   (ds/opt :protocol) string?
   })

(def v1/endpoint-port-spec
  (ds/spec
    {:name ::v1/endpoint-port
     :spec v1/endpoint-port-data}))
