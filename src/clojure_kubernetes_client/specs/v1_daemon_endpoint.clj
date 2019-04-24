(ns clojure-kubernetes-client.specs.v1-daemon-endpoint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-daemon-endpoint-data v1-daemon-endpoint)
(def v1-daemon-endpoint-data
  {
   (ds/req :Port) int?
   })

(def v1-daemon-endpoint
  (ds/spec
    {:name ::v1-daemon-endpoint
     :spec v1-daemon-endpoint-data}))

