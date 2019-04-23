(ns kubernetes.specs.v1/lease-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/lease-spec-data
  {
   (ds/opt :acquireTime) inst?
   (ds/opt :holderIdentity) string?
   (ds/opt :leaseDurationSeconds) int?
   (ds/opt :leaseTransitions) int?
   (ds/opt :renewTime) inst?
   })

(def v1/lease-spec-spec
  (ds/spec
    {:name ::v1/lease-spec
     :spec v1/lease-spec-data}))
