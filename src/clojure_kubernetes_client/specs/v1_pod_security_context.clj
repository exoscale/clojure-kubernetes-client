(ns clojure-kubernetes-client.specs.v1-pod-security-context
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            [clojure-kubernetes-client.specs.v1-sysctl :refer :all]
            [clojure-kubernetes-client.specs.v1-windows-security-context-options :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-security-context-data v1-pod-security-context)
(def v1-pod-security-context-data
  {
   (ds/opt :fsGroup) int?
   (ds/opt :runAsGroup) int?
   (ds/opt :runAsNonRoot) boolean?
   (ds/opt :runAsUser) int?
   (ds/opt :seLinuxOptions) v1-se-linux-options
   (ds/opt :supplementalGroups) (s/coll-of int?)
   (ds/opt :sysctls) (s/coll-of v1-sysctl)
   (ds/opt :windowsOptions) v1-windows-security-context-options
   })

(def v1-pod-security-context
  (ds/spec
    {:name ::v1-pod-security-context
     :spec v1-pod-security-context-data}))

