(ns clojure-kubernetes-client.specs.v1-deployment-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-rolling-update-deployment :refer :all]
            )
  (:import (java.io File)))


(declare v1-deployment-strategy-data v1-deployment-strategy)
(def v1-deployment-strategy-data
  {
   (ds/opt :rollingUpdate) v1-rolling-update-deployment
   (ds/opt :type) string?
   })

(def v1-deployment-strategy
  (ds/spec
    {:name ::v1-deployment-strategy
     :spec v1-deployment-strategy-data}))

