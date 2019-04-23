(ns kubernetes.api.coordination-v1beta1
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [kubernetes.specs.v1/node-config-source :refer :all]
            [kubernetes.specs.extensions/v1beta1/fs-group-strategy-options :refer :all]
            [kubernetes.specs.v1/controller-revision :refer :all]
            [kubernetes.specs.v1beta1/csi-driver-spec :refer :all]
            [kubernetes.specs.v2beta2/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1/network-policy-peer :refer :all]
            [kubernetes.specs.v1/pod-anti-affinity :refer :all]
            [kubernetes.specs.v1/scale-io-volume-source :refer :all]
            [kubernetes.specs.v1/daemon-endpoint :refer :all]
            [kubernetes.specs.v1/env-var-source :refer :all]
            [kubernetes.specs.v1alpha1/audit-sink :refer :all]
            [kubernetes.specs.v1beta1/api-service-condition :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-spec :refer :all]
            [kubernetes.specs.v1/iscsi-persistent-volume-source :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-status :refer :all]
            [kubernetes.specs.extensions/v1beta1/pod-security-policy :refer :all]
            [kubernetes.specs.v1/replication-controller-condition :refer :all]
            [kubernetes.specs.apiextensions/v1beta1/webhook-client-config :refer :all]
            [kubernetes.specs.v1/volume-mount :refer :all]
            [kubernetes.specs.v1beta1/runtime-class :refer :all]
            [kubernetes.specs.extensions/v1beta1/rolling-update-deployment :refer :all]
            [kubernetes.specs.v1/resource-field-selector :refer :all]
            [kubernetes.specs.v1/component-condition :refer :all]
            [kubernetes.specs.v1/deployment :refer :all]
            [kubernetes.specs.v1/scale :refer :all]
            [kubernetes.specs.v1/network-policy-ingress-rule :refer :all]
            [kubernetes.specs.v1/binding :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-list :refer :all]
            [kubernetes.specs.v1/preconditions :refer :all]
            [kubernetes.specs.admissionregistration/v1beta1/service-reference :refer :all]
            [kubernetes.specs.v1/initializers :refer :all]
            [kubernetes.specs.v1/pod-template-list :refer :all]
            [kubernetes.specs.v1/toleration :refer :all]
            [kubernetes.specs.v1/node-spec :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/role-list :refer :all]
            [kubernetes.specs.v1beta1/volume-error :refer :all]
            [kubernetes.specs.v1beta1/csi-node-spec :refer :all]
            [kubernetes.specs.v1/deployment-spec :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget :refer :all]
            [kubernetes.specs.v1/role-binding :refer :all]
            [kubernetes.specs.extensions/v1beta1/allowed-host-path :refer :all]
            [kubernetes.specs.v1/daemon-set-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-tls :refer :all]
            [kubernetes.specs.v1/user-info :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-strategy :refer :all]
            [kubernetes.specs.v1/api-group-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/pod-security-policy-list :refer :all]
            [kubernetes.specs.v1beta1/role :refer :all]
            [kubernetes.specs.v1/downward-api-volume-file :refer :all]
            [kubernetes.specs.v1beta1/cluster-role :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.v1/config-map-projection :refer :all]
            [kubernetes.specs.v1/stateful-set :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-status :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-strategy :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.v1beta1/api-service-list :refer :all]
            [kubernetes.specs.v1/network-policy :refer :all]
            [kubernetes.specs.v1/iscsi-volume-source :refer :all]
            [kubernetes.specs.apps/v1beta1/rollback-config :refer :all]
            [kubernetes.specs.v1/lease-list :refer :all]
            [kubernetes.specs.v1/node-status :refer :all]
            [kubernetes.specs.v1/subject :refer :all]
            [kubernetes.specs.v1/csi-volume-source :refer :all]
            [kubernetes.specs.v1/cluster-role-list :refer :all]
            [kubernetes.specs.v1/cinder-volume-source :refer :all]
            [kubernetes.specs.v1/namespace-list :refer :all]
            [kubernetes.specs.v1/local-subject-access-review :refer :all]
            [kubernetes.specs.v1/limit-range :refer :all]
            [kubernetes.specs.v1/limit-range-list :refer :all]
            [kubernetes.specs.v1/config-map :refer :all]
            [kubernetes.specs.v1beta2/replica-set-status :refer :all]
            [kubernetes.specs.v1/replica-set-spec :refer :all]
            [kubernetes.specs.v1/load-balancer-ingress :refer :all]
            [kubernetes.specs.v1/pod-affinity :refer :all]
            [kubernetes.specs.v1/controller-revision-list :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-spec :refer :all]
            [kubernetes.specs.v1/pod :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-list :refer :all]
            [kubernetes.specs.v1/persistent-volume :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1/service-list :refer :all]
            [kubernetes.specs.v1beta1/job-template-spec :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-validation :refer :all]
            [kubernetes.specs.v1beta1/ip-block :refer :all]
            [kubernetes.specs.v1beta1/priority-class :refer :all]
            [kubernetes.specs.v1/namespace-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-list :refer :all]
            [kubernetes.specs.networking/v1beta1/http-ingress-path :refer :all]
            [kubernetes.specs.v1beta1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1/node-config-status :refer :all]
            [kubernetes.specs.v1/photon-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/endpoints :refer :all]
            [kubernetes.specs.v1beta1/network-policy-egress-rule :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-condition :refer :all]
            [kubernetes.specs.v1/service :refer :all]
            [kubernetes.specs.v1/volume-node-affinity :refer :all]
            [kubernetes.specs.v1/session-affinity-config :refer :all]
            [kubernetes.specs.v1/status :refer :all]
            [kubernetes.specs.v1/self-subject-access-review :refer :all]
            [kubernetes.specs.v1beta2/deployment :refer :all]
            [kubernetes.specs.v1/watch-event :refer :all]
            [kubernetes.specs.v1/cross-version-object-reference :refer :all]
            [kubernetes.specs.v1/managed-fields-entry :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-update-strategy :refer :all]
            [kubernetes.specs.version/info :refer :all]
            [kubernetes.specs.v1/flex-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/gce-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/job-list :refer :all]
            [kubernetes.specs.v1/container-state-waiting :refer :all]
            [kubernetes.specs.v2beta2/resource-metric-source :refer :all]
            [kubernetes.specs.v1/scale-io-persistent-volume-source :refer :all]
            [kubernetes.specs.v1beta1/api-service-status :refer :all]
            [kubernetes.specs.v1/pod-condition :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-list :refer :all]
            [kubernetes.specs.v1beta2/replica-set-spec :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-names :refer :all]
            [kubernetes.specs.v1beta1/replica-set-status :refer :all]
            [kubernetes.specs.v1beta1/local-subject-access-review :refer :all]
            [kubernetes.specs.v1beta1/validating-webhook-configuration-list :refer :all]
            [kubernetes.specs.v1/secret-list :refer :all]
            [kubernetes.specs.v1/priority-class :refer :all]
            [kubernetes.specs.networking/v1beta1/http-ingress-rule-value :refer :all]
            [kubernetes.specs.v1/node-list :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            [kubernetes.specs.v1/secret-reference :refer :all]
            [kubernetes.specs.v1/api-group :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-deployment :refer :all]
            [kubernetes.specs.v1/env-var :refer :all]
            [kubernetes.specs.v2beta2/resource-metric-status :refer :all]
            [kubernetes.specs.v1alpha1/policy-rule :refer :all]
            [kubernetes.specs.v2beta1/cross-version-object-reference :refer :all]
            [kubernetes.specs.v1beta1/runtime-class-list :refer :all]
            [kubernetes.specs.v1beta1/csi-driver-list :refer :all]
            [kubernetes.specs.v1/pod-spec :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-condition :refer :all]
            [kubernetes.specs.v1/pod-status :refer :all]
            [kubernetes.specs.v1/pod-dns-config :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-status :refer :all]
            [kubernetes.specs.v1/vsphere-virtual-disk-volume-source :refer :all]
            [kubernetes.specs.v1/token-review-spec :refer :all]
            [kubernetes.specs.v1/storage-class :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1beta2/controller-revision-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-status :refer :all]
            [kubernetes.specs.v1/api-service :refer :all]
            [kubernetes.specs.v2beta2/cross-version-object-reference :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset-list :refer :all]
            [kubernetes.specs.v1/service-account :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment :refer :all]
            [kubernetes.specs.v1beta1/daemon-set :refer :all]
            [kubernetes.specs.v1/service-port :refer :all]
            [kubernetes.specs.v1alpha1/priority-class :refer :all]
            [kubernetes.specs.v1beta1/api-service :refer :all]
            [kubernetes.specs.v1beta1/replica-set-condition :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.extensions/v1beta1/rollback-config :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-spec :refer :all]
            [kubernetes.specs.v1/namespace :refer :all]
            [kubernetes.specs.v1/resource-quota-spec :refer :all]
            [kubernetes.specs.v1/flex-volume-source :refer :all]
            [kubernetes.specs.v1/api-service-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/host-port-range :refer :all]
            [kubernetes.specs.v1beta1/eviction :refer :all]
            [kubernetes.specs.v1/exec-action :refer :all]
            [kubernetes.specs.v1/service-status :refer :all]
            [kubernetes.specs.v1/node-selector :refer :all]
            [kubernetes.specs.v1/resource-quota :refer :all]
            [kubernetes.specs.v1/rolling-update-deployment :refer :all]
            [kubernetes.specs.policy/v1beta1/allowed-host-path :refer :all]
            [kubernetes.specs.v1/limit-range-item :refer :all]
            [kubernetes.specs.v2beta2/pods-metric-source :refer :all]
            [kubernetes.specs.extensions/v1beta1/pod-security-policy-spec :refer :all]
            [kubernetes.specs.v1/secret :refer :all]
            [kubernetes.specs.v1beta2/deployment-condition :refer :all]
            [kubernetes.specs.v1/azure-file-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/scale-spec :refer :all]
            [kubernetes.specs.v1/handler :refer :all]
            [kubernetes.specs.v1beta2/scale-spec :refer :all]
            [kubernetes.specs.v1beta1/rule-with-operations :refer :all]
            [kubernetes.specs.v1/resource-attributes :refer :all]
            [kubernetes.specs.apiextensions/v1beta1/service-reference :refer :all]
            [kubernetes.specs.v1beta1/validating-webhook-configuration :refer :all]
            [kubernetes.specs.v1/capabilities :refer :all]
            [kubernetes.specs.v1/priority-class-list :refer :all]
            [kubernetes.specs.v1beta1/self-subject-rules-review-spec :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-status :refer :all]
            [kubernetes.specs.extensions/v1beta1/allowed-csi-driver :refer :all]
            [kubernetes.specs.v1/replica-set :refer :all]
            [kubernetes.specs.v1/sysctl :refer :all]
            [kubernetes.specs.v1/token-review :refer :all]
            [kubernetes.specs.v1/container :refer :all]
            [kubernetes.specs.v1/self-subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/daemon-set-status :refer :all]
            [kubernetes.specs.v1alpha1/webhook :refer :all]
            [kubernetes.specs.policy/v1beta1/id-range :refer :all]
            [kubernetes.specs.v1/resource-quota-status :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1/preferred-scheduling-term :refer :all]
            [kubernetes.specs.policy/v1beta1/run-as-user-strategy-options :refer :all]
            [kubernetes.specs.v1alpha1/volume-error :refer :all]
            [kubernetes.specs.v1beta1/api-service-spec :refer :all]
            [kubernetes.specs.v1beta1/volume-attachment :refer :all]
            [kubernetes.specs.v1/label-selector :refer :all]
            [kubernetes.specs.v1/self-subject-rules-review :refer :all]
            [kubernetes.specs.v1/scale-status :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-list :refer :all]
            [kubernetes.specs.v1/azure-disk-volume-source :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-spec :refer :all]
            [kubernetes.specs.v1alpha1/role-ref :refer :all]
            [kubernetes.specs.v1/rbd-volume-source :refer :all]
            [kubernetes.specs.v1beta1/resource-rule :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role-list :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-update-strategy :refer :all]
            [kubernetes.specs.v1beta1/csi-node :refer :all]
            [kubernetes.specs.v1beta1/csi-node-list :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-condition :refer :all]
            [kubernetes.specs.v1/taint :refer :all]
            [kubernetes.specs.v1/pod-template :refer :all]
            [kubernetes.specs.extensions/v1beta1/allowed-flex-volume :refer :all]
            [kubernetes.specs.v1/deployment-strategy :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-spec :refer :all]
            [kubernetes.specs.v1/deployment-list :refer :all]
            [kubernetes.specs.v1alpha1/volume-attachment :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-status :refer :all]
            [kubernetes.specs.policy/v1beta1/run-as-group-strategy-options :refer :all]
            [kubernetes.specs.v1/api-service-status :refer :all]
            [kubernetes.specs.v1/rolling-update-stateful-set-strategy :refer :all]
            [kubernetes.specs.apps/v1beta1/scale :refer :all]
            [kubernetes.specs.v1/downward-api-volume-source :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-spec :refer :all]
            [kubernetes.specs.v1/se-linux-options :refer :all]
            [kubernetes.specs.v1/storage-os-volume-source :refer :all]
            [kubernetes.specs.v2beta2/pods-metric-status :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-stateful-set-strategy :refer :all]
            [kubernetes.specs.v1beta1/cron-job :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-list :refer :all]
            [kubernetes.specs.policy/v1beta1/se-linux-strategy-options :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.v1/container-state :refer :all]
            [kubernetes.specs.v1beta1/token-review-spec :refer :all]
            [kubernetes.specs.v1/replica-set-list :refer :all]
            [kubernetes.specs.v1/node :refer :all]
            [kubernetes.specs.v1/http-header :refer :all]
            [kubernetes.specs.v1/topology-selector-label-requirement :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review-status :refer :all]
            [kubernetes.specs.v1beta1/network-policy-spec :refer :all]
            [kubernetes.specs.v2beta2/metric-spec :refer :all]
            [kubernetes.specs.v1/subject-rules-review-status :refer :all]
            [kubernetes.specs.v1/projected-volume-source :refer :all]
            [kubernetes.specs.v1/persistent-volume-spec :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-list :refer :all]
            [kubernetes.specs.v1/volume-device :refer :all]
            [kubernetes.specs.v1alpha1/volume-attachment-source :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1/volume-attachment :refer :all]
            [kubernetes.specs.v1/api-resource :refer :all]
            [kubernetes.specs.v1beta1/webhook :refer :all]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-conversion :refer :all]
            [kubernetes.specs.v1/limit-range-spec :refer :all]
            [kubernetes.specs.extensions/v1beta1/run-as-group-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-list :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset :refer :all]
            [kubernetes.specs.v1/network-policy-egress-rule :refer :all]
            [kubernetes.specs.v2beta2/horizontal-pod-autoscaler-status :refer :all]
            [kubernetes.specs.v1/replication-controller-status :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-spec :refer :all]
            [kubernetes.specs.v1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1alpha1/service-reference :refer :all]
            [kubernetes.specs.policy/v1beta1/pod-security-policy-list :refer :all]
            [kubernetes.specs.v1/node-selector-term :refer :all]
            [kubernetes.specs.v1/service-account-token-projection :refer :all]
            [kubernetes.specs.v1beta1/storage-class-list :refer :all]
            [kubernetes.specs.v1/service-spec :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-spec :refer :all]
            [kubernetes.specs.v1/node-address :refer :all]
            [kubernetes.specs.v1/quobyte-volume-source :refer :all]
            [kubernetes.specs.v1/volume-attachment-list :refer :all]
            [kubernetes.specs.v1/container-status :refer :all]
            [kubernetes.specs.v1/container-state-terminated :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-status :refer :all]
            [kubernetes.specs.v1/event :refer :all]
            [kubernetes.specs.v1beta1/resource-attributes :refer :all]
            [kubernetes.specs.v1/container-image :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-condition :refer :all]
            [kubernetes.specs.v1/azure-file-volume-source :refer :all]
            [kubernetes.specs.v1/job-spec :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-daemon-set :refer :all]
            [kubernetes.specs.v1alpha1/volume-attachment-status :refer :all]
            [kubernetes.specs.v1/key-to-path :refer :all]
            [kubernetes.specs.v1alpha1/webhook-throttle-config :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-status :refer :all]
            [kubernetes.specs.v1beta1/csi-driver :refer :all]
            [kubernetes.specs.v2beta1/resource-metric-source :refer :all]
            [kubernetes.specs.v1/git-repo-volume-source :refer :all]
            [kubernetes.specs.v1/node-system-info :refer :all]
            [kubernetes.specs.v1/config-map-list :refer :all]
            [kubernetes.specs.v1beta2/replica-set-list :refer :all]
            [kubernetes.specs.v1/http-get-action :refer :all]
            [kubernetes.specs.v2beta1/external-metric-source :refer :all]
            [kubernetes.specs.v1/stateful-set-condition :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-rollback :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1beta1/controller-revision :refer :all]
            [kubernetes.specs.v1/replication-controller-list :refer :all]
            [kubernetes.specs.v1beta1/subject-rules-review-status :refer :all]
            [kubernetes.specs.v1alpha1/volume-attachment-list :refer :all]
            [kubernetes.specs.v1beta1/controller-revision-list :refer :all]
            [kubernetes.specs.v1/lease :refer :all]
            [kubernetes.specs.v2beta1/resource-metric-status :refer :all]
            [kubernetes.specs.v2beta1/external-metric-status :refer :all]
            [kubernetes.specs.apps/v1beta1/rolling-update-deployment :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-status :refer :all]
            [kubernetes.specs.policy/v1beta1/fs-group-strategy-options :refer :all]
            [kubernetes.specs.v1/weighted-pod-affinity-term :refer :all]
            [kubernetes.specs.v1beta2/daemon-set :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-condition :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-list :refer :all]
            [kubernetes.specs.v1/job :refer :all]
            [kubernetes.specs.v1/secret-volume-source :refer :all]
            [kubernetes.specs.v1/server-address-by-client-cidr :refer :all]
            [kubernetes.specs.v1/node-daemon-endpoints :refer :all]
            [kubernetes.specs.v1/event-series :refer :all]
            [kubernetes.specs.v1beta1/lease :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition :refer :all]
            [kubernetes.specs.v1/pod-security-context :refer :all]
            [kubernetes.specs.v1/topology-selector-term :refer :all]
            [kubernetes.specs.v1/affinity :refer :all]
            [kubernetes.specs.v2beta1/metric-status :refer :all]
            [kubernetes.specs.v1/daemon-set-condition :refer :all]
            [kubernetes.specs.v1/empty-dir-volume-source :refer :all]
            [kubernetes.specs.v1/fc-volume-source :refer :all]
            [kubernetes.specs.v1/api-service-spec :refer :all]
            [kubernetes.specs.v1/volume-attachment-spec :refer :all]
            [kubernetes.specs.v1/resource-quota-list :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            [kubernetes.specs.v1/api-resource-list :refer :all]
            [kubernetes.specs.v1/deployment-condition :refer :all]
            [kubernetes.specs.v2beta2/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-status :refer :all]
            [kubernetes.specs.v1beta1/lease-list :refer :all]
            [kubernetes.specs.v1beta1/aggregation-rule :refer :all]
            [kubernetes.specs.v1/component-status :refer :all]
            [kubernetes.specs.v1beta1/cron-job-spec :refer :all]
            [kubernetes.specs.v1beta1/mutating-webhook-configuration-list :refer :all]
            [kubernetes.specs.v1/subject-access-review :refer :all]
            [kubernetes.specs.v1/config-map-volume-source :refer :all]
            [kubernetes.specs.v1alpha1/runtime-class-spec :refer :all]
            [kubernetes.specs.v1/secret-key-selector :refer :all]
            [kubernetes.specs.v1/tcp-socket-action :refer :all]
            [kubernetes.specs.v1/label-selector-requirement :refer :all]
            [kubernetes.specs.v1/storage-class-list :refer :all]
            [kubernetes.specs.v1/status-cause :refer :all]
            [kubernetes.specs.v1/cluster-role :refer :all]
            [kubernetes.specs.v1beta1/non-resource-rule :refer :all]
            [kubernetes.specs.v1/persistent-volume-status :refer :all]
            [kubernetes.specs.v1beta1/csi-node-driver :refer :all]
            [kubernetes.specs.v1/host-alias :refer :all]
            [kubernetes.specs.v1/client-ip-config :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress :refer :all]
            [kubernetes.specs.v1/volume-projection :refer :all]
            [kubernetes.specs.v1/stateful-set-list :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/id-range :refer :all]
            [kubernetes.specs.v1beta1/replica-set-spec :refer :all]
            [kubernetes.specs.v1beta2/replica-set :refer :all]
            [kubernetes.specs.v1beta1/replica-set :refer :all]
            [kubernetes.specs.extensions/v1beta1/supplemental-groups-strategy-options :refer :all]
            [kubernetes.specs.v1/subject-access-review-status :refer :all]
            [kubernetes.specs.v1/namespace-status :refer :all]
            [kubernetes.specs.v2beta2/metric-identifier :refer :all]
            [kubernetes.specs.v1/policy-rule :refer :all]
            [kubernetes.specs.v1/pod-dns-config-option :refer :all]
            [kubernetes.specs.v1/api-service-condition :refer :all]
            [kubernetes.specs.v1beta2/deployment-spec :refer :all]
            [kubernetes.specs.v1/aws-elastic-block-store-volume-source :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-status :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-version :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-list :refer :all]
            [kubernetes.specs.v1/local-volume-source :refer :all]
            [kubernetes.specs.v1beta1/stateful-set :refer :all]
            [kubernetes.specs.v1/pod-readiness-gate :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-binding :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-list :refer :all]
            [kubernetes.specs.policy/v1beta1/pod-security-policy-spec :refer :all]
            [kubernetes.specs.v1beta1/role-list :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim :refer :all]
            [kubernetes.specs.v2alpha1/job-template-spec :refer :all]
            [kubernetes.specs.v1beta1/role-binding-list :refer :all]
            [kubernetes.specs.v1/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment :refer :all]
            [kubernetes.specs.v1alpha1/volume-attachment-spec :refer :all]
            [kubernetes.specs.v2alpha1/cron-job :refer :all]
            [kubernetes.specs.v1/replication-controller :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-list :refer :all]
            [kubernetes.specs.v2beta1/metric-spec :refer :all]
            [kubernetes.specs.v1/volume-attachment-source :refer :all]
            [kubernetes.specs.v1/endpoint-subset :refer :all]
            [kubernetes.specs.v1/volume-error :refer :all]
            [kubernetes.specs.v1beta1/role-ref :refer :all]
            [kubernetes.specs.v1/rbd-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/glusterfs-volume-source :refer :all]
            [kubernetes.specs.v1beta1/network-policy-list :refer :all]
            [kubernetes.specs.v1/scope-selector :refer :all]
            [kubernetes.specs.v1/network-policy-spec :refer :all]
            [kubernetes.specs.v1/service-reference :refer :all]
            [kubernetes.specs.v1/resource-requirements :refer :all]
            [kubernetes.specs.v1/rolling-update-daemon-set :refer :all]
            [kubernetes.specs.v2beta2/object-metric-status :refer :all]
            [kubernetes.specs.v1/replica-set-condition :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-status :refer :all]
            [kubernetes.specs.v1/storage-os-persistent-volume-source :refer :all]
            [kubernetes.specs.v2beta2/external-metric-source :refer :all]
            [kubernetes.specs.v1/stateful-set-status :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-spec :refer :all]
            [kubernetes.specs.v1/ceph-fs-volume-source :refer :all]
            [kubernetes.specs.v1/volume :refer :all]
            [kubernetes.specs.v1beta1/event :refer :all]
            [kubernetes.specs.v1/stateful-set-spec :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-status :refer :all]
            [kubernetes.specs.v1beta1/replica-set-list :refer :all]
            [kubernetes.specs.v1beta1/storage-class :refer :all]
            [kubernetes.specs.v1/daemon-set :refer :all]
            [kubernetes.specs.v1beta1/network-policy-port :refer :all]
            [kubernetes.specs.v1alpha1/role-binding-list :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-status :refer :all]
            [kubernetes.specs.v1beta1/event-list :refer :all]
            [kubernetes.specs.v1/subject-access-review-spec :refer :all]
            [kubernetes.specs.v1beta1/volume-attachment-list :refer :all]
            [kubernetes.specs.v2beta2/object-metric-source :refer :all]
            [kubernetes.specs.v1/api-versions :refer :all]
            [kubernetes.specs.v2beta2/external-metric-status :refer :all]
            [kubernetes.specs.v1/replication-controller-spec :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-subresource-scale :refer :all]
            [kubernetes.specs.v1beta1/network-policy :refer :all]
            [kubernetes.specs.v1/container-port :refer :all]
            [kubernetes.specs.v2beta2/metric-value-status :refer :all]
            [kubernetes.specs.v1/cluster-role-binding :refer :all]
            [kubernetes.specs.apiregistration/v1beta1/service-reference :refer :all]
            [kubernetes.specs.v1/config-map-key-selector :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1/job-status :refer :all]
            [kubernetes.specs.v1/object-field-selector :refer :all]
            [kubernetes.specs.v1alpha1/aggregation-rule :refer :all]
            [kubernetes.specs.v1/node-condition :refer :all]
            [kubernetes.specs.v1/config-map-env-source :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-list :refer :all]
            [kubernetes.specs.v1/config-map-node-config-source :refer :all]
            [kubernetes.specs.v2beta2/metric-status :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-spec :refer :all]
            [kubernetes.specs.v1/delete-options :refer :all]
            [kubernetes.specs.v1/attached-volume :refer :all]
            [kubernetes.specs.extensions/v1beta1/ingress-status :refer :all]
            [kubernetes.specs.v1/pod-affinity-term :refer :all]
            [kubernetes.specs.policy/v1beta1/pod-security-policy :refer :all]
            [kubernetes.specs.v1beta1/mutating-webhook-configuration :refer :all]
            [kubernetes.specs.v1beta1/self-subject-rules-review :refer :all]
            [kubernetes.specs.v1alpha1/runtime-class :refer :all]
            [kubernetes.specs.v1alpha1/role-binding :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role-binding :refer :all]
            [kubernetes.specs.v1/role :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-status :refer :all]
            [kubernetes.specs.v1/volume-attachment-status :refer :all]
            [kubernetes.specs.v1beta2/replica-set-condition :refer :all]
            [kubernetes.specs.v1/endpoints-list :refer :all]
            [kubernetes.specs.v1beta2/scale :refer :all]
            [kubernetes.specs.v1alpha1/role :refer :all]
            [kubernetes.specs.v1/security-context :refer :all]
            [kubernetes.specs.v1beta2/controller-revision :refer :all]
            [kubernetes.specs.v1beta2/deployment-list :refer :all]
            [kubernetes.specs.v1/cinder-persistent-volume-source :refer :all]
            [kubernetes.specs.v1alpha1/webhook-client-config :refer :all]
            [kubernetes.specs.policy/v1beta1/host-port-range :refer :all]
            [kubernetes.specs.v2beta2/horizontal-pod-autoscaler-list :refer :all]
            [kubernetes.specs.v1beta1/cron-job-status :refer :all]
            [kubernetes.specs.v1alpha1/runtime-class-list :refer :all]
            [kubernetes.specs.v1/daemon-set-spec :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-spec :refer :all]
            [kubernetes.specs.v1/group-version-for-discovery :refer :all]
            [kubernetes.specs.v1/endpoint-port :refer :all]
            [kubernetes.specs.v1/nfs-volume-source :refer :all]
            [kubernetes.specs.v1/self-subject-rules-review-spec :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-condition :refer :all]
            [kubernetes.specs.v1/deployment-status :refer :all]
            [kubernetes.specs.v1/job-condition :refer :all]
            [kubernetes.specs.extensions/v1beta1/run-as-user-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/token-review-status :refer :all]
            [kubernetes.specs.runtime/raw-extension :refer :all]
            [kubernetes.specs.v1/initializer :refer :all]
            [kubernetes.specs.networking/v1beta1/ingress-tls :refer :all]
            [kubernetes.specs.v1/node-selector-requirement :refer :all]
            [kubernetes.specs.v2beta2/metric-target :refer :all]
            [kubernetes.specs.v1/lease-spec :refer :all]
            [kubernetes.specs.v1/env-from-source :refer :all]
            [kubernetes.specs.v1beta1/volume-attachment-status :refer :all]
            [kubernetes.specs.v1/ceph-fs-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/node-affinity :refer :all]
            [kubernetes.specs.v1beta1/policy-rule :refer :all]
            [kubernetes.specs.v1/token-review-status :refer :all]
            [kubernetes.specs.v1/event-list :refer :all]
            [kubernetes.specs.v1/aggregation-rule :refer :all]
            [kubernetes.specs.policy/v1beta1/supplemental-groups-strategy-options :refer :all]
            [kubernetes.specs.v1/resource-rule :refer :all]
            [kubernetes.specs.v1/service-account-list :refer :all]
            [kubernetes.specs.v1/event-source :refer :all]
            [kubernetes.specs.v1/status-details :refer :all]
            [kubernetes.specs.v1/daemon-set-update-strategy :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-condition :refer :all]
            [kubernetes.specs.v1beta1/lease-spec :refer :all]
            [kubernetes.specs.v1beta1/user-info :refer :all]
            [kubernetes.specs.v1alpha1/policy :refer :all]
            [kubernetes.specs.v1alpha1/audit-sink-spec :refer :all]
            [kubernetes.specs.v2beta2/horizontal-pod-autoscaler-condition :refer :all]
            [kubernetes.specs.v1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-status :refer :all]
            [kubernetes.specs.v1/role-list :refer :all]
            [kubernetes.specs.v1/component-status-list :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role :refer :all]
            [kubernetes.specs.v1beta1/volume-attachment-source :refer :all]
            [kubernetes.specs.v1/probe :refer :all]
            [kubernetes.specs.v1beta1/priority-class-list :refer :all]
            [kubernetes.specs.v1/container-state-running :refer :all]
            [kubernetes.specs.v1/load-balancer-status :refer :all]
            [kubernetes.specs.v1alpha1/priority-class-list :refer :all]
            [kubernetes.specs.v1/host-path-volume-source :refer :all]
            [kubernetes.specs.v1beta2/scale-status :refer :all]
            [kubernetes.specs.extensions/v1beta1/se-linux-strategy-options :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-volume-source :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-condition :refer :all]
            [kubernetes.specs.v1/role-binding-list :refer :all]
            [kubernetes.specs.v1alpha1/audit-sink-list :refer :all]
            [kubernetes.specs.v1/pod-list :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-condition :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1/scoped-resource-selector-requirement :refer :all]
            [kubernetes.specs.v1/replica-set-status :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.v1/portworx-volume-source :refer :all]
            [kubernetes.specs.v1/secret-projection :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-condition :refer :all]
            [kubernetes.specs.policy/v1beta1/allowed-flex-volume :refer :all]
            [kubernetes.specs.v1beta1/self-subject-access-review :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-list :refer :all]
            [kubernetes.specs.v1/typed-local-object-reference :refer :all]
            [kubernetes.specs.extensions/v1beta1/http-ingress-rule-value :refer :all]
            [kubernetes.specs.policy/v1beta1/allowed-csi-driver :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-column-definition :refer :all]
            [kubernetes.specs.v1beta1/subject :refer :all]
            [kubernetes.specs.v1/secret-env-source :refer :all]
            [kubernetes.specs.v1beta2/deployment-strategy :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request :refer :all]
            [kubernetes.specs.v1beta1/external-documentation :refer :all]
            [kubernetes.specs.v1/downward-api-projection :refer :all]
            [kubernetes.specs.v2beta1/pods-metric-status :refer :all]
            [kubernetes.specs.v1/role-ref :refer :all]
            [kubernetes.specs.v1/glusterfs-persistent-volume-source :refer :all]
            [kubernetes.specs.v1beta1/role-binding :refer :all]
            [kubernetes.specs.v1beta1/token-review :refer :all]
            [kubernetes.specs.v1/network-policy-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/http-ingress-path :refer :all]
            [kubernetes.specs.v1/lifecycle :refer :all]
            [kubernetes.specs.admissionregistration/v1beta1/webhook-client-config :refer :all]
            [kubernetes.specs.v2beta1/object-metric-status :refer :all]
            [kubernetes.specs.v1beta1/rolling-update-daemon-set :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-rollback :refer :all]
            [kubernetes.specs.v1/endpoint-address :refer :all]
            [kubernetes.specs.v1beta1/cron-job-list :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset-spec :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review-spec :refer :all]
            [kubernetes.specs.v2beta1/pods-metric-source :refer :all]
            [kubernetes.specs.v1/owner-reference :refer :all]
            [kubernetes.specs.v1beta1/rolling-update-stateful-set-strategy :refer :all]
            [kubernetes.specs.v1beta2/deployment-status :refer :all]
            [kubernetes.specs.v1beta1/network-policy-peer :refer :all]
            [kubernetes.specs.v1beta1/network-policy-ingress-rule :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-spec :refer :all]
            [kubernetes.specs.v1/csi-persistent-volume-source :refer :all]
            [kubernetes.specs.v1beta1/self-subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/non-resource-rule :refer :all]
            [kubernetes.specs.v1beta1/event-series :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-subresources :refer :all]
            [kubernetes.specs.v1/network-policy-port :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-list :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.v1beta1/volume-attachment-spec :refer :all]
            [kubernetes.specs.v1alpha1/subject :refer :all]
            [kubernetes.specs.v1/flocker-volume-source :refer :all]
            [kubernetes.specs.v2beta1/object-metric-source :refer :all]
            [kubernetes.specs.v1beta2/stateful-set :refer :all]
            [kubernetes.specs.v1/ip-block :refer :all]
            )
  (:import (java.io File)))


