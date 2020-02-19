(ns clojure-kubernetes-client.api.flowcontrol-apiserver-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-flow-schema :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-level-configuration :refer :all]
)
  (:import (java.io File)))


(defn-spec create-flow-schema-with-http-info any?
  "
  create a FlowSchema"
  ([body v1alpha1-flow-schema, ] (create-flow-schema-with-http-info body nil))
  ([body v1alpha1-flow-schema, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-flow-schema v1alpha1-flow-schema
  "
  create a FlowSchema"
  ([body v1alpha1-flow-schema, ] (create-flow-schema body nil))
  ([body v1alpha1-flow-schema, optional-params any?]
   (let [res (:data (create-flow-schema-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec create-priority-level-configuration-with-http-info any?
  "
  create a PriorityLevelConfiguration"
  ([body v1alpha1-priority-level-configuration, ] (create-priority-level-configuration-with-http-info body nil))
  ([body v1alpha1-priority-level-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-priority-level-configuration v1alpha1-priority-level-configuration
  "
  create a PriorityLevelConfiguration"
  ([body v1alpha1-priority-level-configuration, ] (create-priority-level-configuration body nil))
  ([body v1alpha1-priority-level-configuration, optional-params any?]
   (let [res (:data (create-priority-level-configuration-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec delete-collection-flow-schema-with-http-info any?
  "
  delete collection of FlowSchema"
  ([] (delete-collection-flow-schema-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-flow-schema v1-status
  "
  delete collection of FlowSchema"
  ([] (delete-collection-flow-schema nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-flow-schema-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-priority-level-configuration-with-http-info any?
  "
  delete collection of PriorityLevelConfiguration"
  ([] (delete-collection-priority-level-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-priority-level-configuration v1-status
  "
  delete collection of PriorityLevelConfiguration"
  ([] (delete-collection-priority-level-configuration nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-priority-level-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-flow-schema-with-http-info any?
  "
  delete a FlowSchema"
  ([name string?, ] (delete-flow-schema-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-flow-schema v1-status
  "
  delete a FlowSchema"
  ([name string?, ] (delete-flow-schema name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-flow-schema-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-priority-level-configuration-with-http-info any?
  "
  delete a PriorityLevelConfiguration"
  ([name string?, ] (delete-priority-level-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-priority-level-configuration v1-status
  "
  delete a PriorityLevelConfiguration"
  ([name string?, ] (delete-priority-level-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-priority-level-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/" :get
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


(defn-spec list-flow-schema-with-http-info any?
  "
  list or watch objects of kind FlowSchema"
  ([] (list-flow-schema-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-flow-schema v1alpha1-flow-schema-list
  "
  list or watch objects of kind FlowSchema"
  ([] (list-flow-schema nil))
  ([optional-params any?]
   (let [res (:data (list-flow-schema-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema-list res st/string-transformer)
        res))))


(defn-spec list-priority-level-configuration-with-http-info any?
  "
  list or watch objects of kind PriorityLevelConfiguration"
  ([] (list-priority-level-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-priority-level-configuration v1alpha1-priority-level-configuration-list
  "
  list or watch objects of kind PriorityLevelConfiguration"
  ([] (list-priority-level-configuration nil))
  ([optional-params any?]
   (let [res (:data (list-priority-level-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration-list res st/string-transformer)
        res))))


(defn-spec patch-flow-schema-with-http-info any?
  "
  partially update the specified FlowSchema"
  ([name string?, body any?, ] (patch-flow-schema-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-flow-schema v1alpha1-flow-schema
  "
  partially update the specified FlowSchema"
  ([name string?, body any?, ] (patch-flow-schema name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-flow-schema-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec patch-flow-schema-status-with-http-info any?
  "
  partially update status of the specified FlowSchema"
  ([name string?, body any?, ] (patch-flow-schema-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-flow-schema-status v1alpha1-flow-schema
  "
  partially update status of the specified FlowSchema"
  ([name string?, body any?, ] (patch-flow-schema-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-flow-schema-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec patch-priority-level-configuration-with-http-info any?
  "
  partially update the specified PriorityLevelConfiguration"
  ([name string?, body any?, ] (patch-priority-level-configuration-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-priority-level-configuration v1alpha1-priority-level-configuration
  "
  partially update the specified PriorityLevelConfiguration"
  ([name string?, body any?, ] (patch-priority-level-configuration name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-priority-level-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec patch-priority-level-configuration-status-with-http-info any?
  "
  partially update status of the specified PriorityLevelConfiguration"
  ([name string?, body any?, ] (patch-priority-level-configuration-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-priority-level-configuration-status v1alpha1-priority-level-configuration
  "
  partially update status of the specified PriorityLevelConfiguration"
  ([name string?, body any?, ] (patch-priority-level-configuration-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-priority-level-configuration-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec read-flow-schema-with-http-info any?
  "
  read the specified FlowSchema"
  ([name string?, ] (read-flow-schema-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-flow-schema v1alpha1-flow-schema
  "
  read the specified FlowSchema"
  ([name string?, ] (read-flow-schema name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-flow-schema-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec read-flow-schema-status-with-http-info any?
  "
  read status of the specified FlowSchema"
  ([name string?, ] (read-flow-schema-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-flow-schema-status v1alpha1-flow-schema
  "
  read status of the specified FlowSchema"
  ([name string?, ] (read-flow-schema-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-flow-schema-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec read-priority-level-configuration-with-http-info any?
  "
  read the specified PriorityLevelConfiguration"
  ([name string?, ] (read-priority-level-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-priority-level-configuration v1alpha1-priority-level-configuration
  "
  read the specified PriorityLevelConfiguration"
  ([name string?, ] (read-priority-level-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-priority-level-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec read-priority-level-configuration-status-with-http-info any?
  "
  read status of the specified PriorityLevelConfiguration"
  ([name string?, ] (read-priority-level-configuration-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-priority-level-configuration-status v1alpha1-priority-level-configuration
  "
  read status of the specified PriorityLevelConfiguration"
  ([name string?, ] (read-priority-level-configuration-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-priority-level-configuration-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec replace-flow-schema-with-http-info any?
  "
  replace the specified FlowSchema"
  ([name string?, body v1alpha1-flow-schema, ] (replace-flow-schema-with-http-info name body nil))
  ([name string?, body v1alpha1-flow-schema, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-flow-schema v1alpha1-flow-schema
  "
  replace the specified FlowSchema"
  ([name string?, body v1alpha1-flow-schema, ] (replace-flow-schema name body nil))
  ([name string?, body v1alpha1-flow-schema, optional-params any?]
   (let [res (:data (replace-flow-schema-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec replace-flow-schema-status-with-http-info any?
  "
  replace status of the specified FlowSchema"
  ([name string?, body v1alpha1-flow-schema, ] (replace-flow-schema-status-with-http-info name body nil))
  ([name string?, body v1alpha1-flow-schema, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/flowschemas/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-flow-schema-status v1alpha1-flow-schema
  "
  replace status of the specified FlowSchema"
  ([name string?, body v1alpha1-flow-schema, ] (replace-flow-schema-status name body nil))
  ([name string?, body v1alpha1-flow-schema, optional-params any?]
   (let [res (:data (replace-flow-schema-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-flow-schema res st/string-transformer)
        res))))


(defn-spec replace-priority-level-configuration-with-http-info any?
  "
  replace the specified PriorityLevelConfiguration"
  ([name string?, body v1alpha1-priority-level-configuration, ] (replace-priority-level-configuration-with-http-info name body nil))
  ([name string?, body v1alpha1-priority-level-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-priority-level-configuration v1alpha1-priority-level-configuration
  "
  replace the specified PriorityLevelConfiguration"
  ([name string?, body v1alpha1-priority-level-configuration, ] (replace-priority-level-configuration name body nil))
  ([name string?, body v1alpha1-priority-level-configuration, optional-params any?]
   (let [res (:data (replace-priority-level-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


(defn-spec replace-priority-level-configuration-status-with-http-info any?
  "
  replace status of the specified PriorityLevelConfiguration"
  ([name string?, body v1alpha1-priority-level-configuration, ] (replace-priority-level-configuration-status-with-http-info name body nil))
  ([name string?, body v1alpha1-priority-level-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1alpha1/prioritylevelconfigurations/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-priority-level-configuration-status v1alpha1-priority-level-configuration
  "
  replace status of the specified PriorityLevelConfiguration"
  ([name string?, body v1alpha1-priority-level-configuration, ] (replace-priority-level-configuration-status name body nil))
  ([name string?, body v1alpha1-priority-level-configuration, optional-params any?]
   (let [res (:data (replace-priority-level-configuration-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-level-configuration res st/string-transformer)
        res))))


