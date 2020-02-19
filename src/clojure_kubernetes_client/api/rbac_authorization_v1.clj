(ns clojure-kubernetes-client.api.rbac-authorization-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-cluster-role :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-role :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-list :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-binding-list :refer :all]

            [clojure-kubernetes-client.specs.v1-role-list :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding-list :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding-list :refer :all]

            [clojure-kubernetes-client.specs.v1-role-list :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-role :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-role :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role :refer :all]

            [clojure-kubernetes-client.specs.v1-cluster-role-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-role :refer :all]

            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]
)
  (:import (java.io File)))


(defn-spec create-cluster-role-with-http-info any?
  "
  create a ClusterRole"
  ([body v1-cluster-role, ] (create-cluster-role-with-http-info body nil))
  ([body v1-cluster-role, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-cluster-role v1-cluster-role
  "
  create a ClusterRole"
  ([body v1-cluster-role, ] (create-cluster-role body nil))
  ([body v1-cluster-role, optional-params any?]
   (let [res (:data (create-cluster-role-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role res st/string-transformer)
        res))))


(defn-spec create-cluster-role-binding-with-http-info any?
  "
  create a ClusterRoleBinding"
  ([body v1-cluster-role-binding, ] (create-cluster-role-binding-with-http-info body nil))
  ([body v1-cluster-role-binding, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-cluster-role-binding v1-cluster-role-binding
  "
  create a ClusterRoleBinding"
  ([body v1-cluster-role-binding, ] (create-cluster-role-binding body nil))
  ([body v1-cluster-role-binding, optional-params any?]
   (let [res (:data (create-cluster-role-binding-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-binding res st/string-transformer)
        res))))


(defn-spec create-namespaced-role-with-http-info any?
  "
  create a Role"
  ([namespace string?, body v1-role, ] (create-namespaced-role-with-http-info namespace body nil))
  ([namespace string?, body v1-role, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-role v1-role
  "
  create a Role"
  ([namespace string?, body v1-role, ] (create-namespaced-role namespace body nil))
  ([namespace string?, body v1-role, optional-params any?]
   (let [res (:data (create-namespaced-role-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role res st/string-transformer)
        res))))


(defn-spec create-namespaced-role-binding-with-http-info any?
  "
  create a RoleBinding"
  ([namespace string?, body v1-role-binding, ] (create-namespaced-role-binding-with-http-info namespace body nil))
  ([namespace string?, body v1-role-binding, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-role-binding v1-role-binding
  "
  create a RoleBinding"
  ([namespace string?, body v1-role-binding, ] (create-namespaced-role-binding namespace body nil))
  ([namespace string?, body v1-role-binding, optional-params any?]
   (let [res (:data (create-namespaced-role-binding-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding res st/string-transformer)
        res))))


(defn-spec delete-cluster-role-with-http-info any?
  "
  delete a ClusterRole"
  ([name string?, ] (delete-cluster-role-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-cluster-role v1-status
  "
  delete a ClusterRole"
  ([name string?, ] (delete-cluster-role name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-cluster-role-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-cluster-role-binding-with-http-info any?
  "
  delete a ClusterRoleBinding"
  ([name string?, ] (delete-cluster-role-binding-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-cluster-role-binding v1-status
  "
  delete a ClusterRoleBinding"
  ([name string?, ] (delete-cluster-role-binding name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-cluster-role-binding-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-cluster-role-with-http-info any?
  "
  delete collection of ClusterRole"
  ([] (delete-collection-cluster-role-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-cluster-role v1-status
  "
  delete collection of ClusterRole"
  ([] (delete-collection-cluster-role nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-cluster-role-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-cluster-role-binding-with-http-info any?
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-collection-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-cluster-role-binding v1-status
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-collection-cluster-role-binding nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-cluster-role-binding-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-role-with-http-info any?
  "
  delete collection of Role"
  ([namespace string?, ] (delete-collection-namespaced-role-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-role v1-status
  "
  delete collection of Role"
  ([namespace string?, ] (delete-collection-namespaced-role namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-role-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-role-binding-with-http-info any?
  "
  delete collection of RoleBinding"
  ([namespace string?, ] (delete-collection-namespaced-role-binding-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-role-binding v1-status
  "
  delete collection of RoleBinding"
  ([namespace string?, ] (delete-collection-namespaced-role-binding namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-role-binding-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-role-with-http-info any?
  "
  delete a Role"
  ([name string?, namespace string?, ] (delete-namespaced-role-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-role v1-status
  "
  delete a Role"
  ([name string?, namespace string?, ] (delete-namespaced-role name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-role-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-role-binding-with-http-info any?
  "
  delete a RoleBinding"
  ([name string?, namespace string?, ] (delete-namespaced-role-binding-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-role-binding v1-status
  "
  delete a RoleBinding"
  ([name string?, namespace string?, ] (delete-namespaced-role-binding name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-role-binding-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
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

(defn-spec get-api-resources v1-api-resource-list
  "
  get available resources"
  []
  (let [res (:data (get-api-resources-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1-api-resource-list res st/string-transformer)
       res)))


(defn-spec list-cluster-role-with-http-info any?
  "
  list or watch objects of kind ClusterRole"
  ([] (list-cluster-role-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cluster-role v1-cluster-role-list
  "
  list or watch objects of kind ClusterRole"
  ([] (list-cluster-role nil))
  ([optional-params any?]
   (let [res (:data (list-cluster-role-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-list res st/string-transformer)
        res))))


(defn-spec list-cluster-role-binding-with-http-info any?
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cluster-role-binding v1-cluster-role-binding-list
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-cluster-role-binding nil))
  ([optional-params any?]
   (let [res (:data (list-cluster-role-binding-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-binding-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-role-with-http-info any?
  "
  list or watch objects of kind Role"
  ([namespace string?, ] (list-namespaced-role-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-role v1-role-list
  "
  list or watch objects of kind Role"
  ([namespace string?, ] (list-namespaced-role namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-role-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-role-binding-with-http-info any?
  "
  list or watch objects of kind RoleBinding"
  ([namespace string?, ] (list-namespaced-role-binding-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-role-binding v1-role-binding-list
  "
  list or watch objects of kind RoleBinding"
  ([namespace string?, ] (list-namespaced-role-binding namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-role-binding-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding-list res st/string-transformer)
        res))))


(defn-spec list-role-binding-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind RoleBinding"
  ([] (list-role-binding-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/rolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-role-binding-for-all-namespaces v1-role-binding-list
  "
  list or watch objects of kind RoleBinding"
  ([] (list-role-binding-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-role-binding-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding-list res st/string-transformer)
        res))))


(defn-spec list-role-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Role"
  ([] (list-role-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/rbac.authorization.k8s.io/v1/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-role-for-all-namespaces v1-role-list
  "
  list or watch objects of kind Role"
  ([] (list-role-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-role-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-list res st/string-transformer)
        res))))


(defn-spec patch-cluster-role-with-http-info any?
  "
  partially update the specified ClusterRole"
  ([name string?, body any?, ] (patch-cluster-role-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-cluster-role v1-cluster-role
  "
  partially update the specified ClusterRole"
  ([name string?, body any?, ] (patch-cluster-role name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-cluster-role-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role res st/string-transformer)
        res))))


(defn-spec patch-cluster-role-binding-with-http-info any?
  "
  partially update the specified ClusterRoleBinding"
  ([name string?, body any?, ] (patch-cluster-role-binding-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-cluster-role-binding v1-cluster-role-binding
  "
  partially update the specified ClusterRoleBinding"
  ([name string?, body any?, ] (patch-cluster-role-binding name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-cluster-role-binding-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-binding res st/string-transformer)
        res))))


(defn-spec patch-namespaced-role-with-http-info any?
  "
  partially update the specified Role"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-role v1-role
  "
  partially update the specified Role"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-role-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role res st/string-transformer)
        res))))


(defn-spec patch-namespaced-role-binding-with-http-info any?
  "
  partially update the specified RoleBinding"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-role-binding v1-role-binding
  "
  partially update the specified RoleBinding"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-role-binding name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-role-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding res st/string-transformer)
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

(defn-spec read-cluster-role v1-cluster-role
  "
  read the specified ClusterRole"
  ([name string?, ] (read-cluster-role name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-cluster-role-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role res st/string-transformer)
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

(defn-spec read-cluster-role-binding v1-cluster-role-binding
  "
  read the specified ClusterRoleBinding"
  ([name string?, ] (read-cluster-role-binding name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-cluster-role-binding-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-binding res st/string-transformer)
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

(defn-spec read-namespaced-role v1-role
  "
  read the specified Role"
  ([name string?, namespace string?, ] (read-namespaced-role name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-role-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role res st/string-transformer)
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

(defn-spec read-namespaced-role-binding v1-role-binding
  "
  read the specified RoleBinding"
  ([name string?, namespace string?, ] (read-namespaced-role-binding name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-role-binding-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding res st/string-transformer)
        res))))


(defn-spec replace-cluster-role-with-http-info any?
  "
  replace the specified ClusterRole"
  ([name string?, body v1-cluster-role, ] (replace-cluster-role-with-http-info name body nil))
  ([name string?, body v1-cluster-role, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterroles/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-cluster-role v1-cluster-role
  "
  replace the specified ClusterRole"
  ([name string?, body v1-cluster-role, ] (replace-cluster-role name body nil))
  ([name string?, body v1-cluster-role, optional-params any?]
   (let [res (:data (replace-cluster-role-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role res st/string-transformer)
        res))))


(defn-spec replace-cluster-role-binding-with-http-info any?
  "
  replace the specified ClusterRoleBinding"
  ([name string?, body v1-cluster-role-binding, ] (replace-cluster-role-binding-with-http-info name body nil))
  ([name string?, body v1-cluster-role-binding, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-cluster-role-binding v1-cluster-role-binding
  "
  replace the specified ClusterRoleBinding"
  ([name string?, body v1-cluster-role-binding, ] (replace-cluster-role-binding name body nil))
  ([name string?, body v1-cluster-role-binding, optional-params any?]
   (let [res (:data (replace-cluster-role-binding-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-cluster-role-binding res st/string-transformer)
        res))))


(defn-spec replace-namespaced-role-with-http-info any?
  "
  replace the specified Role"
  ([name string?, namespace string?, body v1-role, ] (replace-namespaced-role-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-role, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-role v1-role
  "
  replace the specified Role"
  ([name string?, namespace string?, body v1-role, ] (replace-namespaced-role name namespace body nil))
  ([name string?, namespace string?, body v1-role, optional-params any?]
   (let [res (:data (replace-namespaced-role-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role res st/string-transformer)
        res))))


(defn-spec replace-namespaced-role-binding-with-http-info any?
  "
  replace the specified RoleBinding"
  ([name string?, namespace string?, body v1-role-binding, ] (replace-namespaced-role-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-role-binding, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/rolebindings/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-role-binding v1-role-binding
  "
  replace the specified RoleBinding"
  ([name string?, namespace string?, body v1-role-binding, ] (replace-namespaced-role-binding name namespace body nil))
  ([name string?, namespace string?, body v1-role-binding, optional-params any?]
   (let [res (:data (replace-namespaced-role-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-role-binding res st/string-transformer)
        res))))


