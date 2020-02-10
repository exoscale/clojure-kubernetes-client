(ns clojure-kubernetes-client.specs.v1-pod-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-container :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-dns-config :refer :all]
            [clojure-kubernetes-client.specs.v1-ephemeral-container :refer :all]
            [clojure-kubernetes-client.specs.v1-host-alias :refer :all]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-container :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-readiness-gate :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-security-context :refer :all]
            [clojure-kubernetes-client.specs.v1-toleration :refer :all]
            [clojure-kubernetes-client.specs.v1-topology-spread-constraint :refer :all]
            [clojure-kubernetes-client.specs.v1-volume :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-spec-data v1-pod-spec)
(def v1-pod-spec-data
  {
   (ds/opt :activeDeadlineSeconds) int?
   (ds/opt :affinity) v1-affinity
   (ds/opt :automountServiceAccountToken) boolean?
   (ds/req :containers) (s/coll-of v1-container)
   (ds/opt :dnsConfig) v1-pod-dns-config
   (ds/opt :dnsPolicy) string?
   (ds/opt :enableServiceLinks) boolean?
   (ds/opt :ephemeralContainers) (s/coll-of v1-ephemeral-container)
   (ds/opt :hostAliases) (s/coll-of v1-host-alias)
   (ds/opt :hostIPC) boolean?
   (ds/opt :hostNetwork) boolean?
   (ds/opt :hostPID) boolean?
   (ds/opt :hostname) string?
   (ds/opt :imagePullSecrets) (s/coll-of v1-local-object-reference)
   (ds/opt :initContainers) (s/coll-of v1-container)
   (ds/opt :nodeName) string?
   (ds/opt :nodeSelector) (s/map-of string? string?)
   (ds/opt :overhead) (s/map-of string? string?)
   (ds/opt :preemptionPolicy) string?
   (ds/opt :priority) int?
   (ds/opt :priorityClassName) string?
   (ds/opt :readinessGates) (s/coll-of v1-pod-readiness-gate)
   (ds/opt :restartPolicy) string?
   (ds/opt :runtimeClassName) string?
   (ds/opt :schedulerName) string?
   (ds/opt :securityContext) v1-pod-security-context
   (ds/opt :serviceAccount) string?
   (ds/opt :serviceAccountName) string?
   (ds/opt :shareProcessNamespace) boolean?
   (ds/opt :subdomain) string?
   (ds/opt :terminationGracePeriodSeconds) int?
   (ds/opt :tolerations) (s/coll-of v1-toleration)
   (ds/opt :topologySpreadConstraints) (s/coll-of v1-topology-spread-constraint)
   (ds/opt :volumes) (s/coll-of v1-volume)
   })

(def v1-pod-spec
  (ds/spec
    {:name ::v1-pod-spec
     :spec v1-pod-spec-data}))

