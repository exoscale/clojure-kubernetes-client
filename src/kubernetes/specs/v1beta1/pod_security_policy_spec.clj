(ns kubernetes.specs.v1beta1/pod-security-policy-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1beta1/allowed-host-path :refer :all]
            [kubernetes.specs.v1beta1/fs-group-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/host-port-range :refer :all]
            [kubernetes.specs.v1beta1/run-as-user-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/se-linux-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/supplemental-groups-strategy-options :refer :all]
            )
  (:import (java.io File)))


(def v1beta1/pod-security-policy-spec-data
  {
   (ds/opt :allowPrivilegeEscalation) boolean?
   (ds/opt :allowedCapabilities) (s/coll-of string?)
   (ds/opt :allowedHostPaths) (s/coll-of v1beta1/allowed-host-path-spec)
   (ds/opt :defaultAddCapabilities) (s/coll-of string?)
   (ds/opt :defaultAllowPrivilegeEscalation) boolean?
   (ds/req :fsGroup) v1beta1/fs-group-strategy-options-spec
   (ds/opt :hostIPC) boolean?
   (ds/opt :hostNetwork) boolean?
   (ds/opt :hostPID) boolean?
   (ds/opt :hostPorts) (s/coll-of v1beta1/host-port-range-spec)
   (ds/opt :privileged) boolean?
   (ds/opt :readOnlyRootFilesystem) boolean?
   (ds/opt :requiredDropCapabilities) (s/coll-of string?)
   (ds/req :runAsUser) v1beta1/run-as-user-strategy-options-spec
   (ds/req :seLinux) v1beta1/se-linux-strategy-options-spec
   (ds/req :supplementalGroups) v1beta1/supplemental-groups-strategy-options-spec
   (ds/opt :volumes) (s/coll-of string?)
   })

(def v1beta1/pod-security-policy-spec-spec
  (ds/spec
    {:name ::v1beta1/pod-security-policy-spec
     :spec v1beta1/pod-security-policy-spec-data}))
