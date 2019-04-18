(ns kubernetes.specs.extensions/v1beta1/deployment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.extensions/v1beta1/rollback-config :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-strategy :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(def extensions/v1beta1/deployment-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :paused) boolean?
   (ds/opt :progressDeadlineSeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/opt :rollbackTo) extensions/v1beta1/rollback-config-spec
   (ds/opt :selector) v1/label-selector-spec
   (ds/opt :strategy) extensions/v1beta1/deployment-strategy-spec
   (ds/req :template) v1/pod-template-spec-spec
   })

(def extensions/v1beta1/deployment-spec-spec
  (ds/spec
    {:name ::extensions/v1beta1/deployment-spec
     :spec extensions/v1beta1/deployment-spec-data}))
