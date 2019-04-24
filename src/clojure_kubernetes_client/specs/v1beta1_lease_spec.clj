(ns clojure-kubernetes-client.specs.v1beta1-lease-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-lease-spec-data v1beta1-lease-spec)
(def v1beta1-lease-spec-data
  {
   (ds/opt :acquireTime) inst?
   (ds/opt :holderIdentity) string?
   (ds/opt :leaseDurationSeconds) int?
   (ds/opt :leaseTransitions) int?
   (ds/opt :renewTime) inst?
   })

(def v1beta1-lease-spec
  (ds/spec
    {:name ::v1beta1-lease-spec
     :spec v1beta1-lease-spec-data}))

