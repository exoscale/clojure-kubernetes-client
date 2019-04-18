(ns kubernetes.specs.v1/security-context
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/capabilities :refer :all]
            [kubernetes.specs.v1/se-linux-options :refer :all]
            )
  (:import (java.io File)))


(def v1/security-context-data
  {
   (ds/opt :allowPrivilegeEscalation) boolean?
   (ds/opt :capabilities) v1/capabilities-spec
   (ds/opt :privileged) boolean?
   (ds/opt :readOnlyRootFilesystem) boolean?
   (ds/opt :runAsNonRoot) boolean?
   (ds/opt :runAsUser) int?
   (ds/opt :seLinuxOptions) v1/se-linux-options-spec
   })

(def v1/security-context-spec
  (ds/spec
    {:name ::v1/security-context
     :spec v1/security-context-data}))
