(ns kubernetes.specs.v1/daemon-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            [kubernetes.specs.v1/daemon-set-update-strategy :refer :all]
            )
  (:import (java.io File)))


(def v1/daemon-set-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/req :selector) v1/label-selector-spec
   (ds/req :template) v1/pod-template-spec-spec
   (ds/opt :updateStrategy) v1/daemon-set-update-strategy-spec
   })

(def v1/daemon-set-spec-spec
  (ds/spec
    {:name ::v1/daemon-set-spec
     :spec v1/daemon-set-spec-data}))
