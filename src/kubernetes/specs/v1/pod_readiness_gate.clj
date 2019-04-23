(ns kubernetes.specs.v1/pod-readiness-gate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/pod-readiness-gate-data
  {
   (ds/req :conditionType) string?
   })

(def v1/pod-readiness-gate-spec
  (ds/spec
    {:name ::v1/pod-readiness-gate
     :spec v1/pod-readiness-gate-data}))
