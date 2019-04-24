(ns clojure-kubernetes-client.specs.policy-v1beta1-allowed-flex-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare policy-v1beta1-allowed-flex-volume-data policy-v1beta1-allowed-flex-volume)
(def policy-v1beta1-allowed-flex-volume-data
  {
   (ds/req :driver) string?
   })

(def policy-v1beta1-allowed-flex-volume
  (ds/spec
    {:name ::policy-v1beta1-allowed-flex-volume
     :spec policy-v1beta1-allowed-flex-volume-data}))

