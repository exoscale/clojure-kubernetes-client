(ns clojure-kubernetes-client.specs.extensions-v1beta1-deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-deployment-strategy-data extensions-v1beta1-deployment-strategy)
(def extensions-v1beta1-deployment-strategy-data
  {
   (ds/opt :rollingUpdate) extensions-v1beta1-rolling-update-deployment
   (ds/opt :type) string?
   })

(def extensions-v1beta1-deployment-strategy
  (ds/spec
    {:name ::extensions-v1beta1-deployment-strategy
     :spec extensions-v1beta1-deployment-strategy-data}))

