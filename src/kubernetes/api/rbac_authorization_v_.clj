(ns kubernetes.api.rbac-authorization-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [kubernetes.specs.v1/node-config-source :refer :all]
            [kubernetes.specs.v1/network-policy-peer :refer :all]
            [kubernetes.specs.v1/pod-anti-affinity :refer :all]
            [kubernetes.specs.v1/scale-io-volume-source :refer :all]
            [kubernetes.specs.v1/daemon-endpoint :refer :all]
            [kubernetes.specs.v1/env-var-source :refer :all]
            [kubernetes.specs.v1beta1/api-service-condition :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-spec :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-status :refer :all]
            [kubernetes.specs.v1/replication-controller-condition :refer :all]
            [kubernetes.specs.v1/volume-mount :refer :all]
            [kubernetes.specs.extensions/v1beta1/rolling-update-deployment :refer :all]
            [kubernetes.specs.v1/resource-field-selector :refer :all]
            [kubernetes.specs.v1/component-condition :refer :all]
            [kubernetes.specs.v1/scale :refer :all]
            [kubernetes.specs.v1/network-policy-ingress-rule :refer :all]
            [kubernetes.specs.v1/binding :refer :all]
            [kubernetes.specs.v1/preconditions :refer :all]
            [kubernetes.specs.v1/initializers :refer :all]
            [kubernetes.specs.v1/pod-template-list :refer :all]
            [kubernetes.specs.v1/toleration :refer :all]
            [kubernetes.specs.v1/node-spec :refer :all]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1alpha1/role-list :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget :refer :all]
            [kubernetes.specs.v1/role-binding :refer :all]
            [kubernetes.specs.v1/user-info :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-strategy :refer :all]
            [kubernetes.specs.v1/api-group-list :refer :all]
            [kubernetes.specs.v1beta1/role :refer :all]
            [kubernetes.specs.v1/downward-api-volume-file :refer :all]
            [kubernetes.specs.v1beta1/cluster-role :refer :all]
            [kubernetes.specs.v1/config-map-projection :refer :all]
            [kubernetes.specs.v1beta1/ingress-list :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-status :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-strategy :refer :all]
            [kubernetes.specs.v1beta1/api-service-list :refer :all]
            [kubernetes.specs.v1/network-policy :refer :all]
            [kubernetes.specs.v1/iscsi-volume-source :refer :all]
            [kubernetes.specs.apps/v1beta1/rollback-config :refer :all]
            [kubernetes.specs.v1/node-status :refer :all]
            [kubernetes.specs.v1/subject :refer :all]
            [kubernetes.specs.v1/cluster-role-list :refer :all]
            [kubernetes.specs.v1beta1/id-range :refer :all]
            [kubernetes.specs.v1/cinder-volume-source :refer :all]
            [kubernetes.specs.v1/namespace-list :refer :all]
            [kubernetes.specs.v1/local-subject-access-review :refer :all]
            [kubernetes.specs.v1/limit-range :refer :all]
            [kubernetes.specs.v1/limit-range-list :refer :all]
            [kubernetes.specs.v1/config-map :refer :all]
            [kubernetes.specs.v1beta1/ingress-backend :refer :all]
            [kubernetes.specs.v1beta2/replica-set-status :refer :all]
            [kubernetes.specs.v1/load-balancer-ingress :refer :all]
            [kubernetes.specs.v1/pod-affinity :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-spec :refer :all]
            [kubernetes.specs.v1/pod :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-list :refer :all]
            [kubernetes.specs.v1/persistent-volume :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1/service-list :refer :all]
            [kubernetes.specs.v1beta1/job-template-spec :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-validation :refer :all]
            [kubernetes.specs.v1beta1/ip-block :refer :all]
            [kubernetes.specs.v1/namespace-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-list :refer :all]
            [kubernetes.specs.v1beta1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1/photon-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/endpoints :refer :all]
            [kubernetes.specs.v1beta1/network-policy-egress-rule :refer :all]
            [kubernetes.specs.v1beta1/allowed-host-path :refer :all]
            [kubernetes.specs.v1/service :refer :all]
            [kubernetes.specs.v1/session-affinity-config :refer :all]
            [kubernetes.specs.v1/status :refer :all]
            [kubernetes.specs.v1alpha1/rule-with-operations :refer :all]
            [kubernetes.specs.v1/self-subject-access-review :refer :all]
            [kubernetes.specs.v1beta2/deployment :refer :all]
            [kubernetes.specs.v1/watch-event :refer :all]
            [kubernetes.specs.v1beta1/fs-group-strategy-options :refer :all]
            [kubernetes.specs.v1/cross-version-object-reference :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-update-strategy :refer :all]
            [kubernetes.specs.version/info :refer :all]
            [kubernetes.specs.v1beta1/json :refer :all]
            [kubernetes.specs.v1/gce-persistent-disk-volume-source :refer :all]
            [kubernetes.specs.v1/job-list :refer :all]
            [kubernetes.specs.v1/container-state-waiting :refer :all]
            [kubernetes.specs.v1/scale-io-persistent-volume-source :refer :all]
            [kubernetes.specs.v1beta1/api-service-status :refer :all]
            [kubernetes.specs.v1/pod-condition :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-list :refer :all]
            [kubernetes.specs.v1beta2/replica-set-spec :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-names :refer :all]
            [kubernetes.specs.v1beta1/replica-set-status :refer :all]
            [kubernetes.specs.v1beta1/local-subject-access-review :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-bool :refer :all]
            [kubernetes.specs.v1/secret-list :refer :all]
            [kubernetes.specs.v1/node-list :refer :all]
            [kubernetes.specs.v1/pod-template-spec :refer :all]
            [kubernetes.specs.v1/secret-reference :refer :all]
            [kubernetes.specs.v1/api-group :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-deployment :refer :all]
            [kubernetes.specs.v1beta1/http-ingress-rule-value :refer :all]
            [kubernetes.specs.v1/env-var :refer :all]
            [kubernetes.specs.v1alpha1/policy-rule :refer :all]
            [kubernetes.specs.v2beta1/cross-version-object-reference :refer :all]
            [kubernetes.specs.v1/pod-spec :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-condition :refer :all]
            [kubernetes.specs.v1/pod-status :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-status :refer :all]
            [kubernetes.specs.v1/vsphere-virtual-disk-volume-source :refer :all]
            [kubernetes.specs.v1/token-review-spec :refer :all]
            [kubernetes.specs.v1/storage-class :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1beta1/host-port-range :refer :all]
            [kubernetes.specs.v1beta2/controller-revision-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-status :refer :all]
            [kubernetes.specs.v1beta1/ingress :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset-list :refer :all]
            [kubernetes.specs.v1/service-account :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment :refer :all]
            [kubernetes.specs.v1beta1/daemon-set :refer :all]
            [kubernetes.specs.v1/service-port :refer :all]
            [kubernetes.specs.v1alpha1/priority-class :refer :all]
            [kubernetes.specs.v1beta1/api-service :refer :all]
            [kubernetes.specs.v1beta1/replica-set-condition :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-list :refer :all]
            [kubernetes.specs.extensions/v1beta1/rollback-config :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-spec :refer :all]
            [kubernetes.specs.v1/namespace :refer :all]
            [kubernetes.specs.v1/resource-quota-spec :refer :all]
            [kubernetes.specs.v1/flex-volume-source :refer :all]
            [kubernetes.specs.v1beta1/se-linux-strategy-options :refer :all]
            [kubernetes.specs.v1beta1/eviction :refer :all]
            [kubernetes.specs.v1/exec-action :refer :all]
            [kubernetes.specs.v1/service-status :refer :all]
            [kubernetes.specs.v1/node-selector :refer :all]
            [kubernetes.specs.v1/resource-quota :refer :all]
            [kubernetes.specs.v1/limit-range-item :refer :all]
            [kubernetes.specs.v1/secret :refer :all]
            [kubernetes.specs.v1beta2/deployment-condition :refer :all]
            [kubernetes.specs.v1/azure-file-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/scale-spec :refer :all]
            [kubernetes.specs.v1/handler :refer :all]
            [kubernetes.specs.v1beta2/scale-spec :refer :all]
            [kubernetes.specs.v1/resource-attributes :refer :all]
            [kubernetes.specs.v1/capabilities :refer :all]
            [kubernetes.specs.v1beta1/self-subject-rules-review-spec :refer :all]
            [kubernetes.specs.v1/token-review :refer :all]
            [kubernetes.specs.v1/container :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-string-array :refer :all]
            [kubernetes.specs.v1/self-subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/resource-quota-status :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1/preferred-scheduling-term :refer :all]
            [kubernetes.specs.v1beta1/api-service-spec :refer :all]
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
            [kubernetes.specs.v1/taint :refer :all]
            [kubernetes.specs.v1/pod-template :refer :all]
            [kubernetes.specs.v1beta1/http-ingress-path :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-status :refer :all]
            [kubernetes.specs.apps/v1beta1/scale :refer :all]
            [kubernetes.specs.v1/downward-api-volume-source :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-spec :refer :all]
            [kubernetes.specs.v1/se-linux-options :refer :all]
            [kubernetes.specs.v1/storage-os-volume-source :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-stateful-set-strategy :refer :all]
            [kubernetes.specs.v1alpha1/rule :refer :all]
            [kubernetes.specs.v1beta1/cron-job :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-list :refer :all]
            [kubernetes.specs.v1/container-state :refer :all]
            [kubernetes.specs.v1beta1/token-review-spec :refer :all]
            [kubernetes.specs.v1/node :refer :all]
            [kubernetes.specs.v1/http-header :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review-status :refer :all]
            [kubernetes.specs.v1beta1/network-policy-spec :refer :all]
            [kubernetes.specs.v1/subject-rules-review-status :refer :all]
            [kubernetes.specs.v1beta1/service-reference :refer :all]
            [kubernetes.specs.v1/projected-volume-source :refer :all]
            [kubernetes.specs.v1/persistent-volume-spec :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-list :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1/api-resource :refer :all]
            [kubernetes.specs.v1/local-object-reference :refer :all]
            [kubernetes.specs.v1/limit-range-spec :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-list :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset :refer :all]
            [kubernetes.specs.v1/network-policy-egress-rule :refer :all]
            [kubernetes.specs.v1/replication-controller-status :refer :all]
            [kubernetes.specs.v1beta1/ingress-spec :refer :all]
            [kubernetes.specs.v1/non-resource-attributes :refer :all]
            [kubernetes.specs.v1alpha1/service-reference :refer :all]
            [kubernetes.specs.v1/node-selector-term :refer :all]
            [kubernetes.specs.v1beta1/storage-class-list :refer :all]
            [kubernetes.specs.v1/service-spec :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request-spec :refer :all]
            [kubernetes.specs.v1/node-address :refer :all]
            [kubernetes.specs.v1/quobyte-volume-source :refer :all]
            [kubernetes.specs.v1/container-status :refer :all]
            [kubernetes.specs.v1/container-state-terminated :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-spec :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-status :refer :all]
            [kubernetes.specs.v1/event :refer :all]
            [kubernetes.specs.v1beta1/resource-attributes :refer :all]
            [kubernetes.specs.v1alpha1/external-admission-hook-configuration :refer :all]
            [kubernetes.specs.v1/container-image :refer :all]
            [kubernetes.specs.v1/object-reference :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-condition :refer :all]
            [kubernetes.specs.v1/azure-file-volume-source :refer :all]
            [kubernetes.specs.v1/job-spec :refer :all]
            [kubernetes.specs.v1beta2/rolling-update-daemon-set :refer :all]
            [kubernetes.specs.v1/key-to-path :refer :all]
            [kubernetes.specs.v1beta1/daemon-set-status :refer :all]
            [kubernetes.specs.v1/git-repo-volume-source :refer :all]
            [kubernetes.specs.v2beta1/resource-metric-source :refer :all]
            [kubernetes.specs.v1/node-system-info :refer :all]
            [kubernetes.specs.v1/config-map-list :refer :all]
            [kubernetes.specs.v1beta2/replica-set-list :refer :all]
            [kubernetes.specs.v1alpha1/initializer-configuration :refer :all]
            [kubernetes.specs.v1/http-get-action :refer :all]
            [kubernetes.specs.v1beta1/ingress-status :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-rollback :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-spec :refer :all]
            [kubernetes.specs.v1beta1/controller-revision :refer :all]
            [kubernetes.specs.v1/replication-controller-list :refer :all]
            [kubernetes.specs.v1beta1/subject-rules-review-status :refer :all]
            [kubernetes.specs.v1beta1/controller-revision-list :refer :all]
            [kubernetes.specs.v2beta1/resource-metric-status :refer :all]
            [kubernetes.specs.apps/v1beta1/rolling-update-deployment :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-status :refer :all]
            [kubernetes.specs.v1/weighted-pod-affinity-term :refer :all]
            [kubernetes.specs.v1beta2/daemon-set :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-condition :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-list :refer :all]
            [kubernetes.specs.v1/job :refer :all]
            [kubernetes.specs.v1/secret-volume-source :refer :all]
            [kubernetes.specs.v1/server-address-by-client-cidr :refer :all]
            [kubernetes.specs.v1/node-daemon-endpoints :refer :all]
            [kubernetes.specs.v1alpha1/admission-hook-client-config :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition :refer :all]
            [kubernetes.specs.v1/pod-security-context :refer :all]
            [kubernetes.specs.v1/affinity :refer :all]
            [kubernetes.specs.v2beta1/metric-status :refer :all]
            [kubernetes.specs.v1beta1/ingress-tls :refer :all]
            [kubernetes.specs.v1/empty-dir-volume-source :refer :all]
            [kubernetes.specs.v1/fc-volume-source :refer :all]
            [kubernetes.specs.v1/resource-quota-list :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            [kubernetes.specs.v1/api-resource-list :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler-status :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props-or-array :refer :all]
            [kubernetes.specs.v1/component-status :refer :all]
            [kubernetes.specs.v1beta1/cron-job-spec :refer :all]
            [kubernetes.specs.v1/subject-access-review :refer :all]
            [kubernetes.specs.v1/config-map-volume-source :refer :all]
            [kubernetes.specs.v1/secret-key-selector :refer :all]
            [kubernetes.specs.v1/tcp-socket-action :refer :all]
            [kubernetes.specs.v1/label-selector-requirement :refer :all]
            [kubernetes.specs.v1alpha1/initializer :refer :all]
            [kubernetes.specs.v1/storage-class-list :refer :all]
            [kubernetes.specs.v1/status-cause :refer :all]
            [kubernetes.specs.v1beta1/non-resource-rule :refer :all]
            [kubernetes.specs.v1/cluster-role :refer :all]
            [kubernetes.specs.v1/persistent-volume-status :refer :all]
            [kubernetes.specs.v1/host-alias :refer :all]
            [kubernetes.specs.v1/client-ip-config :refer :all]
            [kubernetes.specs.v1/volume-projection :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-spec :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-list :refer :all]
            [kubernetes.specs.v1beta1/replica-set-spec :refer :all]
            [kubernetes.specs.v1beta2/replica-set :refer :all]
            [kubernetes.specs.v1beta1/replica-set :refer :all]
            [kubernetes.specs.v1/subject-access-review-status :refer :all]
            [kubernetes.specs.v1/namespace-status :refer :all]
            [kubernetes.specs.v1/policy-rule :refer :all]
            [kubernetes.specs.v1beta2/deployment-spec :refer :all]
            [kubernetes.specs.v1/aws-elastic-block-store-volume-source :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-status :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-list :refer :all]
            [kubernetes.specs.v1/local-volume-source :refer :all]
            [kubernetes.specs.v1beta1/stateful-set :refer :all]
            [kubernetes.specs.v1beta1/cluster-role-binding :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-list :refer :all]
            [kubernetes.specs.v1beta1/role-list :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim :refer :all]
            [kubernetes.specs.v2alpha1/job-template-spec :refer :all]
            [kubernetes.specs.v1beta1/role-binding-list :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment :refer :all]
            [kubernetes.specs.v2alpha1/cron-job :refer :all]
            [kubernetes.specs.v1/replication-controller :refer :all]
            [kubernetes.specs.v1beta1/pod-security-policy-list :refer :all]
            [kubernetes.specs.v2beta1/metric-spec :refer :all]
            [kubernetes.specs.v1/endpoint-subset :refer :all]
            [kubernetes.specs.v1beta1/role-ref :refer :all]
            [kubernetes.specs.v1/glusterfs-volume-source :refer :all]
            [kubernetes.specs.v1beta1/network-policy-list :refer :all]
            [kubernetes.specs.v1/network-policy-spec :refer :all]
            [kubernetes.specs.v1/resource-requirements :refer :all]
            [kubernetes.specs.apps/v1beta1/scale-status :refer :all]
            [kubernetes.specs.v1/storage-os-persistent-volume-source :refer :all]
            [kubernetes.specs.v1beta1/run-as-user-strategy-options :refer :all]
            [kubernetes.specs.v1beta2/daemon-set-spec :refer :all]
            [kubernetes.specs.v1/ceph-fs-volume-source :refer :all]
            [kubernetes.specs.v1/volume :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-status :refer :all]
            [kubernetes.specs.v1beta1/replica-set-list :refer :all]
            [kubernetes.specs.v1beta1/storage-class :refer :all]
            [kubernetes.specs.v1beta1/network-policy-port :refer :all]
            [kubernetes.specs.v1alpha1/role-binding-list :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-status :refer :all]
            [kubernetes.specs.v1/subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/api-versions :refer :all]
            [kubernetes.specs.v1/replication-controller-spec :refer :all]
            [kubernetes.specs.v1beta1/network-policy :refer :all]
            [kubernetes.specs.v1/container-port :refer :all]
            [kubernetes.specs.v1/cluster-role-binding :refer :all]
            [kubernetes.specs.v1/config-map-key-selector :refer :all]
            [kubernetes.specs.v1beta1/json-schema-props :refer :all]
            [kubernetes.specs.v1/job-status :refer :all]
            [kubernetes.specs.v1/object-field-selector :refer :all]
            [kubernetes.specs.v1/node-condition :refer :all]
            [kubernetes.specs.v1/config-map-env-source :refer :all]
            [kubernetes.specs.v1beta1/custom-resource-definition-list :refer :all]
            [kubernetes.specs.v1beta1/supplemental-groups-strategy-options :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-spec :refer :all]
            [kubernetes.specs.v1/delete-options :refer :all]
            [kubernetes.specs.v1beta1/ingress-rule :refer :all]
            [kubernetes.specs.v1/attached-volume :refer :all]
            [kubernetes.specs.v1/pod-affinity-term :refer :all]
            [kubernetes.specs.v1beta1/self-subject-rules-review :refer :all]
            [kubernetes.specs.v1alpha1/role-binding :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role-binding :refer :all]
            [kubernetes.specs.v1/role :refer :all]
            [kubernetes.specs.extensions/v1beta1/scale-status :refer :all]
            [kubernetes.specs.v1beta2/replica-set-condition :refer :all]
            [kubernetes.specs.v1/endpoints-list :refer :all]
            [kubernetes.specs.v1beta2/scale :refer :all]
            [kubernetes.specs.v1alpha1/role :refer :all]
            [kubernetes.specs.v1/security-context :refer :all]
            [kubernetes.specs.v1beta2/controller-revision :refer :all]
            [kubernetes.specs.v1beta2/deployment-list :refer :all]
            [kubernetes.specs.v1beta1/cron-job-status :refer :all]
            [kubernetes.specs.v2alpha1/cron-job-spec :refer :all]
            [kubernetes.specs.v1/group-version-for-discovery :refer :all]
            [kubernetes.specs.v1/endpoint-port :refer :all]
            [kubernetes.specs.v1/nfs-volume-source :refer :all]
            [kubernetes.specs.v1alpha1/initializer-configuration-list :refer :all]
            [kubernetes.specs.v1/self-subject-rules-review-spec :refer :all]
            [kubernetes.specs.v1/job-condition :refer :all]
            [kubernetes.specs.v1beta1/token-review-status :refer :all]
            [kubernetes.specs.runtime/raw-extension :refer :all]
            [kubernetes.specs.v1/initializer :refer :all]
            [kubernetes.specs.v1/node-selector-requirement :refer :all]
            [kubernetes.specs.v1/env-from-source :refer :all]
            [kubernetes.specs.v1/ceph-fs-persistent-volume-source :refer :all]
            [kubernetes.specs.v1/node-affinity :refer :all]
            [kubernetes.specs.v1beta1/policy-rule :refer :all]
            [kubernetes.specs.v1/token-review-status :refer :all]
            [kubernetes.specs.v1/event-list :refer :all]
            [kubernetes.specs.v1/resource-rule :refer :all]
            [kubernetes.specs.v1/service-account-list :refer :all]
            [kubernetes.specs.v1/event-source :refer :all]
            [kubernetes.specs.v1/status-details :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-condition :refer :all]
            [kubernetes.specs.v1beta1/user-info :refer :all]
            [kubernetes.specs.v1/cluster-role-binding-list :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-status :refer :all]
            [kubernetes.specs.v1/role-list :refer :all]
            [kubernetes.specs.v1/component-status-list :refer :all]
            [kubernetes.specs.v1alpha1/cluster-role :refer :all]
            [kubernetes.specs.v1/probe :refer :all]
            [kubernetes.specs.v1/container-state-running :refer :all]
            [kubernetes.specs.v1/load-balancer-status :refer :all]
            [kubernetes.specs.v1alpha1/priority-class-list :refer :all]
            [kubernetes.specs.v1/host-path-volume-source :refer :all]
            [kubernetes.specs.v1beta2/scale-status :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-volume-source :refer :all]
            [kubernetes.specs.v1/role-binding-list :refer :all]
            [kubernetes.specs.v1/pod-list :refer :all]
            [kubernetes.specs.v2beta1/horizontal-pod-autoscaler-condition :refer :all]
            [kubernetes.specs.v1/horizontal-pod-autoscaler :refer :all]
            [kubernetes.specs.v1beta2/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.v1/portworx-volume-source :refer :all]
            [kubernetes.specs.v1/secret-projection :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-condition :refer :all]
            [kubernetes.specs.v1beta1/self-subject-access-review :refer :all]
            [kubernetes.specs.apps/v1beta1/deployment-list :refer :all]
            [kubernetes.specs.v1beta1/subject :refer :all]
            [kubernetes.specs.v1/secret-env-source :refer :all]
            [kubernetes.specs.v1beta2/deployment-strategy :refer :all]
            [kubernetes.specs.v1beta1/certificate-signing-request :refer :all]
            [kubernetes.specs.v1beta1/external-documentation :refer :all]
            [kubernetes.specs.v1/downward-api-projection :refer :all]
            [kubernetes.specs.v1beta1/pod-security-policy-spec :refer :all]
            [kubernetes.specs.v2beta1/pods-metric-status :refer :all]
            [kubernetes.specs.v1/role-ref :refer :all]
            [kubernetes.specs.v1beta1/role-binding :refer :all]
            [kubernetes.specs.v1beta1/token-review :refer :all]
            [kubernetes.specs.v1/network-policy-list :refer :all]
            [kubernetes.specs.v1/lifecycle :refer :all]
            [kubernetes.specs.v2beta1/object-metric-status :refer :all]
            [kubernetes.specs.v1beta1/rolling-update-daemon-set :refer :all]
            [kubernetes.specs.extensions/v1beta1/deployment-rollback :refer :all]
            [kubernetes.specs.v1/endpoint-address :refer :all]
            [kubernetes.specs.v1beta1/cron-job-list :refer :all]
            [kubernetes.specs.v1alpha1/pod-preset-spec :refer :all]
            [kubernetes.specs.v1beta1/subject-access-review-spec :refer :all]
            [kubernetes.specs.v1beta1/pod-security-policy :refer :all]
            [kubernetes.specs.v2beta1/pods-metric-source :refer :all]
            [kubernetes.specs.v1/owner-reference :refer :all]
            [kubernetes.specs.v1beta1/rolling-update-stateful-set-strategy :refer :all]
            [kubernetes.specs.v1beta2/deployment-status :refer :all]
            [kubernetes.specs.v1beta1/network-policy-peer :refer :all]
            [kubernetes.specs.v1beta1/network-policy-ingress-rule :refer :all]
            [kubernetes.specs.v1beta1/pod-disruption-budget-spec :refer :all]
            [kubernetes.specs.v1beta1/self-subject-access-review-spec :refer :all]
            [kubernetes.specs.v1/non-resource-rule :refer :all]
            [kubernetes.specs.v1/network-policy-port :refer :all]
            [kubernetes.specs.v1/persistent-volume-claim-list :refer :all]
            [kubernetes.specs.v1beta1/stateful-set-update-strategy :refer :all]
            [kubernetes.specs.v1alpha1/subject :refer :all]
            [kubernetes.specs.v1/flocker-volume-source :refer :all]
            [kubernetes.specs.v2beta1/object-metric-source :refer :all]
            [kubernetes.specs.v1beta2/stateful-set :refer :all]
            [kubernetes.specs.v1/ip-block :refer :all]
            [kubernetes.specs.v1alpha1/external-admission-hook :refer :all]
            [kubernetes.specs.v1alpha1/external-admission-hook-configuration-list :refer :all]
            )
  (:import (java.io File)))


