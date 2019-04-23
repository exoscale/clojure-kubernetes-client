(ns kubernetes.specs.policy/v1beta1/pod-security-policy-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.policy/v1beta1/allowed-csi-driver :refer :all]
            [kubernetes.specs.policy/v1beta1/allowed-flex-volume :refer :all]
            [kubernetes.specs.policy/v1beta1/allowed-host-path :refer :all]
            [kubernetes.specs.policy/v1beta1/fs-group-strategy-options :refer :all]
            [kubernetes.specs.policy/v1beta1/host-port-range :refer :all]
            [kubernetes.specs.policy/v1beta1/run-as-group-strategy-options :refer :all]
            [kubernetes.specs.policy/v1beta1/run-as-user-strategy-options :refer :all]
            [kubernetes.specs.policy/v1beta1/se-linux-strategy-options :refer :all]
            [kubernetes.specs.policy/v1beta1/supplemental-groups-strategy-options :refer :all]
            )
  (:import (java.io File)))


(def policy/v1beta1/pod-security-policy-spec-data
  {
   (ds/opt :allowPrivilegeEscalation) boolean?
   (ds/opt :allowedCSIDrivers) (s/coll-of policy/v1beta1/allowed-csi-driver-spec)
   (ds/opt :allowedCapabilities) (s/coll-of string?)
   (ds/opt :allowedFlexVolumes) (s/coll-of policy/v1beta1/allowed-flex-volume-spec)
   (ds/opt :allowedHostPaths) (s/coll-of policy/v1beta1/allowed-host-path-spec)
   (ds/opt :allowedProcMountTypes) (s/coll-of string?)
   (ds/opt :allowedUnsafeSysctls) (s/coll-of string?)
   (ds/opt :defaultAddCapabilities) (s/coll-of string?)
   (ds/opt :defaultAllowPrivilegeEscalation) boolean?
   (ds/opt :forbiddenSysctls) (s/coll-of string?)
   (ds/req :fsGroup) policy/v1beta1/fs-group-strategy-options-spec
   (ds/opt :hostIPC) boolean?
   (ds/opt :hostNetwork) boolean?
   (ds/opt :hostPID) boolean?
   (ds/opt :hostPorts) (s/coll-of policy/v1beta1/host-port-range-spec)
   (ds/opt :privileged) boolean?
   (ds/opt :readOnlyRootFilesystem) boolean?
   (ds/opt :requiredDropCapabilities) (s/coll-of string?)
   (ds/opt :runAsGroup) policy/v1beta1/run-as-group-strategy-options-spec
   (ds/req :runAsUser) policy/v1beta1/run-as-user-strategy-options-spec
   (ds/req :seLinux) policy/v1beta1/se-linux-strategy-options-spec
   (ds/req :supplementalGroups) policy/v1beta1/supplemental-groups-strategy-options-spec
   (ds/opt :volumes) (s/coll-of string?)
   })

(def policy/v1beta1/pod-security-policy-spec-spec
  (ds/spec
    {:name ::policy/v1beta1/pod-security-policy-spec
     :spec policy/v1beta1/pod-security-policy-spec-data}))
