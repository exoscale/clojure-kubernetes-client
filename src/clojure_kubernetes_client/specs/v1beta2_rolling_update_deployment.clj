(ns clojure-kubernetes-client.specs.v1beta2-rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            )
  (:import (java.io File)))


(declare v1beta2-rolling-update-deployment-data v1beta2-rolling-update-deployment)
(def v1beta2-rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def v1beta2-rolling-update-deployment
  (ds/spec
    {:name ::v1beta2-rolling-update-deployment
     :spec v1beta2-rolling-update-deployment-data}))