(defn-spec create-cluster-role-with-http-info any?
  "
  create a ClusterRole"
  ([body v1/cluster-role, ] (create-cluster-role-with-http-info body nil))
  ([body v1/cluster-role, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-cluster-role v1/cluster-role-spec
  "
  create a ClusterRole"
  ([body v1/cluster-role, ] (create-cluster-role body nil))
  ([body v1/cluster-role, optional-params any?]
   (let [res (:data (create-cluster-role-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-spec res st/string-transformer)
        res))))


(defn-spec create-cluster-role-binding-with-http-info any?
  "
  create a ClusterRoleBinding"
  ([body v1/cluster-role-binding, ] (create-cluster-role-binding-with-http-info body nil))
  ([body v1/cluster-role-binding, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-cluster-role-binding v1/cluster-role-binding-spec
  "
  create a ClusterRoleBinding"
  ([body v1/cluster-role-binding, ] (create-cluster-role-binding body nil))
  ([body v1/cluster-role-binding, optional-params any?]
   (let [res (:data (create-cluster-role-binding-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-binding-spec res st/string-transformer)
        res))))


(defn-spec create-namespaced-role-with-http-info any?
  "
  create a Role"
  ([namespace string?, body v1/role, ] (create-namespaced-role-with-http-info namespace body nil))
  ([namespace string?, body v1/role, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-role v1/role-spec
  "
  create a Role"
  ([namespace string?, body v1/role, ] (create-namespaced-role namespace body nil))
  ([namespace string?, body v1/role, optional-params any?]
   (let [res (:data (create-namespaced-role-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-spec res st/string-transformer)
        res))))


(defn-spec create-namespaced-role-binding-with-http-info any?
  "
  create a RoleBinding"
  ([namespace string?, body v1/role-binding, ] (create-namespaced-role-binding-with-http-info namespace body nil))
  ([namespace string?, body v1/role-binding, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-role-binding v1/role-binding-spec
  "
  create a RoleBinding"
  ([namespace string?, body v1/role-binding, ] (create-namespaced-role-binding namespace body nil))
  ([namespace string?, body v1/role-binding, optional-params any?]
   (let [res (:data (create-namespaced-role-binding-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-spec res st/string-transformer)
        res))))


(defn-spec delete-cluster-role-with-http-info any?
  "
  delete a ClusterRole"
  ([name string?, body v1/delete-options, ] (delete-cluster-role-with-http-info name body nil))
  ([name string?, body v1/delete-options, {:keys [pretty gracePeriodSeconds orphanDependents propagationPolicy]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-cluster-role v1/status-spec
  "
  delete a ClusterRole"
  ([name string?, body v1/delete-options, ] (delete-cluster-role name body nil))
  ([name string?, body v1/delete-options, optional-params any?]
   (let [res (:data (delete-cluster-role-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-cluster-role-binding-with-http-info any?
  "
  delete a ClusterRoleBinding"
  ([name string?, body v1/delete-options, ] (delete-cluster-role-binding-with-http-info name body nil))
  ([name string?, body v1/delete-options, {:keys [pretty gracePeriodSeconds orphanDependents propagationPolicy]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-cluster-role-binding v1/status-spec
  "
  delete a ClusterRoleBinding"
  ([name string?, body v1/delete-options, ] (delete-cluster-role-binding name body nil))
  ([name string?, body v1/delete-options, optional-params any?]
   (let [res (:data (delete-cluster-role-binding-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-collection-cluster-role-with-http-info any?
  "
  delete collection of ClusterRole"
  ([] (delete-collection-cluster-role-with-http-info nil))
  ([{:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-cluster-role v1/status-spec
  "
  delete collection of ClusterRole"
  ([] (delete-collection-cluster-role nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-cluster-role-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-collection-cluster-role-binding-with-http-info any?
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-collection-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-cluster-role-binding v1/status-spec
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-collection-cluster-role-binding nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-cluster-role-binding-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-role-with-http-info any?
  "
  delete collection of Role"
  ([namespace string?, ] (delete-collection-namespaced-role-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-role v1/status-spec
  "
  delete collection of Role"
  ([namespace string?, ] (delete-collection-namespaced-role namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-role-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-role-binding-with-http-info any?
  "
  delete collection of RoleBinding"
  ([namespace string?, ] (delete-collection-namespaced-role-binding-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-role-binding v1/status-spec
  "
  delete collection of RoleBinding"
  ([namespace string?, ] (delete-collection-namespaced-role-binding namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-role-binding-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-namespaced-role-with-http-info any?
  "
  delete a Role"
  ([name string?, namespace string?, body v1/delete-options, ] (delete-namespaced-role-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1/delete-options, {:keys [pretty gracePeriodSeconds orphanDependents propagationPolicy]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-role v1/status-spec
  "
  delete a Role"
  ([name string?, namespace string?, body v1/delete-options, ] (delete-namespaced-role name namespace body nil))
  ([name string?, namespace string?, body v1/delete-options, optional-params any?]
   (let [res (:data (delete-namespaced-role-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec delete-namespaced-role-binding-with-http-info any?
  "
  delete a RoleBinding"
  ([name string?, namespace string?, body v1/delete-options, ] (delete-namespaced-role-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1/delete-options, {:keys [pretty gracePeriodSeconds orphanDependents propagationPolicy]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-role-binding v1/status-spec
  "
  delete a RoleBinding"
  ([name string?, namespace string?, body v1/delete-options, ] (delete-namespaced-role-binding name namespace body nil))
  ([name string?, namespace string?, body v1/delete-options, optional-params any?]
   (let [res (:data (delete-namespaced-role-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/status-spec res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/rbac.authorization.k8s.io/v1/" :get
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


(defn-spec list-cluster-role-with-http-info any?
  "
  list or watch objects of kind ClusterRole"
  ([] (list-cluster-role-with-http-info nil))
  ([{:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cluster-role v1/cluster-role-list-spec
  "
  list or watch objects of kind ClusterRole"
  ([] (list-cluster-role nil))
  ([optional-params any?]
   (let [res (:data (list-cluster-role-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-list-spec res st/string-transformer)
        res))))


(defn-spec list-cluster-role-binding-with-http-info any?
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cluster-role-binding v1/cluster-role-binding-list-spec
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-cluster-role-binding nil))
  ([optional-params any?]
   (let [res (:data (list-cluster-role-binding-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-binding-list-spec res st/string-transformer)
        res))))


(defn-spec list-namespaced-role-with-http-info any?
  "
  list or watch objects of kind Role"
  ([namespace string?, ] (list-namespaced-role-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-role v1/role-list-spec
  "
  list or watch objects of kind Role"
  ([namespace string?, ] (list-namespaced-role namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-role-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-list-spec res st/string-transformer)
        res))))


(defn-spec list-namespaced-role-binding-with-http-info any?
  "
  list or watch objects of kind RoleBinding"
  ([namespace string?, ] (list-namespaced-role-binding-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty continue fieldSelector includeUninitialized labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-role-binding v1/role-binding-list-spec
  "
  list or watch objects of kind RoleBinding"
  ([namespace string?, ] (list-namespaced-role-binding namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-role-binding-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-list-spec res st/string-transformer)
        res))))


(defn-spec list-role-binding-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind RoleBinding"
  ([] (list-role-binding-for-all-namespaces-with-http-info nil))
  ([{:keys [continue fieldSelector includeUninitialized labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/rolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-role-binding-for-all-namespaces v1/role-binding-list-spec
  "
  list or watch objects of kind RoleBinding"
  ([] (list-role-binding-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-role-binding-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-list-spec res st/string-transformer)
        res))))


(defn-spec list-role-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Role"
  ([] (list-role-for-all-namespaces-with-http-info nil))
  ([{:keys [continue fieldSelector includeUninitialized labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" fieldSelector "includeUninitialized" includeUninitialized "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-role-for-all-namespaces v1/role-list-spec
  "
  list or watch objects of kind Role"
  ([] (list-role-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-role-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-list-spec res st/string-transformer)
        res))))


(defn-spec patch-cluster-role-with-http-info any?
  "
  partially update the specified ClusterRole"
  ([name string?, body any?, ] (patch-cluster-role-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-cluster-role v1/cluster-role-spec
  "
  partially update the specified ClusterRole"
  ([name string?, body any?, ] (patch-cluster-role name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-cluster-role-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-spec res st/string-transformer)
        res))))


(defn-spec patch-cluster-role-binding-with-http-info any?
  "
  partially update the specified ClusterRoleBinding"
  ([name string?, body any?, ] (patch-cluster-role-binding-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-cluster-role-binding v1/cluster-role-binding-spec
  "
  partially update the specified ClusterRoleBinding"
  ([name string?, body any?, ] (patch-cluster-role-binding name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-cluster-role-binding-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-binding-spec res st/string-transformer)
        res))))


(defn-spec patch-namespaced-role-with-http-info any?
  "
  partially update the specified Role"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-role v1/role-spec
  "
  partially update the specified Role"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-role-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-spec res st/string-transformer)
        res))))


(defn-spec patch-namespaced-role-binding-with-http-info any?
  "
  partially update the specified RoleBinding"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-role-binding v1/role-binding-spec
  "
  partially update the specified RoleBinding"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-binding name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-role-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-spec res st/string-transformer)
        res))))


(defn-spec read-cluster-role-with-http-info any?
  "
  read the specified ClusterRole"
  ([name string?, ] (read-cluster-role-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-cluster-role v1/cluster-role-spec
  "
  read the specified ClusterRole"
  ([name string?, ] (read-cluster-role name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-cluster-role-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-spec res st/string-transformer)
        res))))


(defn-spec read-cluster-role-binding-with-http-info any?
  "
  read the specified ClusterRoleBinding"
  ([name string?, ] (read-cluster-role-binding-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-cluster-role-binding v1/cluster-role-binding-spec
  "
  read the specified ClusterRoleBinding"
  ([name string?, ] (read-cluster-role-binding name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-cluster-role-binding-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-binding-spec res st/string-transformer)
        res))))


(defn-spec read-namespaced-role-with-http-info any?
  "
  read the specified Role"
  ([name string?, namespace string?, ] (read-namespaced-role-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-role v1/role-spec
  "
  read the specified Role"
  ([name string?, namespace string?, ] (read-namespaced-role name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-role-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-spec res st/string-transformer)
        res))))


(defn-spec read-namespaced-role-binding-with-http-info any?
  "
  read the specified RoleBinding"
  ([name string?, namespace string?, ] (read-namespaced-role-binding-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-role-binding v1/role-binding-spec
  "
  read the specified RoleBinding"
  ([name string?, namespace string?, ] (read-namespaced-role-binding name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-role-binding-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-spec res st/string-transformer)
        res))))


(defn-spec replace-cluster-role-with-http-info any?
  "
  replace the specified ClusterRole"
  ([name string?, body v1/cluster-role, ] (replace-cluster-role-with-http-info name body nil))
  ([name string?, body v1/cluster-role, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-cluster-role v1/cluster-role-spec
  "
  replace the specified ClusterRole"
  ([name string?, body v1/cluster-role, ] (replace-cluster-role name body nil))
  ([name string?, body v1/cluster-role, optional-params any?]
   (let [res (:data (replace-cluster-role-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-spec res st/string-transformer)
        res))))


(defn-spec replace-cluster-role-binding-with-http-info any?
  "
  replace the specified ClusterRoleBinding"
  ([name string?, body v1/cluster-role-binding, ] (replace-cluster-role-binding-with-http-info name body nil))
  ([name string?, body v1/cluster-role-binding, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-cluster-role-binding v1/cluster-role-binding-spec
  "
  replace the specified ClusterRoleBinding"
  ([name string?, body v1/cluster-role-binding, ] (replace-cluster-role-binding name body nil))
  ([name string?, body v1/cluster-role-binding, optional-params any?]
   (let [res (:data (replace-cluster-role-binding-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/cluster-role-binding-spec res st/string-transformer)
        res))))


(defn-spec replace-namespaced-role-with-http-info any?
  "
  replace the specified Role"
  ([name string?, namespace string?, body v1/role, ] (replace-namespaced-role-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1/role, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-role v1/role-spec
  "
  replace the specified Role"
  ([name string?, namespace string?, body v1/role, ] (replace-namespaced-role name namespace body nil))
  ([name string?, namespace string?, body v1/role, optional-params any?]
   (let [res (:data (replace-namespaced-role-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-spec res st/string-transformer)
        res))))


(defn-spec replace-namespaced-role-binding-with-http-info any?
  "
  replace the specified RoleBinding"
  ([name string?, namespace string?, body v1/role-binding, ] (replace-namespaced-role-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1/role-binding, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-role-binding v1/role-binding-spec
  "
  replace the specified RoleBinding"
  ([name string?, namespace string?, body v1/role-binding, ] (replace-namespaced-role-binding name namespace body nil))
  ([name string?, namespace string?, body v1/role-binding, optional-params any?]
   (let [res (:data (replace-namespaced-role-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1/role-binding-spec res st/string-transformer)
        res))))


