(ns clojure-kubernetes-client.api.apiregistration-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-api-service :refer :all]
)
  (:import (java.io File)))


(defn-spec create-api-service-with-http-info any?
  "
  create an APIService"
  ([body v1beta1-api-service, ] (create-api-service-with-http-info body nil))
  ([body v1beta1-api-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-api-service v1beta1-api-service
  "
  create an APIService"
  ([body v1beta1-api-service, ] (create-api-service body nil))
  ([body v1beta1-api-service, optional-params any?]
   (let [res (:data (create-api-service-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec delete-api-service-with-http-info any?
  "
  delete an APIService"
  ([name string?, ] (delete-api-service-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-api-service v1-status
  "
  delete an APIService"
  ([name string?, ] (delete-api-service name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-api-service-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-api-service-with-http-info any?
  "
  delete collection of APIService"
  ([] (delete-collection-api-service-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-api-service v1-status
  "
  delete collection of APIService"
  ([] (delete-collection-api-service nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-api-service-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/apiregistration.k8s.io/v1beta1/" :get
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


(defn-spec list-api-service-with-http-info any?
  "
  list or watch objects of kind APIService"
  ([] (list-api-service-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-api-service v1beta1-api-service-list
  "
  list or watch objects of kind APIService"
  ([] (list-api-service nil))
  ([optional-params any?]
   (let [res (:data (list-api-service-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service-list res st/string-transformer)
        res))))


(defn-spec patch-api-service-with-http-info any?
  "
  partially update the specified APIService"
  ([name string?, body any?, ] (patch-api-service-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-api-service v1beta1-api-service
  "
  partially update the specified APIService"
  ([name string?, body any?, ] (patch-api-service name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-api-service-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec patch-api-service-status-with-http-info any?
  "
  partially update status of the specified APIService"
  ([name string?, body any?, ] (patch-api-service-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-api-service-status v1beta1-api-service
  "
  partially update status of the specified APIService"
  ([name string?, body any?, ] (patch-api-service-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-api-service-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec read-api-service-with-http-info any?
  "
  read the specified APIService"
  ([name string?, ] (read-api-service-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-api-service v1beta1-api-service
  "
  read the specified APIService"
  ([name string?, ] (read-api-service name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-api-service-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec read-api-service-status-with-http-info any?
  "
  read status of the specified APIService"
  ([name string?, ] (read-api-service-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-api-service-status v1beta1-api-service
  "
  read status of the specified APIService"
  ([name string?, ] (read-api-service-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-api-service-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec replace-api-service-with-http-info any?
  "
  replace the specified APIService"
  ([name string?, body v1beta1-api-service, ] (replace-api-service-with-http-info name body nil))
  ([name string?, body v1beta1-api-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-api-service v1beta1-api-service
  "
  replace the specified APIService"
  ([name string?, body v1beta1-api-service, ] (replace-api-service name body nil))
  ([name string?, body v1beta1-api-service, optional-params any?]
   (let [res (:data (replace-api-service-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


(defn-spec replace-api-service-status-with-http-info any?
  "
  replace status of the specified APIService"
  ([name string?, body v1beta1-api-service, ] (replace-api-service-status-with-http-info name body nil))
  ([name string?, body v1beta1-api-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/apiregistration.k8s.io/v1beta1/apiservices/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-api-service-status v1beta1-api-service
  "
  replace status of the specified APIService"
  ([name string?, body v1beta1-api-service, ] (replace-api-service-status name body nil))
  ([name string?, body v1beta1-api-service, optional-params any?]
   (let [res (:data (replace-api-service-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-api-service res st/string-transformer)
        res))))


