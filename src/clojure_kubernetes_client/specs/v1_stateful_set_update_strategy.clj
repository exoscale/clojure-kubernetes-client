(ns clojure-kubernetes-client.specs.v1-stateful-set-update-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-rolling-update-stateful-set-strategy :refer :all]
            )
  (:import (java.io File)))


(declare v1-stateful-set-update-strategy-data v1-stateful-set-update-strategy)
(def v1-stateful-set-update-strategy-data
  {
   (ds/opt :rollingUpdate) v1-rolling-update-stateful-set-strategy
   (ds/opt :type) string?
   })

(def v1-stateful-set-update-strategy
  (ds/spec
    {:name ::v1-stateful-set-update-strategy
     :spec v1-stateful-set-update-strategy-data}))

