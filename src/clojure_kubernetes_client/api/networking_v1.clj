(ns clojure-kubernetes-client.api.networking-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-network-policy-list :refer :all]

            [clojure-kubernetes-client.specs.v1-network-policy-list :refer :all]

            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]

            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-network-policy-with-http-info any?
  "
  create a NetworkPolicy"
  ([namespace string?, body v1-network-policy, ] (create-namespaced-network-policy-with-http-info namespace body nil))
  ([namespace string?, body v1-network-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-network-policy v1-network-policy
  "
  create a NetworkPolicy"
  ([namespace string?, body v1-network-policy, ] (create-namespaced-network-policy namespace body nil))
  ([namespace string?, body v1-network-policy, optional-params any?]
   (let [res (:data (create-namespaced-network-policy-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-network-policy-with-http-info any?
  "
  delete collection of NetworkPolicy"
  ([namespace string?, ] (delete-collection-namespaced-network-policy-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :delete
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


(defn-spec delete-namespaced-network-policy-with-http-info any?
  "
  delete a NetworkPolicy"
  ([name string?, namespace string?, ] (delete-namespaced-network-policy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :delete
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


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/networking.k8s.io/v1/" :get
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


(defn-spec list-namespaced-network-policy-with-http-info any?
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace string?, ] (list-namespaced-network-policy-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-network-policy v1-network-policy-list
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace string?, ] (list-namespaced-network-policy namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-network-policy-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy-list res st/string-transformer)
        res))))


(defn-spec list-network-policy-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-network-policy-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/networking.k8s.io/v1/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-network-policy-for-all-namespaces v1-network-policy-list
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-network-policy-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-network-policy-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-network-policy-with-http-info any?
  "
  partially update the specified NetworkPolicy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-network-policy-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-network-policy v1-network-policy
  "
  partially update the specified NetworkPolicy"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-network-policy name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-network-policy-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy res st/string-transformer)
        res))))


(defn-spec read-namespaced-network-policy-with-http-info any?
  "
  read the specified NetworkPolicy"
  ([name string?, namespace string?, ] (read-namespaced-network-policy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-network-policy v1-network-policy
  "
  read the specified NetworkPolicy"
  ([name string?, namespace string?, ] (read-namespaced-network-policy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-network-policy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy res st/string-transformer)
        res))))


(defn-spec replace-namespaced-network-policy-with-http-info any?
  "
  replace the specified NetworkPolicy"
  ([name string?, namespace string?, body v1-network-policy, ] (replace-namespaced-network-policy-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-network-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-network-policy v1-network-policy
  "
  replace the specified NetworkPolicy"
  ([name string?, namespace string?, body v1-network-policy, ] (replace-namespaced-network-policy name namespace body nil))
  ([name string?, namespace string?, body v1-network-policy, optional-params any?]
   (let [res (:data (replace-namespaced-network-policy-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-network-policy res st/string-transformer)
        res))))


