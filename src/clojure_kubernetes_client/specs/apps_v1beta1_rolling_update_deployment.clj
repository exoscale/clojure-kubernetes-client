(ns clojure-kubernetes-client.specs.apps-v1beta1-rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            )
  (:import (java.io File)))


(declare apps-v1beta1-rolling-update-deployment-data apps-v1beta1-rolling-update-deployment)
(def apps-v1beta1-rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def apps-v1beta1-rolling-update-deployment
  (ds/spec
    {:name ::apps-v1beta1-rolling-update-deployment
     :spec apps-v1beta1-rolling-update-deployment-data}))

