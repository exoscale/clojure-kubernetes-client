(ns clojure-kubernetes-client.api.apiextensions-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [clojure-kubernetes-client.specs.v1-deployment-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-error :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-version :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-audit-sink-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-subject-access-review-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-mutating-webhook-configuration :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-status :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-list :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-status :refer :all]
            [clojure-kubernetes-client.specs.v1-windows-security-context-options :refer :all]
            [clojure-kubernetes-client.specs.v1-lifecycle :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-status :refer :all]
            [clojure-kubernetes-client.specs.v1-server-address-by-client-cidr :refer :all]
            [clojure-kubernetes-client.specs.v1-glusterfs-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role-ref :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-mount :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-status :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-volume-source :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-tls :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-list :refer :all]
            [clojure-kubernetes-client.specs.v1-topology-selector-term :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1-http-get-action :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-node-driver :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-resource-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1-node-config-source :refer :all]
            [clojure-kubernetes-client.specs.v1-nfs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-node-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-access-review-status :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-list :refer :all]
            [clojure-kubernetes-client.specs.v1-container-image :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-status :refer :all]
            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-node-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-service-account-token-projection :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-target :refer :all]
            [clojure-kubernetes-client.specs.v1-lease :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-lease :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-csi-driver :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-pods-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-node-selector-requirement :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-rules-review-status :refer :all]
            [clojure-kubernetes-client.specs.v1-cluster-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-non-resource-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-topology-selector-label-requirement :refer :all]
            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.v1-rolling-update-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-overhead :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-scale-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cluster-role :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-node-resources :refer :all]
            [clojure-kubernetes-client.specs.v1-non-resource-attributes :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-validation :refer :all]
            [clojure-kubernetes-client.specs.v1-local-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-cluster-role-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cluster-role-binding :refer :all]
            [clojure-kubernetes-client.specs.v1-api-service :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-node-selector :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-tls :refer :all]
            [clojure-kubernetes-client.specs.v1-cluster-role-binding :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota-list :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-allowed-host-path :refer :all]
            [clojure-kubernetes-client.specs.v1-self-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-priority-class :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-policy-rules-with-subjects :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-mutating-webhook :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]
            [clojure-kubernetes-client.specs.v1-service-list :refer :all]
            [clojure-kubernetes-client.specs.v1-lease-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-projection :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-status :refer :all]
            [clojure-kubernetes-client.specs.v1-node-selector-term :refer :all]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-driver-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-event :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-subresource-scale :refer :all]
            [clojure-kubernetes-client.specs.v1-component-status-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-preconditions :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-user-subject :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.v1-api-group-list :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-node :refer :all]
            [clojure-kubernetes-client.specs.v1-node-status :refer :all]
            [clojure-kubernetes-client.specs.v1-node-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-validating-webhook-configuration-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-replica-set-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-self-subject-rules-review :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-port :refer :all]
            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-condition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-flex-volume :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-status :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-security-context :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-self-subject-rules-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-list :refer :all]
            [clojure-kubernetes-client.specs.apiextensions-v1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cluster-role-list :refer :all]
            [clojure-kubernetes-client.specs.v1-container-port :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-pod-preset :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-value-status :refer :all]
            [clojure-kubernetes-client.specs.v1-probe :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]
            [clojure-kubernetes-client.specs.v1-api-service-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-external-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-conversion :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-column-definition :refer :all]
            [clojure-kubernetes-client.specs.v1-glusterfs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-role :refer :all]
            [clojure-kubernetes-client.specs.v1-rule-with-operations :refer :all]
            [clojure-kubernetes-client.specs.v1-load-balancer-ingress :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-projection :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-list :refer :all]
            [clojure-kubernetes-client.specs.v1-fc-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-external-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-egress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-photon-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-scope-selector :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment :refer :all]
            [clojure-kubernetes-client.specs.v1-service-port :refer :all]
            [clojure-kubernetes-client.specs.v1-flex-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-object-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1-tcp-socket-action :refer :all]
            [clojure-kubernetes-client.specs.v1-toleration :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-spec :refer :all]
            [clojure-kubernetes-client.specs.apiextensions-v1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint :refer :all]
            [clojure-kubernetes-client.specs.apiregistration-v1beta1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-runtime-class :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-identifier :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-list :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-node-config-source :refer :all]
            [clojure-kubernetes-client.specs.v1-object-field-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-watch-event :refer :all]
            [clojure-kubernetes-client.specs.v1-client-ip-config :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-audit-sink-list :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-supplemental-groups-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment-status :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-run-as-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-node-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-external-documentation :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-list :refer :all]
            [clojure-kubernetes-client.specs.v1-rolling-update-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-scale-status :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.admissionregistration-v1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-scoped-resource-selector-requirement :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state-running :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-status :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-storage-class :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-condition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-class :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-port :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-run-as-user-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-validating-webhook :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-key-selector :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-aggregation-rule :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-rollback :refer :all]
            [clojure-kubernetes-client.specs.v1-job :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-event-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-cluster-role :refer :all]
            [clojure-kubernetes-client.specs.v1-api-service-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-replica-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-address :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-node-list :refer :all]
            [clojure-kubernetes-client.specs.v1-external-documentation :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-id-range :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-version :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment-status :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-runtime-class-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-rolling-update-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-node-driver :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job-status :refer :all]
            [clojure-kubernetes-client.specs.v1-non-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.flowcontrol-v1alpha1-subject :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-rule-with-operations :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-status :refer :all]
            [clojure-kubernetes-client.specs.admissionregistration-v1beta1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-self-subject-rules-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-pod-preset-list :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-env-source :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-rule-value :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-rolling-update-stateful-set-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-scale-status :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-fs-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-token-request :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-egress-rule :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-external-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-node-config-status :refer :all]
            [clojure-kubernetes-client.specs.v1-host-alias :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-column-definition :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-rollback-config :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-downward-api-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-taint :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-status :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-status :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-api-service-list :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-condition :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-backend :refer :all]
            [clojure-kubernetes-client.specs.v1-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-condition :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-path :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-rolling-update-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-validating-webhook-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-conversion :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-runtime-class-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-list :refer :all]
            [clojure-kubernetes-client.specs.v1-host-path-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-security-context :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-runtime-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-resource-attributes :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role-binding :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-replica-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-token-review :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-resource-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1-empty-dir-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-conditions :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-subject :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-controller-revision :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state-terminated :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-validating-webhook :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-aggregation-rule :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-group-subject :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-job-template-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-resource-metric-status :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-host-port-range :refer :all]
            [clojure-kubernetes-client.specs.v1-mutating-webhook :refer :all]
            [clojure-kubernetes-client.specs.v1-subject-rules-review-status :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-external-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-event-series :refer :all]
            [clojure-kubernetes-client.specs.v1-git-repo-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-rbd-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-attached-volume :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-pods-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-condition :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-backend :refer :all]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-controller-revision-list :refer :all]
            [clojure-kubernetes-client.specs.v1-downward-api-volume-file :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-device :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-list :refer :all]
            [clojure-kubernetes-client.specs.v1-event-series :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1-replica-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-env-from-source :refer :all]
            [clojure-kubernetes-client.specs.v1-api-group :refer :all]
            [clojure-kubernetes-client.specs.v1-binding :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-readiness-gate :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-cinder-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-id-range :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler :refer :all]
            [clojure-kubernetes-client.specs.v1-api-service-condition :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-rollback-config :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-se-linux-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-local-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.v1-node-system-info :refer :all]
            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-flocker-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-subset :refer :all]
            [clojure-kubernetes-client.specs.v1-node-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-gce-persistent-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.v1-node-daemon-endpoints :refer :all]
            [clojure-kubernetes-client.specs.v1-cross-version-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-downward-api-projection :refer :all]
            [clojure-kubernetes-client.specs.v1-status-cause :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-io-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-role-ref :refer :all]
            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1-cluster-role :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role-list :refer :all]
            [clojure-kubernetes-client.specs.v1-exec-action :refer :all]
            [clojure-kubernetes-client.specs.v1-self-subject-rules-review :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-scale :refer :all]
            [clojure-kubernetes-client.specs.v1-env-var :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-replica-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy-list :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-node-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-overhead :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-preferred-scheduling-term :refer :all]
            [clojure-kubernetes-client.specs.v1-secret :refer :all]
            [clojure-kubernetes-client.specs.v1-self-subject-access-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-token-request-status :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-rolling-update-deployment :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-runtime-class-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-mutating-webhook-configuration-list :refer :all]
            [clojure-kubernetes-client.specs.rbac-v1alpha1-subject :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job-status :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1-node :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-status :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state-waiting :refer :all]
            [clojure-kubernetes-client.specs.v1-controller-revision :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-user-info :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-status :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-run-as-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-list :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-job-template-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-portworx-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-status-details :refer :all]
            [clojure-kubernetes-client.specs.v1-ip-block :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-volume-attachment-source :refer :all]
            [clojure-kubernetes-client.specs.v1-bound-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-storage-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-names :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-driver :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-scheduling :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-error :refer :all]
            [clojure-kubernetes-client.specs.v1-user-info :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]
            [clojure-kubernetes-client.specs.v1-local-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-pods-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-replica-set-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-cross-version-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-non-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.v1-delete-options :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-attributes :refer :all]
            [clojure-kubernetes-client.specs.v1-priority-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-job-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-env-source :refer :all]
            [clojure-kubernetes-client.specs.v1-job-condition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-distinguisher-method :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-allowed-csi-driver :refer :all]
            [clojure-kubernetes-client.specs.v1-component-condition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-pod-preset-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-service :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-dns-config :refer :all]
            [clojure-kubernetes-client.specs.v1-cinder-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.admissionregistration-v1beta1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-peer :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-eviction :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-json-schema-props :refer :all]
            [clojure-kubernetes-client.specs.v1-group-version-for-discovery :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-resource-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-ip :refer :all]
            [clojure-kubernetes-client.specs.v1-service-status :refer :all]
            [clojure-kubernetes-client.specs.v1-webhook-conversion :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-status :refer :all]
            [clojure-kubernetes-client.specs.v1-api-versions :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-list :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-rolling-update-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1-topology-spread-constraint :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-dns-config-option :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-runtime-class-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-priority-class :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-http-ingress-path :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-field-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-container-state :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-resource-metric-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role-binding :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-limit-response :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-non-resource-attributes :refer :all]
            [clojure-kubernetes-client.specs.v1-subject-access-review-spec :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-supplemental-groups-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-io-volume-source :refer :all]
            [clojure-kubernetes-client.specs.apiregistration-v1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-controller-revision-list :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-subresources :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-http-ingress-rule-value :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-projection :refer :all]
            [clojure-kubernetes-client.specs.v1-session-affinity-config :refer :all]
            [clojure-kubernetes-client.specs.v1-sysctl :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-lease-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1-managed-fields-entry :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-requirements :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cluster-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-queuing-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-policy-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-owner-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-rbd-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-event-list :refer :all]
            [clojure-kubernetes-client.specs.v1-key-to-path :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-object-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-self-subject-access-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-container-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-event-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-subresources :refer :all]
            [clojure-kubernetes-client.specs.v1-role-list :refer :all]
            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-metric-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-scale :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-object-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-limited-priority-level-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-ip-block :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-handler :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-cross-version-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-load-balancer-status :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-anti-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-env-var-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-names :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-rolling-update-stateful-set-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-status :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller-spec :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy-spec :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-allowed-flex-volume :refer :all]
            [clojure-kubernetes-client.specs.v1-quobyte-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-definition-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-config-map-key-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1-capabilities :refer :all]
            [clojure-kubernetes-client.specs.admissionregistration-v1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-metric-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-token-review :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-pods-metric-source :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-status :refer :all]
            [clojure-kubernetes-client.specs.v1-component-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-cluster-role-binding :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-event :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-rollback :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-run-as-user-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-aws-elastic-block-store-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-replica-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-controller-revision-list :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-aggregation-rule :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector-requirement :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-file-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-os-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-volume :refer :all]
            [clojure-kubernetes-client.specs.v1-horizontal-pod-autoscaler-list :refer :all]
            [clojure-kubernetes-client.specs.v1-flex-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-weighted-pod-affinity-term :refer :all]
            [clojure-kubernetes-client.specs.v1-ceph-fs-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]
            [clojure-kubernetes-client.specs.apiextensions-v1beta1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-node-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-resource-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-iscsi-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-cluster-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-endpoint :refer :all]
            [clojure-kubernetes-client.specs.v1-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-error :refer :all]
            [clojure-kubernetes-client.specs.v1-replica-set :refer :all]
            [clojure-kubernetes-client.specs.v1-token-review-status :refer :all]
            [clojure-kubernetes-client.specs.v1-service-account-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-priority-class-list :refer :all]
            [clojure-kubernetes-client.specs.v1-token-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-role-binding-list :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-replica-set :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-controller-revision :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-status :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-node-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-stateful-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-object-metric-status :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-update-strategy :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-fs-group-strategy-options :refer :all]
            [clojure-kubernetes-client.specs.v1-ephemeral-container :refer :all]
            [clojure-kubernetes-client.specs.v1-service-account :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-list :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-node-resources :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-deployment-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-lease-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-runtime-class :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set-spec :refer :all]
            [clojure-kubernetes-client.specs.version-info :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-validation :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-affinity-term :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-token-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-resource-quota-status :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-cron-job-spec :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-condition :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-replica-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-service-account-subject :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-scheduling :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-allowed-host-path :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoint-port :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-token-review-status :refer :all]
            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]
            [clojure-kubernetes-client.specs.v1-affinity :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-status :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-list :refer :all]
            [clojure-kubernetes-client.specs.v1-job-status :refer :all]
            [clojure-kubernetes-client.specs.v1-service-spec :refer :all]
            [clojure-kubernetes-client.specs.policy-v1beta1-host-port-range :refer :all]
            [clojure-kubernetes-client.specs.v1-ceph-fs-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-job-list :refer :all]
            [clojure-kubernetes-client.specs.v1-azure-file-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-replica-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-attachment :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-spec :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-webhook-throttle-config :refer :all]
            [clojure-kubernetes-client.specs.v1-lease-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-api-resource :refer :all]
            [clojure-kubernetes-client.specs.v1-container :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-cron-job-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-node-address :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range-item :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-daemon-set-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-iscsi-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration :refer :all]
            [clojure-kubernetes-client.specs.v1-cluster-role-list :refer :all]
            [clojure-kubernetes-client.specs.v1-deployment-condition :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-daemon-set-status :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-driver-list :refer :all]
            [clojure-kubernetes-client.specs.v1-http-header :refer :all]
            [clojure-kubernetes-client.specs.v1-rolling-update-stateful-set-strategy :refer :all]
            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-rolling-update-daemon-set :refer :all]
            [clojure-kubernetes-client.specs.v1beta2-daemon-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-custom-resource-subresource-scale :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-port :refer :all]
            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-strategy :refer :all]
            [clojure-kubernetes-client.specs.v1-pod :refer :all]
            [clojure-kubernetes-client.specs.v1-vsphere-virtual-disk-volume-source :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-status :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-webhook :refer :all]
            [clojure-kubernetes-client.specs.v1-projected-volume-source :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-token-request-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-network-policy-peer :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-class :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-role-ref :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-subject-access-review-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]
            [clojure-kubernetes-client.specs.v1-endpoints-list :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-policy :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice-list :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-csi-node :refer :all]
            [clojure-kubernetes-client.specs.v1-api-service-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-storage-os-persistent-volume-source :refer :all]
            [clojure-kubernetes-client.specs.apiextensions-v1beta1-webhook-client-config :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-self-subject-access-review :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy-list :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-se-linux-strategy-options :refer :all]
            )
  (:import (java.io File)))


