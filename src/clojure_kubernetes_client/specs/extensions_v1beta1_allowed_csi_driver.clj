(ns clojure-kubernetes-client.specs.extensions-v1beta1-allowed-csi-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-allowed-csi-driver-data extensions-v1beta1-allowed-csi-driver)
(def extensions-v1beta1-allowed-csi-driver-data
  {
   (ds/req :name) string?
   })

(def extensions-v1beta1-allowed-csi-driver
  (ds/spec
    {:name ::extensions-v1beta1-allowed-csi-driver
     :spec extensions-v1beta1-allowed-csi-driver-data}))

