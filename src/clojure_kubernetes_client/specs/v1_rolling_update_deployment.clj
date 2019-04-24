(ns clojure-kubernetes-client.specs.v1-rolling-update-deployment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            
            )
  (:import (java.io File)))


(declare v1-rolling-update-deployment-data v1-rolling-update-deployment)
(def v1-rolling-update-deployment-data
  {
   (ds/opt :maxSurge) any?
   (ds/opt :maxUnavailable) any?
   })

(def v1-rolling-update-deployment
  (ds/spec
    {:name ::v1-rolling-update-deployment
     :spec v1-rolling-update-deployment-data}))

