(ns clojure-kubernetes-client.api.discovery-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-endpoint-slice :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-endpoint-slice-with-http-info any?
  "
  create an EndpointSlice"
  ([namespace string?, body v1beta1-endpoint-slice, ] (create-namespaced-endpoint-slice-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-endpoint-slice, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-endpoint-slice v1beta1-endpoint-slice
  "
  create an EndpointSlice"
  ([namespace string?, body v1beta1-endpoint-slice, ] (create-namespaced-endpoint-slice namespace body nil))
  ([namespace string?, body v1beta1-endpoint-slice, optional-params any?]
   (let [res (:data (create-namespaced-endpoint-slice-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-endpoint-slice-with-http-info any?
  "
  delete collection of EndpointSlice"
  ([namespace string?, ] (delete-collection-namespaced-endpoint-slice-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-endpoint-slice v1-status
  "
  delete collection of EndpointSlice"
  ([namespace string?, ] (delete-collection-namespaced-endpoint-slice namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-endpoint-slice-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-endpoint-slice-with-http-info any?
  "
  delete an EndpointSlice"
  ([name string?, namespace string?, ] (delete-namespaced-endpoint-slice-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-endpoint-slice v1-status
  "
  delete an EndpointSlice"
  ([name string?, namespace string?, ] (delete-namespaced-endpoint-slice name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-endpoint-slice-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/discovery.k8s.io/v1beta1/" :get
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


(defn-spec list-endpoint-slice-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind EndpointSlice"
  ([] (list-endpoint-slice-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/discovery.k8s.io/v1beta1/endpointslices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-endpoint-slice-for-all-namespaces v1beta1-endpoint-slice-list
  "
  list or watch objects of kind EndpointSlice"
  ([] (list-endpoint-slice-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-endpoint-slice-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-endpoint-slice-with-http-info any?
  "
  list or watch objects of kind EndpointSlice"
  ([namespace string?, ] (list-namespaced-endpoint-slice-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-endpoint-slice v1beta1-endpoint-slice-list
  "
  list or watch objects of kind EndpointSlice"
  ([namespace string?, ] (list-namespaced-endpoint-slice namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-endpoint-slice-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-endpoint-slice-with-http-info any?
  "
  partially update the specified EndpointSlice"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-endpoint-slice-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-endpoint-slice v1beta1-endpoint-slice
  "
  partially update the specified EndpointSlice"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-endpoint-slice name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-endpoint-slice-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice res st/string-transformer)
        res))))


(defn-spec read-namespaced-endpoint-slice-with-http-info any?
  "
  read the specified EndpointSlice"
  ([name string?, namespace string?, ] (read-namespaced-endpoint-slice-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-endpoint-slice v1beta1-endpoint-slice
  "
  read the specified EndpointSlice"
  ([name string?, namespace string?, ] (read-namespaced-endpoint-slice name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-endpoint-slice-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice res st/string-transformer)
        res))))


(defn-spec replace-namespaced-endpoint-slice-with-http-info any?
  "
  replace the specified EndpointSlice"
  ([name string?, namespace string?, body v1beta1-endpoint-slice, ] (replace-namespaced-endpoint-slice-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-endpoint-slice, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/discovery.k8s.io/v1beta1/namespaces/{namespace}/endpointslices/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-endpoint-slice v1beta1-endpoint-slice
  "
  replace the specified EndpointSlice"
  ([name string?, namespace string?, body v1beta1-endpoint-slice, ] (replace-namespaced-endpoint-slice name namespace body nil))
  ([name string?, namespace string?, body v1beta1-endpoint-slice, optional-params any?]
   (let [res (:data (replace-namespaced-endpoint-slice-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-endpoint-slice res st/string-transformer)
        res))))


