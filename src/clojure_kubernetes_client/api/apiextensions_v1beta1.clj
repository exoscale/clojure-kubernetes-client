(ns clojure-kubernetes-client.api.apiextensions-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-custom-resource-definition :refer :all]
)
  (:import (java.io File)))


(defn-spec create-custom-resource-definition-with-http-info any?
  "
  create a CustomResourceDefinition"
  ([body v1beta1-custom-resource-definition, ] (create-custom-resource-definition-with-http-info body nil))
  ([body v1beta1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-custom-resource-definition v1beta1-custom-resource-definition
  "
  create a CustomResourceDefinition"
  ([body v1beta1-custom-resource-definition, ] (create-custom-resource-definition body nil))
  ([body v1beta1-custom-resource-definition, optional-params any?]
   (let [res (:data (create-custom-resource-definition-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec delete-collection-custom-resource-definition-with-http-info any?
  "
  delete collection of CustomResourceDefinition"
  ([] (delete-collection-custom-resource-definition-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :delete
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
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :delete
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
  (call-api "/apis/apiextensions.k8s.io/v1beta1/" :get
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
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-custom-resource-definition v1beta1-custom-resource-definition-list
  "
  list or watch objects of kind CustomResourceDefinition"
  ([] (list-custom-resource-definition nil))
  ([optional-params any?]
   (let [res (:data (list-custom-resource-definition-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition-list res st/string-transformer)
        res))))


(defn-spec patch-custom-resource-definition-with-http-info any?
  "
  partially update the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-custom-resource-definition v1beta1-custom-resource-definition
  "
  partially update the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-custom-resource-definition-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec patch-custom-resource-definition-status-with-http-info any?
  "
  partially update status of the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-custom-resource-definition-status v1beta1-custom-resource-definition
  "
  partially update status of the specified CustomResourceDefinition"
  ([name string?, body any?, ] (patch-custom-resource-definition-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-custom-resource-definition-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec read-custom-resource-definition-with-http-info any?
  "
  read the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-custom-resource-definition v1beta1-custom-resource-definition
  "
  read the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-custom-resource-definition-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec read-custom-resource-definition-status-with-http-info any?
  "
  read status of the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-custom-resource-definition-status v1beta1-custom-resource-definition
  "
  read status of the specified CustomResourceDefinition"
  ([name string?, ] (read-custom-resource-definition-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-custom-resource-definition-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec replace-custom-resource-definition-with-http-info any?
  "
  replace the specified CustomResourceDefinition"
  ([name string?, body v1beta1-custom-resource-definition, ] (replace-custom-resource-definition-with-http-info name body nil))
  ([name string?, body v1beta1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-custom-resource-definition v1beta1-custom-resource-definition
  "
  replace the specified CustomResourceDefinition"
  ([name string?, body v1beta1-custom-resource-definition, ] (replace-custom-resource-definition name body nil))
  ([name string?, body v1beta1-custom-resource-definition, optional-params any?]
   (let [res (:data (replace-custom-resource-definition-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


(defn-spec replace-custom-resource-definition-status-with-http-info any?
  "
  replace status of the specified CustomResourceDefinition"
  ([name string?, body v1beta1-custom-resource-definition, ] (replace-custom-resource-definition-status-with-http-info name body nil))
  ([name string?, body v1beta1-custom-resource-definition, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-custom-resource-definition-status v1beta1-custom-resource-definition
  "
  replace status of the specified CustomResourceDefinition"
  ([name string?, body v1beta1-custom-resource-definition, ] (replace-custom-resource-definition-status name body nil))
  ([name string?, body v1beta1-custom-resource-definition, optional-params any?]
   (let [res (:data (replace-custom-resource-definition-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-custom-resource-definition res st/string-transformer)
        res))))


