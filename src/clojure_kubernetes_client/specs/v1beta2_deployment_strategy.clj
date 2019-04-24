(ns clojure-kubernetes-client.specs.v1beta2-deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta2-rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-deployment-strategy-data v1beta2-deployment-strategy)
(def v1beta2-deployment-strategy-data
  {
   (ds/opt :rollingUpdate) v1beta2-rolling-update-deployment
   (ds/opt :type) string?
   })

(def v1beta2-deployment-strategy
  (ds/spec
    {:name ::v1beta2-deployment-strategy
     :spec v1beta2-deployment-strategy-data}))

