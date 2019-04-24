(ns clojure-kubernetes-client.specs.apps-v1beta1-deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.apps-v1beta1-rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(declare apps-v1beta1-deployment-strategy-data apps-v1beta1-deployment-strategy)
(def apps-v1beta1-deployment-strategy-data
  {
   (ds/opt :rollingUpdate) apps-v1beta1-rolling-update-deployment
   (ds/opt :type) string?
   })

(def apps-v1beta1-deployment-strategy
  (ds/spec
    {:name ::apps-v1beta1-deployment-strategy
     :spec apps-v1beta1-deployment-strategy-data}))

