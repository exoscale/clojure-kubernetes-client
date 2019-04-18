(ns kubernetes.specs.v1/pod-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/affinity :refer :all]
            [kubernetes.specs.v1/container :refer :all]
            [kubernetes.specs.v1/host-alias :refer :all]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            [kubernetes.specs.v1/container :refer :all]
            [kubernetes.specs.v1/pod-security-context :refer :all]
            [kubernetes.specs.v1/toleration :refer :all]
            [kubernetes.specs.v1/volume :refer :all]
            )
  (:import (java.io File)))


(def v1/pod-spec-data
  {
   (ds/opt :activeDeadlineSeconds) int?
   (ds/opt :affinity) v1/affinity-spec
   (ds/opt :automountServiceAccountToken) boolean?
   (ds/req :containers) (s/coll-of v1/container-spec)
   (ds/opt :dnsPolicy) string?
   (ds/opt :hostAliases) (s/coll-of v1/host-alias-spec)
   (ds/opt :hostIPC) boolean?
   (ds/opt :hostNetwork) boolean?
   (ds/opt :hostPID) boolean?
   (ds/opt :hostname) string?
   (ds/opt :imagePullSecrets) (s/coll-of v1/local-object-reference-spec)
   (ds/opt :initContainers) (s/coll-of v1/container-spec)
   (ds/opt :nodeName) string?
   (ds/opt :nodeSelector) (s/map-of string? string?)
   (ds/opt :priority) int?
   (ds/opt :priorityClassName) string?
   (ds/opt :restartPolicy) string?
   (ds/opt :schedulerName) string?
   (ds/opt :securityContext) v1/pod-security-context-spec
   (ds/opt :serviceAccount) string?
   (ds/opt :serviceAccountName) string?
   (ds/opt :subdomain) string?
   (ds/opt :terminationGracePeriodSeconds) int?
   (ds/opt :tolerations) (s/coll-of v1/toleration-spec)
   (ds/opt :volumes) (s/coll-of v1/volume-spec)
   })

(def v1/pod-spec-spec
  (ds/spec
    {:name ::v1/pod-spec
     :spec v1/pod-spec-data}))
