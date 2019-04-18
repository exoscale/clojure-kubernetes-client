(ns kubernetes.specs.v1/pod-security-context
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/se-linux-options :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-security-context-data
  {
   (ds/opt :fsGroup) int?
   (ds/opt :runAsNonRoot) boolean?
   (ds/opt :runAsUser) int?
   (ds/opt :seLinuxOptions) v1/se-linux-options-spec
   (ds/opt :supplementalGroups) (s/coll-of int?)
   })

(def v1/pod-security-context-spec
  (ds/spec
    {:name ::v1/pod-security-context
     :spec v1/pod-security-context-data}))
