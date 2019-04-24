(ns clojure-kubernetes-client.specs.v1-node-system-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-node-system-info-data v1-node-system-info)
(def v1-node-system-info-data
  {
   (ds/req :architecture) string?
   (ds/req :bootID) string?
   (ds/req :containerRuntimeVersion) string?
   (ds/req :kernelVersion) string?
   (ds/req :kubeProxyVersion) string?
   (ds/req :kubeletVersion) string?
   (ds/req :machineID) string?
   (ds/req :operatingSystem) string?
   (ds/req :osImage) string?
   (ds/req :systemUUID) string?
   })

(def v1-node-system-info
  (ds/spec
    {:name ::v1-node-system-info
     :spec v1-node-system-info-data}))

