(ns kubernetes.specs.policy/v1beta1/allowed-csi-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def policy/v1beta1/allowed-csi-driver-data
  {
   (ds/req :name) string?
   })

(def policy/v1beta1/allowed-csi-driver-spec
  (ds/spec
    {:name ::policy/v1beta1/allowed-csi-driver
     :spec policy/v1beta1/allowed-csi-driver-data}))
