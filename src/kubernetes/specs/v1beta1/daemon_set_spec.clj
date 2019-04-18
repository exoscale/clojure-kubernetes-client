(ns kubernetes.specs.v1beta1/daemon-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-update-strategy :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/daemon-set-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/opt :selector) v1/label-selector-spec
   (ds/req :template) v1/pod-template-spec-spec
   (ds/opt :templateGeneration) int?
   (ds/opt :updateStrategy) v1beta1/daemon-set-update-strategy-spec
   })

(def v1beta1/daemon-set-spec-spec
  (ds/spec
    {:name ::v1beta1/daemon-set-spec
     :spec v1beta1/daemon-set-spec-data}))
