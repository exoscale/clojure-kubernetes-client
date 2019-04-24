(ns clojure-kubernetes-client.specs.extensions-v1beta1-allowed-flex-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-allowed-flex-volume-data extensions-v1beta1-allowed-flex-volume)
(def extensions-v1beta1-allowed-flex-volume-data
  {
   (ds/req :driver) string?
   })

(def extensions-v1beta1-allowed-flex-volume
  (ds/spec
    {:name ::extensions-v1beta1-allowed-flex-volume
     :spec extensions-v1beta1-allowed-flex-volume-data}))