(defn-spec create-custom-resource-definition-with-http-info any?
  "
  create a CustomResourceDefinition"
  ([body v1-custom-resource-definition, ] (create-custom-resource-definition-with-http-info body nil))
  ([body v1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-custom-resource-definition v1-custom-resource-definition
  "
  create a CustomResourceDefinition"
  ([body v1-custom-resource-definition, ] (create-custom-resource-definition body nil))
  ([body v1-custom-resource-definition, optional-params any?]
   (let [res (:data (create-custom-resource-definition-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec delete-collection-custom-resource-definition-with-http-info any?
  "
  delete collection of CustomResourceDefinition"
  ([] (delete-collection-custom-resource-definition-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-custom-resource-definition v1-status
  "
  delete collection of CustomResourceDefinition"
  ([] (delete-collection-custom-resource-definition nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-custom-resource-definition-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-custom-resource-definition-with-http-info any?
  "
  delete a CustomResourceDefinition"
  ([name string?, ] (delete-custom-resource-definition-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-custom-resource-definition v1-status
  "
  delete a CustomResourceDefinition"
  ([name string?, ] (delete-custom-resource-definition name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-custom-resource-definition-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/apiextensions.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-api-resources v1-api-resource-list
  "
  get available resources"
  []
  (let [res (:data (get-api-resources-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1-api-resource-list res st/string-transformer)
       res)))


(defn-spec list-custom-resource-definition-with-http-info any?
  "
  list or watch objects of kind CustomResourceDefinition"
  ([] (list-custom-resource-definition-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-custom-resource-definition v1-custom-resource-definition-list
  "
  list or watch objects of kind CustomResourceDefinition"
  ([] (list-custom-resource-definition nil))
  ([optional-params any?]
   (let [res (:data (list-custom-resource-definition-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition-list res st/string-transformer)
        res))))


(defn-spec patch-custom-resource-definition-with-http-info any?
  "
  partially update the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-custom-resource-definition v1-custom-resource-definition
  "
  partially update the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-custom-resource-definition-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec patch-custom-resource-definition-status-with-http-info any?
  "
  partially update status of the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-custom-resource-definition-status v1-custom-resource-definition
  "
  partially update status of the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-custom-resource-definition-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec read-custom-resource-definition-with-http-info any?
  "
  read the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-custom-resource-definition v1-custom-resource-definition
  "
  read the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-custom-resource-definition-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec read-custom-resource-definition-status-with-http-info any?
  "
  read status of the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-custom-resource-definition-status v1-custom-resource-definition
  "
  read status of the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-custom-resource-definition-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec replace-custom-resource-definition-with-http-info any?
  "
  replace the specified CustomResourceDefinition"
  ([name string?, body v1-custom-resource-definition, ] (replace-custom-resource-definition-with-http-info name body nil))
  ([name string?, body v1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-custom-resource-definition v1-custom-resource-definition
  "
  replace the specified CustomResourceDefinition"
  ([name string?, body v1-custom-resource-definition, ] (replace-custom-resource-definition name body nil))
  ([name string?, body v1-custom-resource-definition, optional-params any?]
   (let [res (:data (replace-custom-resource-definition-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec replace-custom-resource-definition-status-with-http-info any?
  "
  replace status of the specified CustomResourceDefinition"
  ([name string?, body v1-custom-resource-definition, ] (replace-custom-resource-definition-status-with-http-info name body nil))
  ([name string?, body v1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-custom-resource-definition-status v1-custom-resource-definition
  "
  replace status of the specified CustomResourceDefinition"
  ([name string?, body v1-custom-resource-definition, ] (replace-custom-resource-definition-status name body nil))
  ([name string?, body v1-custom-resource-definition, optional-params any?]
   (let [res (:data (replace-custom-resource-definition-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-custom-resource-definition res st/string-transformer)
        res))))


