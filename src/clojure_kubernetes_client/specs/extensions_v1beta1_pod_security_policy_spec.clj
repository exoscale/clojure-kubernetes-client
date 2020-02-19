(ns clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-csi-driver :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-flex-volume :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-host-path :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-fs-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-host-port-range :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-run-as-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-run-as-user-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-runtime-class-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-se-linux-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-supplemental-groups-strategy-options :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-pod-security-policy-spec-data extensions-v1beta1-pod-security-policy-spec)
(def extensions-v1beta1-pod-security-policy-spec-data
  {
   (ds/opt :allowPrivilegeEscalation) boolean?
   (ds/opt :allowedCSIDrivers) (s/coll-of extensions-v1beta1-allowed-csi-driver)
   (ds/opt :allowedCapabilities) (s/coll-of string?)
   (ds/opt :allowedFlexVolumes) (s/coll-of extensions-v1beta1-allowed-flex-volume)
   (ds/opt :allowedHostPaths) (s/coll-of extensions-v1beta1-allowed-host-path)
   (ds/opt :allowedProcMountTypes) (s/coll-of string?)
   (ds/opt :allowedUnsafeSysctls) (s/coll-of string?)
   (ds/opt :defaultAddCapabilities) (s/coll-of string?)
   (ds/opt :defaultAllowPrivilegeEscalation) boolean?
   (ds/opt :forbiddenSysctls) (s/coll-of string?)
   (ds/req :fsGroup) extensions-v1beta1-fs-group-strategy-options
   (ds/opt :hostIPC) boolean?
   (ds/opt :hostNetwork) boolean?
   (ds/opt :hostPID) boolean?
   (ds/opt :hostPorts) (s/coll-of extensions-v1beta1-host-port-range)
   (ds/opt :privileged) boolean?
   (ds/opt :readOnlyRootFilesystem) boolean?
   (ds/opt :requiredDropCapabilities) (s/coll-of string?)
   (ds/opt :runAsGroup) extensions-v1beta1-run-as-group-strategy-options
   (ds/req :runAsUser) extensions-v1beta1-run-as-user-strategy-options
   (ds/opt :runtimeClass) extensions-v1beta1-runtime-class-strategy-options
   (ds/req :seLinux) extensions-v1beta1-se-linux-strategy-options
   (ds/req :supplementalGroups) extensions-v1beta1-supplemental-groups-strategy-options
   (ds/opt :volumes) (s/coll-of string?)
   })

(def extensions-v1beta1-pod-security-policy-spec
  (ds/spec
    {:name ::extensions-v1beta1-pod-security-policy-spec
     :spec extensions-v1beta1-pod-security-policy-spec-data}))

