(ns kubernetes.specs.v1beta1/csi-node-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta1/csi-node-driver-data
  {
   (ds/req :name) string?
   (ds/req :nodeID) string?
   (ds/opt :topologyKeys) (s/coll-of string?)
   })

(def v1beta1/csi-node-driver-spec
  (ds/spec
    {:name ::v1beta1/csi-node-driver
     :spec v1beta1/csi-node-driver-data}))
