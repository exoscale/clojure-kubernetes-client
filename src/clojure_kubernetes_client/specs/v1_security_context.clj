(ns clojure-kubernetes-client.specs.v1-security-context
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-capabilities :refer :all]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            [clojure-kubernetes-client.specs.v1-windows-security-context-options :refer :all]
            )
  (:import (java.io File)))


(declare v1-security-context-data v1-security-context)
(def v1-security-context-data
  {
   (ds/opt :allowPrivilegeEscalation) boolean?
   (ds/opt :capabilities) v1-capabilities
   (ds/opt :privileged) boolean?
   (ds/opt :procMount) string?
   (ds/opt :readOnlyRootFilesystem) boolean?
   (ds/opt :runAsGroup) int?
   (ds/opt :runAsNonRoot) boolean?
   (ds/opt :runAsUser) int?
   (ds/opt :seLinuxOptions) v1-se-linux-options
   (ds/opt :windowsOptions) v1-windows-security-context-options
   })

(def v1-security-context
  (ds/spec
    {:name ::v1-security-context
     :spec v1-security-context-data}))

