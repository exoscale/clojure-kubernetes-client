(ns clojure-kubernetes-client.specs.v1beta1-csi-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-driver-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-csi-driver-data v1beta1-csi-driver)
(def v1beta1-csi-driver-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1beta1-csi-driver-spec
   })

(def v1beta1-csi-driver
  (ds/spec
    {:name ::v1beta1-csi-driver
     :spec v1beta1-csi-driver-data}))

