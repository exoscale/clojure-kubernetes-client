(ns clojure-kubernetes-client.specs.apps-v1beta1-rollback-config
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare apps-v1beta1-rollback-config-data apps-v1beta1-rollback-config)
(def apps-v1beta1-rollback-config-data
  {
   (ds/opt :revision) int?
   })

(def apps-v1beta1-rollback-config
  (ds/spec
    {:name ::apps-v1beta1-rollback-config
     :spec apps-v1beta1-rollback-config-data}))

