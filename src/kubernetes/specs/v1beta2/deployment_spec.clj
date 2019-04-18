(ns kubernetes.specs.v1beta2/deployment-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1beta2/deployment-strategy :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(def v1beta2/deployment-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :paused) boolean?
   (ds/opt :progressDeadlineSeconds) int?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/req :selector) v1/label-selector-spec
   (ds/opt :strategy) v1beta2/deployment-strategy-spec
   (ds/req :template) v1/pod-template-spec-spec
   })

(def v1beta2/deployment-spec-spec
  (ds/spec
    {:name ::v1beta2/deployment-spec
     :spec v1beta2/deployment-spec-data}))
