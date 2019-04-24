(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-condition-data extensions-v1beta1-deployment-condition)
(def extensions-v1beta1-deployment-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :lastUpdateTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def extensions-v1beta1-deployment-condition
  (ds/spec
    {:name ::extensions-v1beta1-deployment-condition
     :spec extensions-v1beta1-deployment-condition-data}))

