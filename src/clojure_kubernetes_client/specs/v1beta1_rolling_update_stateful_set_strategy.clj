(ns clojure-kubernetes-client.specs.v1beta1-rolling-update-stateful-set-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-rolling-update-stateful-set-strategy-data v1beta1-rolling-update-stateful-set-strategy)
(def v1beta1-rolling-update-stateful-set-strategy-data
  {
   (ds/opt :partition) int?
   })

(def v1beta1-rolling-update-stateful-set-strategy
  (ds/spec
    {:name ::v1beta1-rolling-update-stateful-set-strategy
     :spec v1beta1-rolling-update-stateful-set-strategy-data}))

