(ns clojure-kubernetes-client.api.node-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-runtime-class :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-runtime-class-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-runtime-class :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-runtime-class :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-runtime-class :refer :all]
)
  (:import (java.io File)))


(defn-spec create-runtime-class-with-http-info any?
  "
  create a RuntimeClass"
  ([body v1alpha1-runtime-class, ] (create-runtime-class-with-http-info body nil))
  ([body v1alpha1-runtime-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-runtime-class v1alpha1-runtime-class
  "
  create a RuntimeClass"
  ([body v1alpha1-runtime-class, ] (create-runtime-class body nil))
  ([body v1alpha1-runtime-class, optional-params any?]
   (let [res (:data (create-runtime-class-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-runtime-class res st/string-transformer)
        res))))


(defn-spec delete-collection-runtime-class-with-http-info any?
  "
  delete collection of RuntimeClass"
  ([] (delete-collection-runtime-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-runtime-class v1-status
  "
  delete collection of RuntimeClass"
  ([] (delete-collection-runtime-class nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-runtime-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-runtime-class-with-http-info any?
  "
  delete a RuntimeClass"
  ([name string?, ] (delete-runtime-class-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-runtime-class v1-status
  "
  delete a RuntimeClass"
  ([name string?, ] (delete-runtime-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-runtime-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/node.k8s.io/v1alpha1/" :get
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


(defn-spec list-runtime-class-with-http-info any?
  "
  list or watch objects of kind RuntimeClass"
  ([] (list-runtime-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-runtime-class v1alpha1-runtime-class-list
  "
  list or watch objects of kind RuntimeClass"
  ([] (list-runtime-class nil))
  ([optional-params any?]
   (let [res (:data (list-runtime-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-runtime-class-list res st/string-transformer)
        res))))


(defn-spec patch-runtime-class-with-http-info any?
  "
  partially update the specified RuntimeClass"
  ([name string?, body any?, ] (patch-runtime-class-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-runtime-class v1alpha1-runtime-class
  "
  partially update the specified RuntimeClass"
  ([name string?, body any?, ] (patch-runtime-class name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-runtime-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-runtime-class res st/string-transformer)
        res))))


(defn-spec read-runtime-class-with-http-info any?
  "
  read the specified RuntimeClass"
  ([name string?, ] (read-runtime-class-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-runtime-class v1alpha1-runtime-class
  "
  read the specified RuntimeClass"
  ([name string?, ] (read-runtime-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-runtime-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-runtime-class res st/string-transformer)
        res))))


(defn-spec replace-runtime-class-with-http-info any?
  "
  replace the specified RuntimeClass"
  ([name string?, body v1alpha1-runtime-class, ] (replace-runtime-class-with-http-info name body nil))
  ([name string?, body v1alpha1-runtime-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/node.k8s.io/v1alpha1/runtimeclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-runtime-class v1alpha1-runtime-class
  "
  replace the specified RuntimeClass"
  ([name string?, body v1alpha1-runtime-class, ] (replace-runtime-class name body nil))
  ([name string?, body v1alpha1-runtime-class, optional-params any?]
   (let [res (:data (replace-runtime-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-runtime-class res st/string-transformer)
        res))))


