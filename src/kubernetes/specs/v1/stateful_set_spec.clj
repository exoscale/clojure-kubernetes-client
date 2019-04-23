(ns kubernetes.specs.v1/stateful-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            [kubernetes.specs.v1/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim :refer :all]
            )
  (:import (java.io File)))


(def v1/stateful-set-spec-data
  {
   (ds/opt :podManagementPolicy) string?
   (ds/opt :replicas) int?
   (ds/opt :revisionHistoryLimit) int?
   (ds/req :selector) v1/label-selector-spec
   (ds/req :serviceName) string?
   (ds/req :template) v1/pod-template-spec-spec
   (ds/opt :updateStrategy) v1/stateful-set-update-strategy-spec
   (ds/opt :volumeClaimTemplates) (s/coll-of v1/persistent-volume-claim-spec)
   })

(def v1/stateful-set-spec-spec
  (ds/spec
    {:name ::v1/stateful-set-spec
     :spec v1/stateful-set-spec-data}))
