(ns clojure-kubernetes-client.specs.extensions-v1beta1-rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            )
  (:import (java.io File)))


(declare extensions-v1beta1-rolling-update-deployment-data extensions-v1beta1-rolling-update-deployment)
(def extensions-v1beta1-rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def extensions-v1beta1-rolling-update-deployment
  (ds/spec
    {:name ::extensions-v1beta1-rolling-update-deployment
     :spec extensions-v1beta1-rolling-update-deployment-data}))

