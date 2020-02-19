(ns clojure-kubernetes-client.api.networking-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-list :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress-list :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]

            [clojure-kubernetes-client.specs.networking-v1beta1-ingress :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-ingress-with-http-info any?
  "
  create an Ingress"
  ([namespace string?, body networking-v1beta1-ingress, ] (create-namespaced-ingress-with-http-info namespace body nil))
  ([namespace string?, body networking-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-ingress networking-v1beta1-ingress
  "
  create an Ingress"
  ([namespace string?, body networking-v1beta1-ingress, ] (create-namespaced-ingress namespace body nil))
  ([namespace string?, body networking-v1beta1-ingress, optional-params any?]
   (let [res (:data (create-namespaced-ingress-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-ingress-with-http-info any?
  "
  delete collection of Ingress"
  ([namespace string?, ] (delete-collection-namespaced-ingress-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses" :delete
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


(defn-spec delete-namespaced-ingress-with-http-info any?
  "
  delete an Ingress"
  ([name string?, namespace string?, ] (delete-namespaced-ingress-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}" :delete
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


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/networking.k8s.io/v1beta1/" :get
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


(defn-spec list-ingress-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Ingress"
  ([] (list-ingress-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/networking.k8s.io/v1beta1/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-ingress-for-all-namespaces networking-v1beta1-ingress-list
  "
  list or watch objects of kind Ingress"
  ([] (list-ingress-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-ingress-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-ingress-with-http-info any?
  "
  list or watch objects of kind Ingress"
  ([namespace string?, ] (list-namespaced-ingress-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-ingress networking-v1beta1-ingress-list
  "
  list or watch objects of kind Ingress"
  ([namespace string?, ] (list-namespaced-ingress namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-ingress-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-ingress-with-http-info any?
  "
  partially update the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-ingress networking-v1beta1-ingress
  "
  partially update the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-ingress-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec patch-namespaced-ingress-status-with-http-info any?
  "
  partially update status of the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-ingress-status networking-v1beta1-ingress
  "
  partially update status of the specified Ingress"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-ingress-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-ingress-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec read-namespaced-ingress-with-http-info any?
  "
  read the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-ingress networking-v1beta1-ingress
  "
  read the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-ingress-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec read-namespaced-ingress-status-with-http-info any?
  "
  read status of the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-ingress-status networking-v1beta1-ingress
  "
  read status of the specified Ingress"
  ([name string?, namespace string?, ] (read-namespaced-ingress-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-ingress-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec replace-namespaced-ingress-with-http-info any?
  "
  replace the specified Ingress"
  ([name string?, namespace string?, body networking-v1beta1-ingress, ] (replace-namespaced-ingress-with-http-info name namespace body nil))
  ([name string?, namespace string?, body networking-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-ingress networking-v1beta1-ingress
  "
  replace the specified Ingress"
  ([name string?, namespace string?, body networking-v1beta1-ingress, ] (replace-namespaced-ingress name namespace body nil))
  ([name string?, namespace string?, body networking-v1beta1-ingress, optional-params any?]
   (let [res (:data (replace-namespaced-ingress-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


(defn-spec replace-namespaced-ingress-status-with-http-info any?
  "
  replace status of the specified Ingress"
  ([name string?, namespace string?, body networking-v1beta1-ingress, ] (replace-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body networking-v1beta1-ingress, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-ingress-status networking-v1beta1-ingress
  "
  replace status of the specified Ingress"
  ([name string?, namespace string?, body networking-v1beta1-ingress, ] (replace-namespaced-ingress-status name namespace body nil))
  ([name string?, namespace string?, body networking-v1beta1-ingress, optional-params any?]
   (let [res (:data (replace-namespaced-ingress-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode networking-v1beta1-ingress res st/string-transformer)
        res))))


