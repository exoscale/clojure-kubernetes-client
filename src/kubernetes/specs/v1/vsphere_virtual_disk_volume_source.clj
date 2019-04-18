(ns kubernetes.specs.v1/vsphere-virtual-disk-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/vsphere-virtual-disk-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :storagePolicyID) string?
   (ds/opt :storagePolicyName) string?
   (ds/req :volumePath) string?
   })

(def v1/vsphere-virtual-disk-volume-source-spec
  (ds/spec
    {:name ::v1/vsphere-virtual-disk-volume-source
     :spec v1/vsphere-virtual-disk-volume-source-data}))