(defn-spec create-namespaced-lease-with-http-info any?
  "
  create a Lease"
  ([namespace string?, body v1beta1/lease, ] (create-namespaced-lease-with-http-info namespace body nil))
  ([namespace string?, body v1beta1/lease, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-lease v1beta1/lease-spec
  "
  create a Lease"
  ([namespace string?, body v1beta1/lease, ] (create-namespaced-lease namespace body nil))
  ([namespace string?, body v1beta1/lease, optional-params any?]
   (let [res (:data (create-namespaced-lease-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-spec res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-lease-with-http-info any?
  "
  delete collection of Lease"
  ([namespace string?, ] (delete-collection-namespaced-lease-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-lease v1/status-spec
  "
  delete collection of Lease"
  ([namespace string?, ] (delete-collection-namespaced-lease namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-lease-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-namespaced-lease-with-http-info any?
  "
  delete a Lease"
  ([name string?, namespace string?, ] (delete-namespaced-lease-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-lease v1/status-spec
  "
  delete a Lease"
  ([name string?, namespace string?, ] (delete-namespaced-lease name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-lease-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/coordination.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-api-resources v1/api-resource-list-spec
  "
  get available resources"
  []
  (let [res (:data (get-api-resources-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1/api-resource-list-spec res st/string-transformer)
       res)))


(defn-spec list-lease-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Lease"
  ([] (list-lease-for-all-namespaces-with-http-info nil))
  ([{:keys [continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/coordination.k8s.io/v1beta1/leases" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-lease-for-all-namespaces v1beta1/lease-list-spec
  "
  list or watch objects of kind Lease"
  ([] (list-lease-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-lease-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-list-spec res st/string-transformer)
        res))))


(defn-spec list-namespaced-lease-with-http-info any?
  "
  list or watch objects of kind Lease"
  ([namespace string?, ] (list-namespaced-lease-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-lease v1beta1/lease-list-spec
  "
  list or watch objects of kind Lease"
  ([namespace string?, ] (list-namespaced-lease namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-lease-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-list-spec res st/string-transformer)
        res))))


(defn-spec patch-namespaced-lease-with-http-info any?
  "
  partially update the specified Lease"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-lease-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-lease v1beta1/lease-spec
  "
  partially update the specified Lease"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-lease name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-lease-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-spec res st/string-transformer)
        res))))


(defn-spec read-namespaced-lease-with-http-info any?
  "
  read the specified Lease"
  ([name string?, namespace string?, ] (read-namespaced-lease-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-lease v1beta1/lease-spec
  "
  read the specified Lease"
  ([name string?, namespace string?, ] (read-namespaced-lease name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-lease-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-spec res st/string-transformer)
        res))))


(defn-spec replace-namespaced-lease-with-http-info any?
  "
  replace the specified Lease"
  ([name string?, namespace string?, body v1beta1/lease, ] (replace-namespaced-lease-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1/lease, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-lease v1beta1/lease-spec
  "
  replace the specified Lease"
  ([name string?, namespace string?, body v1beta1/lease, ] (replace-namespaced-lease name namespace body nil))
  ([name string?, namespace string?, body v1beta1/lease, optional-params any?]
   (let [res (:data (replace-namespaced-lease-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1/lease-spec res st/string-transformer)
        res))))


