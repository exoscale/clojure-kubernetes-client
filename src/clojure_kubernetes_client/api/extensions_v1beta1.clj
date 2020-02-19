(ns clojure-kubernetes-client.api.extensions-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set-list :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-list :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set-list :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment-list :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy-list :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-daemon-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-replica-set :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.extensions-v1beta1-pod-security-policy :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-daemon-set-with-http-info any?
  "
  create a DaemonSet"
  ([namespace string?, body v1beta1-daemon-set, ] (create-namespaced-daemon-set-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-daemon-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-daemon-set v1beta1-daemon-set
  "
  create a DaemonSet"
  ([namespace string?, body v1beta1-daemon-set, ] (create-namespaced-daemon-set namespace body nil))
  ([namespace string?, body v1beta1-daemon-set, optional-params any?]
   (let [res (:data (create-namespaced-daemon-set-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec create-namespaced-deployment-with-http-info any?
  "
  create a Deployment"
  ([namespace string?, body extensions-v1beta1-deployment, ] (create-namespaced-deployment-with-http-info namespace body nil))
  ([namespace string?, body extensions-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-deployment extensions-v1beta1-deployment
  "
  create a Deployment"
  ([namespace string?, body extensions-v1beta1-deployment, ] (create-namespaced-deployment namespace body nil))
  ([namespace string?, body extensions-v1beta1-deployment, optional-params any?]
   (let [res (:data (create-namespaced-deployment-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec create-namespaced-deployment-rollback-with-http-info any?
  "
  create rollback of a Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment-rollback, ] (create-namespaced-deployment-rollback-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment-rollback, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/rollback" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-deployment-rollback v1-status
  "
  create rollback of a Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment-rollback, ] (create-namespaced-deployment-rollback name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment-rollback, optional-params any?]
   (let [res (:data (create-namespaced-deployment-rollback-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec create-namespaced-ingress-with-http-info any?
  "
  create an Ingress"
  ([namespace string?, body extensions-v1beta1-ingress, ] (create-namespaced-ingress-with-http-info namespace body nil))
  ([namespace string?, body extensions-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-ingress extensions-v1beta1-ingress
  "
  create an Ingress"
  ([namespace string?, body extensions-v1beta1-ingress, ] (create-namespaced-ingress namespace body nil))
  ([namespace string?, body extensions-v1beta1-ingress, optional-params any?]
   (let [res (:data (create-namespaced-ingress-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec create-namespaced-network-policy-with-http-info any?
  "
  create a NetworkPolicy"
  ([namespace string?, body v1beta1-network-policy, ] (create-namespaced-network-policy-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-network-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-network-policy v1beta1-network-policy
  "
  create a NetworkPolicy"
  ([namespace string?, body v1beta1-network-policy, ] (create-namespaced-network-policy namespace body nil))
  ([namespace string?, body v1beta1-network-policy, optional-params any?]
   (let [res (:data (create-namespaced-network-policy-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy res st/string-transformer)
        res))))


(defn-spec create-namespaced-replica-set-with-http-info any?
  "
  create a ReplicaSet"
  ([namespace string?, body v1beta1-replica-set, ] (create-namespaced-replica-set-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-replica-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-replica-set v1beta1-replica-set
  "
  create a ReplicaSet"
  ([namespace string?, body v1beta1-replica-set, ] (create-namespaced-replica-set namespace body nil))
  ([namespace string?, body v1beta1-replica-set, optional-params any?]
   (let [res (:data (create-namespaced-replica-set-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec create-pod-security-policy-with-http-info any?
  "
  create a PodSecurityPolicy"
  ([body extensions-v1beta1-pod-security-policy, ] (create-pod-security-policy-with-http-info body nil))
  ([body extensions-v1beta1-pod-security-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-pod-security-policy extensions-v1beta1-pod-security-policy
  "
  create a PodSecurityPolicy"
  ([body extensions-v1beta1-pod-security-policy, ] (create-pod-security-policy body nil))
  ([body extensions-v1beta1-pod-security-policy, optional-params any?]
   (let [res (:data (create-pod-security-policy-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-daemon-set-with-http-info any?
  "
  delete collection of DaemonSet"
  ([namespace string?, ] (delete-collection-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-daemon-set v1-status
  "
  delete collection of DaemonSet"
  ([namespace string?, ] (delete-collection-namespaced-daemon-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-daemon-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-deployment-with-http-info any?
  "
  delete collection of Deployment"
  ([namespace string?, ] (delete-collection-namespaced-deployment-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-deployment v1-status
  "
  delete collection of Deployment"
  ([namespace string?, ] (delete-collection-namespaced-deployment namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-deployment-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-ingress-with-http-info any?
  "
  delete collection of Ingress"
  ([namespace string?, ] (delete-collection-namespaced-ingress-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-ingress v1-status
  "
  delete collection of Ingress"
  ([namespace string?, ] (delete-collection-namespaced-ingress namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-ingress-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-network-policy-with-http-info any?
  "
  delete collection of NetworkPolicy"
  ([namespace string?, ] (delete-collection-namespaced-network-policy-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-network-policy v1-status
  "
  delete collection of NetworkPolicy"
  ([namespace string?, ] (delete-collection-namespaced-network-policy namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-network-policy-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-replica-set-with-http-info any?
  "
  delete collection of ReplicaSet"
  ([namespace string?, ] (delete-collection-namespaced-replica-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-replica-set v1-status
  "
  delete collection of ReplicaSet"
  ([namespace string?, ] (delete-collection-namespaced-replica-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-replica-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-pod-security-policy-with-http-info any?
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-collection-pod-security-policy-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-pod-security-policy v1-status
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-collection-pod-security-policy nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-pod-security-policy-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-daemon-set-with-http-info any?
  "
  delete a DaemonSet"
  ([name string?, namespace string?, ] (delete-namespaced-daemon-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-daemon-set v1-status
  "
  delete a DaemonSet"
  ([name string?, namespace string?, ] (delete-namespaced-daemon-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-daemon-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-deployment-with-http-info any?
  "
  delete a Deployment"
  ([name string?, namespace string?, ] (delete-namespaced-deployment-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-deployment v1-status
  "
  delete a Deployment"
  ([name string?, namespace string?, ] (delete-namespaced-deployment name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-deployment-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-ingress-with-http-info any?
  "
  delete an Ingress"
  ([name string?, namespace string?, ] (delete-namespaced-ingress-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-ingress v1-status
  "
  delete an Ingress"
  ([name string?, namespace string?, ] (delete-namespaced-ingress name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-ingress-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-network-policy-with-http-info any?
  "
  delete a NetworkPolicy"
  ([name string?, namespace string?, ] (delete-namespaced-network-policy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-network-policy v1-status
  "
  delete a NetworkPolicy"
  ([name string?, namespace string?, ] (delete-namespaced-network-policy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-network-policy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-replica-set-with-http-info any?
  "
  delete a ReplicaSet"
  ([name string?, namespace string?, ] (delete-namespaced-replica-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-replica-set v1-status
  "
  delete a ReplicaSet"
  ([name string?, namespace string?, ] (delete-namespaced-replica-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-replica-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-pod-security-policy-with-http-info any?
  "
  delete a PodSecurityPolicy"
  ([name string?, ] (delete-pod-security-policy-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-pod-security-policy v1-status
  "
  delete a PodSecurityPolicy"
  ([name string?, ] (delete-pod-security-policy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-pod-security-policy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/extensions/v1beta1/" :get
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


(defn-spec list-daemon-set-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind DaemonSet"
  ([] (list-daemon-set-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/daemonsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-daemon-set-for-all-namespaces v1beta1-daemon-set-list
  "
  list or watch objects of kind DaemonSet"
  ([] (list-daemon-set-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-daemon-set-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set-list res st/string-transformer)
        res))))


(defn-spec list-deployment-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Deployment"
  ([] (list-deployment-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-deployment-for-all-namespaces extensions-v1beta1-deployment-list
  "
  list or watch objects of kind Deployment"
  ([] (list-deployment-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-deployment-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment-list res st/string-transformer)
        res))))


(defn-spec list-ingress-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Ingress"
  ([] (list-ingress-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-ingress-for-all-namespaces extensions-v1beta1-ingress-list
  "
  list or watch objects of kind Ingress"
  ([] (list-ingress-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-ingress-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-daemon-set-with-http-info any?
  "
  list or watch objects of kind DaemonSet"
  ([namespace string?, ] (list-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-daemon-set v1beta1-daemon-set-list
  "
  list or watch objects of kind DaemonSet"
  ([namespace string?, ] (list-namespaced-daemon-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-daemon-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-deployment-with-http-info any?
  "
  list or watch objects of kind Deployment"
  ([namespace string?, ] (list-namespaced-deployment-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-deployment extensions-v1beta1-deployment-list
  "
  list or watch objects of kind Deployment"
  ([namespace string?, ] (list-namespaced-deployment namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-deployment-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-ingress-with-http-info any?
  "
  list or watch objects of kind Ingress"
  ([namespace string?, ] (list-namespaced-ingress-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-ingress extensions-v1beta1-ingress-list
  "
  list or watch objects of kind Ingress"
  ([namespace string?, ] (list-namespaced-ingress namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-ingress-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-network-policy-with-http-info any?
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace string?, ] (list-namespaced-network-policy-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-network-policy v1beta1-network-policy-list
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace string?, ] (list-namespaced-network-policy namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-network-policy-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-replica-set-with-http-info any?
  "
  list or watch objects of kind ReplicaSet"
  ([namespace string?, ] (list-namespaced-replica-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-replica-set v1beta1-replica-set-list
  "
  list or watch objects of kind ReplicaSet"
  ([namespace string?, ] (list-namespaced-replica-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-replica-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set-list res st/string-transformer)
        res))))


(defn-spec list-network-policy-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-network-policy-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-network-policy-for-all-namespaces v1beta1-network-policy-list
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-network-policy-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-network-policy-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy-list res st/string-transformer)
        res))))


(defn-spec list-pod-security-policy-with-http-info any?
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-pod-security-policy-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-security-policy extensions-v1beta1-pod-security-policy-list
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-pod-security-policy nil))
  ([optional-params any?]
   (let [res (:data (list-pod-security-policy-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-pod-security-policy-list res st/string-transformer)
        res))))


(defn-spec list-replica-set-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-replica-set-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/extensions/v1beta1/replicasets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-replica-set-for-all-namespaces v1beta1-replica-set-list
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-replica-set-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-replica-set-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-daemon-set-with-http-info any?
  "
  partially update the specified DaemonSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-daemon-set v1beta1-daemon-set
  "
  partially update the specified DaemonSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-daemon-set name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-daemon-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec patch-namespaced-daemon-set-status-with-http-info any?
  "
  partially update status of the specified DaemonSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-daemon-set-status v1beta1-daemon-set
  "
  partially update status of the specified DaemonSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-daemon-set-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-daemon-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-with-http-info any?
  "
  partially update the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment extensions-v1beta1-deployment
  "
  partially update the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-scale-with-http-info any?
  "
  partially update scale of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment-scale extensions-v1beta1-scale
  "
  partially update scale of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-status-with-http-info any?
  "
  partially update status of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment-status extensions-v1beta1-deployment
  "
  partially update status of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec patch-namespaced-ingress-with-http-info any?
  "
  partially update the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-ingress extensions-v1beta1-ingress
  "
  partially update the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-ingress-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec patch-namespaced-ingress-status-with-http-info any?
  "
  partially update status of the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-ingress-status extensions-v1beta1-ingress
  "
  partially update status of the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-ingress-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec patch-namespaced-network-policy-with-http-info any?
  "
  partially update the specified NetworkPolicy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-network-policy-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-network-policy v1beta1-network-policy
  "
  partially update the specified NetworkPolicy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-network-policy name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-network-policy-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replica-set-with-http-info any?
  "
  partially update the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replica-set v1beta1-replica-set
  "
  partially update the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replica-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replica-set-scale-with-http-info any?
  "
  partially update scale of the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replica-set-scale extensions-v1beta1-scale
  "
  partially update scale of the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replica-set-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replica-set-status-with-http-info any?
  "
  partially update status of the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replica-set-status v1beta1-replica-set
  "
  partially update status of the specified ReplicaSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replica-set-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replica-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replication-controller-dummy-scale-with-http-info any?
  "
  partially update scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-dummy-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replication-controller-dummy-scale extensions-v1beta1-scale
  "
  partially update scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-dummy-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replication-controller-dummy-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec patch-pod-security-policy-with-http-info any?
  "
  partially update the specified PodSecurityPolicy"
  ([name string?, body any?, ] (patch-pod-security-policy-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-pod-security-policy extensions-v1beta1-pod-security-policy
  "
  partially update the specified PodSecurityPolicy"
  ([name string?, body any?, ] (patch-pod-security-policy name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-pod-security-policy-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec read-namespaced-daemon-set-with-http-info any?
  "
  read the specified DaemonSet"
  ([name string?, namespace string?, ] (read-namespaced-daemon-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-daemon-set v1beta1-daemon-set
  "
  read the specified DaemonSet"
  ([name string?, namespace string?, ] (read-namespaced-daemon-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-daemon-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-daemon-set-status-with-http-info any?
  "
  read status of the specified DaemonSet"
  ([name string?, namespace string?, ] (read-namespaced-daemon-set-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-daemon-set-status v1beta1-daemon-set
  "
  read status of the specified DaemonSet"
  ([name string?, namespace string?, ] (read-namespaced-daemon-set-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-daemon-set-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-with-http-info any?
  "
  read the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment extensions-v1beta1-deployment
  "
  read the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-scale-with-http-info any?
  "
  read scale of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment-scale extensions-v1beta1-scale
  "
  read scale of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-status-with-http-info any?
  "
  read status of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment-status extensions-v1beta1-deployment
  "
  read status of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec read-namespaced-ingress-with-http-info any?
  "
  read the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-ingress extensions-v1beta1-ingress
  "
  read the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-ingress-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec read-namespaced-ingress-status-with-http-info any?
  "
  read status of the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-ingress-status extensions-v1beta1-ingress
  "
  read status of the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-ingress-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec read-namespaced-network-policy-with-http-info any?
  "
  read the specified NetworkPolicy"
  ([name string?, namespace string?, ] (read-namespaced-network-policy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-network-policy v1beta1-network-policy
  "
  read the specified NetworkPolicy"
  ([name string?, namespace string?, ] (read-namespaced-network-policy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-network-policy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy res st/string-transformer)
        res))))


(defn-spec read-namespaced-replica-set-with-http-info any?
  "
  read the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replica-set v1beta1-replica-set
  "
  read the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replica-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-replica-set-scale-with-http-info any?
  "
  read scale of the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replica-set-scale extensions-v1beta1-scale
  "
  read scale of the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replica-set-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec read-namespaced-replica-set-status-with-http-info any?
  "
  read status of the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replica-set-status v1beta1-replica-set
  "
  read status of the specified ReplicaSet"
  ([name string?, namespace string?, ] (read-namespaced-replica-set-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replica-set-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-replication-controller-dummy-scale-with-http-info any?
  "
  read scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-dummy-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replication-controller-dummy-scale extensions-v1beta1-scale
  "
  read scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-dummy-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replication-controller-dummy-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec read-pod-security-policy-with-http-info any?
  "
  read the specified PodSecurityPolicy"
  ([name string?, ] (read-pod-security-policy-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-pod-security-policy extensions-v1beta1-pod-security-policy
  "
  read the specified PodSecurityPolicy"
  ([name string?, ] (read-pod-security-policy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-pod-security-policy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec replace-namespaced-daemon-set-with-http-info any?
  "
  replace the specified DaemonSet"
  ([name string?, namespace string?, body v1beta1-daemon-set, ] (replace-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-daemon-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-daemon-set v1beta1-daemon-set
  "
  replace the specified DaemonSet"
  ([name string?, namespace string?, body v1beta1-daemon-set, ] (replace-namespaced-daemon-set name namespace body nil))
  ([name string?, namespace string?, body v1beta1-daemon-set, optional-params any?]
   (let [res (:data (replace-namespaced-daemon-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-daemon-set-status-with-http-info any?
  "
  replace status of the specified DaemonSet"
  ([name string?, namespace string?, body v1beta1-daemon-set, ] (replace-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-daemon-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-daemon-set-status v1beta1-daemon-set
  "
  replace status of the specified DaemonSet"
  ([name string?, namespace string?, body v1beta1-daemon-set, ] (replace-namespaced-daemon-set-status name namespace body nil))
  ([name string?, namespace string?, body v1beta1-daemon-set, optional-params any?]
   (let [res (:data (replace-namespaced-daemon-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-daemon-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-with-http-info any?
  "
  replace the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment, ] (replace-namespaced-deployment-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment extensions-v1beta1-deployment
  "
  replace the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment, ] (replace-namespaced-deployment name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-scale-with-http-info any?
  "
  replace scale of the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment-scale extensions-v1beta1-scale
  "
  replace scale of the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-deployment-scale name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-status-with-http-info any?
  "
  replace status of the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment, ] (replace-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment-status extensions-v1beta1-deployment
  "
  replace status of the specified Deployment"
  ([name string?, namespace string?, body extensions-v1beta1-deployment, ] (replace-namespaced-deployment-status name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-deployment, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec replace-namespaced-ingress-with-http-info any?
  "
  replace the specified Ingress"
  ([name string?, namespace string?, body extensions-v1beta1-ingress, ] (replace-namespaced-ingress-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-ingress extensions-v1beta1-ingress
  "
  replace the specified Ingress"
  ([name string?, namespace string?, body extensions-v1beta1-ingress, ] (replace-namespaced-ingress name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-ingress, optional-params any?]
   (let [res (:data (replace-namespaced-ingress-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec replace-namespaced-ingress-status-with-http-info any?
  "
  replace status of the specified Ingress"
  ([name string?, namespace string?, body extensions-v1beta1-ingress, ] (replace-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-ingress-status extensions-v1beta1-ingress
  "
  replace status of the specified Ingress"
  ([name string?, namespace string?, body extensions-v1beta1-ingress, ] (replace-namespaced-ingress-status name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-ingress, optional-params any?]
   (let [res (:data (replace-namespaced-ingress-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec replace-namespaced-network-policy-with-http-info any?
  "
  replace the specified NetworkPolicy"
  ([name string?, namespace string?, body v1beta1-network-policy, ] (replace-namespaced-network-policy-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-network-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-network-policy v1beta1-network-policy
  "
  replace the specified NetworkPolicy"
  ([name string?, namespace string?, body v1beta1-network-policy, ] (replace-namespaced-network-policy name namespace body nil))
  ([name string?, namespace string?, body v1beta1-network-policy, optional-params any?]
   (let [res (:data (replace-namespaced-network-policy-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-network-policy res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replica-set-with-http-info any?
  "
  replace the specified ReplicaSet"
  ([name string?, namespace string?, body v1beta1-replica-set, ] (replace-namespaced-replica-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-replica-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replica-set v1beta1-replica-set
  "
  replace the specified ReplicaSet"
  ([name string?, namespace string?, body v1beta1-replica-set, ] (replace-namespaced-replica-set name namespace body nil))
  ([name string?, namespace string?, body v1beta1-replica-set, optional-params any?]
   (let [res (:data (replace-namespaced-replica-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replica-set-scale-with-http-info any?
  "
  replace scale of the specified ReplicaSet"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replica-set-scale extensions-v1beta1-scale
  "
  replace scale of the specified ReplicaSet"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-replica-set-scale name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-replica-set-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replica-set-status-with-http-info any?
  "
  replace status of the specified ReplicaSet"
  ([name string?, namespace string?, body v1beta1-replica-set, ] (replace-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-replica-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replica-set-status v1beta1-replica-set
  "
  replace status of the specified ReplicaSet"
  ([name string?, namespace string?, body v1beta1-replica-set, ] (replace-namespaced-replica-set-status name namespace body nil))
  ([name string?, namespace string?, body v1beta1-replica-set, optional-params any?]
   (let [res (:data (replace-namespaced-replica-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-replica-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replication-controller-dummy-scale-with-http-info any?
  "
  replace scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-replication-controller-dummy-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replication-controller-dummy-scale extensions-v1beta1-scale
  "
  replace scale of the specified ReplicationControllerDummy"
  ([name string?, namespace string?, body extensions-v1beta1-scale, ] (replace-namespaced-replication-controller-dummy-scale name namespace body nil))
  ([name string?, namespace string?, body extensions-v1beta1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-replication-controller-dummy-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec replace-pod-security-policy-with-http-info any?
  "
  replace the specified PodSecurityPolicy"
  ([name string?, body extensions-v1beta1-pod-security-policy, ] (replace-pod-security-policy-with-http-info name body nil))
  ([name string?, body extensions-v1beta1-pod-security-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-pod-security-policy extensions-v1beta1-pod-security-policy
  "
  replace the specified PodSecurityPolicy"
  ([name string?, body extensions-v1beta1-pod-security-policy, ] (replace-pod-security-policy name body nil))
  ([name string?, body extensions-v1beta1-pod-security-policy, optional-params any?]
   (let [res (:data (replace-pod-security-policy-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode extensions-v1beta1-pod-security-policy res st/string-transformer)
        res))))


