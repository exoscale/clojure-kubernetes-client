(ns clojure-kubernetes-client.api.core-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-binding :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]

            [clojure-kubernetes-client.specs.v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-binding :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-eviction :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-secret :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account :refer :all]

            [clojure-kubernetes-client.specs.v1-token-request :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

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

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-component-status-list :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map-list :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints-list :refer :all]

            [clojure-kubernetes-client.specs.v1-event-list :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range-list :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace-list :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map-list :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints-list :refer :all]

            [clojure-kubernetes-client.specs.v1-event-list :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range-list :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-list :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-list :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template-list :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller-list :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota-list :refer :all]

            [clojure-kubernetes-client.specs.v1-secret-list :refer :all]

            [clojure-kubernetes-client.specs.v1-service-list :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account-list :refer :all]

            [clojure-kubernetes-client.specs.v1-node-list :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-list :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-list :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-list :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template-list :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller-list :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota-list :refer :all]

            [clojure-kubernetes-client.specs.v1-secret-list :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account-list :refer :all]

            [clojure-kubernetes-client.specs.v1-service-list :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]

            [clojure-kubernetes-client.specs.v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-secret :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

            [clojure-kubernetes-client.specs.v1-component-status :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]

            [clojure-kubernetes-client.specs.v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.string? :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-secret :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-namespace :refer :all]

            [clojure-kubernetes-client.specs.v1-config-map :refer :all]

            [clojure-kubernetes-client.specs.v1-endpoints :refer :all]

            [clojure-kubernetes-client.specs.v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-pod :refer :all]

            [clojure-kubernetes-client.specs.v1-pod-template :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1-replication-controller :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-resource-quota :refer :all]

            [clojure-kubernetes-client.specs.v1-secret :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-service-account :refer :all]

            [clojure-kubernetes-client.specs.v1-service :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-node :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]

            [clojure-kubernetes-client.specs.v1-persistent-volume :refer :all]
)
  (:import (java.io File)))


(defn-spec connect-delete-namespaced-pod-proxy-with-http-info any?
  "
  connect DELETE requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-delete-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-namespaced-pod-proxy string?
  "
  connect DELETE requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-delete-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-delete-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-delete-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect DELETE requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-delete-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-namespaced-pod-proxy-with-path string?
  "
  connect DELETE requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-delete-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-delete-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-delete-namespaced-service-proxy-with-http-info any?
  "
  connect DELETE requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-delete-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-namespaced-service-proxy string?
  "
  connect DELETE requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-delete-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-delete-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-delete-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect DELETE requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-delete-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-namespaced-service-proxy-with-path string?
  "
  connect DELETE requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-delete-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-delete-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-delete-node-proxy-with-http-info any?
  "
  connect DELETE requests to proxy of Node"
  ([name string?, ] (connect-delete-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-node-proxy string?
  "
  connect DELETE requests to proxy of Node"
  ([name string?, ] (connect-delete-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-delete-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-delete-node-proxy-with-path-with-http-info any?
  "
  connect DELETE requests to proxy of Node"
  ([name string?, path string?, ] (connect-delete-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-delete-node-proxy-with-path string?
  "
  connect DELETE requests to proxy of Node"
  ([name string?, path string?, ] (connect-delete-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-delete-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-pod-attach-with-http-info any?
  "
  connect GET requests to attach of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-attach-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [container stderr stdin stdout tty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-pod-attach string?
  "
  connect GET requests to attach of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-attach name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-pod-attach-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-pod-exec-with-http-info any?
  "
  connect GET requests to exec of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-exec-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [command container stderr stdin stdout tty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"command" command "container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-pod-exec string?
  "
  connect GET requests to exec of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-exec name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-pod-exec-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-pod-portforward-with-http-info any?
  "
  connect GET requests to portforward of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-portforward-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [ports]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"ports" ports }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-pod-portforward string?
  "
  connect GET requests to portforward of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-portforward name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-pod-portforward-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-pod-proxy-with-http-info any?
  "
  connect GET requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-pod-proxy string?
  "
  connect GET requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-get-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect GET requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-get-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :get
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-pod-proxy-with-path string?
  "
  connect GET requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-get-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-service-proxy-with-http-info any?
  "
  connect GET requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-get-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-service-proxy string?
  "
  connect GET requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-get-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect GET requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-get-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :get
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-namespaced-service-proxy-with-path string?
  "
  connect GET requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-get-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-get-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-node-proxy-with-http-info any?
  "
  connect GET requests to proxy of Node"
  ([name string?, ] (connect-get-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-node-proxy string?
  "
  connect GET requests to proxy of Node"
  ([name string?, ] (connect-get-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-get-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-get-node-proxy-with-path-with-http-info any?
  "
  connect GET requests to proxy of Node"
  ([name string?, path string?, ] (connect-get-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :get
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-get-node-proxy-with-path string?
  "
  connect GET requests to proxy of Node"
  ([name string?, path string?, ] (connect-get-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-get-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-namespaced-pod-proxy-with-http-info any?
  "
  connect HEAD requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-head-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :head
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-namespaced-pod-proxy string?
  "
  connect HEAD requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-head-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-head-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect HEAD requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-head-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :head
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-namespaced-pod-proxy-with-path string?
  "
  connect HEAD requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-head-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-head-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-namespaced-service-proxy-with-http-info any?
  "
  connect HEAD requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-head-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :head
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-namespaced-service-proxy string?
  "
  connect HEAD requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-head-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-head-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect HEAD requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-head-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :head
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-namespaced-service-proxy-with-path string?
  "
  connect HEAD requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-head-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-head-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-node-proxy-with-http-info any?
  "
  connect HEAD requests to proxy of Node"
  ([name string?, ] (connect-head-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :head
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-node-proxy string?
  "
  connect HEAD requests to proxy of Node"
  ([name string?, ] (connect-head-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-head-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-head-node-proxy-with-path-with-http-info any?
  "
  connect HEAD requests to proxy of Node"
  ([name string?, path string?, ] (connect-head-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :head
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-head-node-proxy-with-path string?
  "
  connect HEAD requests to proxy of Node"
  ([name string?, path string?, ] (connect-head-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-head-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-namespaced-pod-proxy-with-http-info any?
  "
  connect OPTIONS requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-options-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :options
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-namespaced-pod-proxy string?
  "
  connect OPTIONS requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-options-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-options-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect OPTIONS requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-options-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :options
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-namespaced-pod-proxy-with-path string?
  "
  connect OPTIONS requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-options-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-options-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-namespaced-service-proxy-with-http-info any?
  "
  connect OPTIONS requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-options-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :options
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-namespaced-service-proxy string?
  "
  connect OPTIONS requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-options-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-options-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect OPTIONS requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-options-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :options
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-namespaced-service-proxy-with-path string?
  "
  connect OPTIONS requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-options-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-options-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-node-proxy-with-http-info any?
  "
  connect OPTIONS requests to proxy of Node"
  ([name string?, ] (connect-options-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :options
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-node-proxy string?
  "
  connect OPTIONS requests to proxy of Node"
  ([name string?, ] (connect-options-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-options-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-options-node-proxy-with-path-with-http-info any?
  "
  connect OPTIONS requests to proxy of Node"
  ([name string?, path string?, ] (connect-options-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :options
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-options-node-proxy-with-path string?
  "
  connect OPTIONS requests to proxy of Node"
  ([name string?, path string?, ] (connect-options-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-options-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-namespaced-pod-proxy-with-http-info any?
  "
  connect PATCH requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-patch-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-namespaced-pod-proxy string?
  "
  connect PATCH requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-patch-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-patch-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect PATCH requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-patch-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-namespaced-pod-proxy-with-path string?
  "
  connect PATCH requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-patch-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-patch-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-namespaced-service-proxy-with-http-info any?
  "
  connect PATCH requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-patch-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-namespaced-service-proxy string?
  "
  connect PATCH requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-patch-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-patch-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect PATCH requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-patch-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-namespaced-service-proxy-with-path string?
  "
  connect PATCH requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-patch-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-patch-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-node-proxy-with-http-info any?
  "
  connect PATCH requests to proxy of Node"
  ([name string?, ] (connect-patch-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-node-proxy string?
  "
  connect PATCH requests to proxy of Node"
  ([name string?, ] (connect-patch-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-patch-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-patch-node-proxy-with-path-with-http-info any?
  "
  connect PATCH requests to proxy of Node"
  ([name string?, path string?, ] (connect-patch-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-patch-node-proxy-with-path string?
  "
  connect PATCH requests to proxy of Node"
  ([name string?, path string?, ] (connect-patch-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-patch-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-pod-attach-with-http-info any?
  "
  connect POST requests to attach of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-attach-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [container stderr stdin stdout tty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-pod-attach string?
  "
  connect POST requests to attach of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-attach name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-pod-attach-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-pod-exec-with-http-info any?
  "
  connect POST requests to exec of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-exec-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [command container stderr stdin stdout tty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"command" command "container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-pod-exec string?
  "
  connect POST requests to exec of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-exec name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-pod-exec-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-pod-portforward-with-http-info any?
  "
  connect POST requests to portforward of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-portforward-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [ports]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"ports" ports }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-pod-portforward string?
  "
  connect POST requests to portforward of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-portforward name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-pod-portforward-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-pod-proxy-with-http-info any?
  "
  connect POST requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-pod-proxy string?
  "
  connect POST requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-post-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect POST requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-post-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :post
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-pod-proxy-with-path string?
  "
  connect POST requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-post-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-service-proxy-with-http-info any?
  "
  connect POST requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-post-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-service-proxy string?
  "
  connect POST requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-post-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect POST requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-post-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :post
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-namespaced-service-proxy-with-path string?
  "
  connect POST requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-post-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-post-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-node-proxy-with-http-info any?
  "
  connect POST requests to proxy of Node"
  ([name string?, ] (connect-post-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :post
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-node-proxy string?
  "
  connect POST requests to proxy of Node"
  ([name string?, ] (connect-post-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-post-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-post-node-proxy-with-path-with-http-info any?
  "
  connect POST requests to proxy of Node"
  ([name string?, path string?, ] (connect-post-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :post
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-post-node-proxy-with-path string?
  "
  connect POST requests to proxy of Node"
  ([name string?, path string?, ] (connect-post-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-post-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-namespaced-pod-proxy-with-http-info any?
  "
  connect PUT requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-put-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-namespaced-pod-proxy string?
  "
  connect PUT requests to proxy of Pod"
  ([name string?, namespace string?, ] (connect-put-namespaced-pod-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-put-namespaced-pod-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-namespaced-pod-proxy-with-path-with-http-info any?
  "
  connect PUT requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-put-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :put
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-namespaced-pod-proxy-with-path string?
  "
  connect PUT requests to proxy of Pod"
  ([name string?, namespace string?, path string?, ] (connect-put-namespaced-pod-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-put-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-namespaced-service-proxy-with-http-info any?
  "
  connect PUT requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-put-namespaced-service-proxy-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-namespaced-service-proxy string?
  "
  connect PUT requests to proxy of Service"
  ([name string?, namespace string?, ] (connect-put-namespaced-service-proxy name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (connect-put-namespaced-service-proxy-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-namespaced-service-proxy-with-path-with-http-info any?
  "
  connect PUT requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-put-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name string?, namespace string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name namespace path)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :put
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-namespaced-service-proxy-with-path string?
  "
  connect PUT requests to proxy of Service"
  ([name string?, namespace string?, path string?, ] (connect-put-namespaced-service-proxy-with-path name namespace path nil))
  ([name string?, namespace string?, path string?, optional-params any?]
   (let [res (:data (connect-put-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-node-proxy-with-http-info any?
  "
  connect PUT requests to proxy of Node"
  ([name string?, ] (connect-put-node-proxy-with-http-info name nil))
  ([name string?, {:keys [path]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/proxy" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-node-proxy string?
  "
  connect PUT requests to proxy of Node"
  ([name string?, ] (connect-put-node-proxy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (connect-put-node-proxy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec connect-put-node-proxy-with-path-with-http-info any?
  "
  connect PUT requests to proxy of Node"
  ([name string?, path string?, ] (connect-put-node-proxy-with-path-with-http-info name path nil))
  ([name string?, path string?, {:keys [path2]} (s/map-of keyword? any?)]
   (check-required-params name path)
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :put
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn-spec connect-put-node-proxy-with-path string?
  "
  connect PUT requests to proxy of Node"
  ([name string?, path string?, ] (connect-put-node-proxy-with-path name path nil))
  ([name string?, path string?, optional-params any?]
   (let [res (:data (connect-put-node-proxy-with-path-with-http-info name path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec create-namespace-with-http-info any?
  "
  create a Namespace"
  ([body v1-namespace, ] (create-namespace-with-http-info body nil))
  ([body v1-namespace, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/api/v1/namespaces" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespace v1-namespace
  "
  create a Namespace"
  ([body v1-namespace, ] (create-namespace body nil))
  ([body v1-namespace, optional-params any?]
   (let [res (:data (create-namespace-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec create-namespaced-binding-with-http-info any?
  "
  create a Binding"
  ([namespace string?, body v1-binding, ] (create-namespaced-binding-with-http-info namespace body nil))
  ([namespace string?, body v1-binding, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/bindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-binding v1-binding
  "
  create a Binding"
  ([namespace string?, body v1-binding, ] (create-namespaced-binding namespace body nil))
  ([namespace string?, body v1-binding, optional-params any?]
   (let [res (:data (create-namespaced-binding-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-binding res st/string-transformer)
        res))))


(defn-spec create-namespaced-config-map-with-http-info any?
  "
  create a ConfigMap"
  ([namespace string?, body v1-config-map, ] (create-namespaced-config-map-with-http-info namespace body nil))
  ([namespace string?, body v1-config-map, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-config-map v1-config-map
  "
  create a ConfigMap"
  ([namespace string?, body v1-config-map, ] (create-namespaced-config-map namespace body nil))
  ([namespace string?, body v1-config-map, optional-params any?]
   (let [res (:data (create-namespaced-config-map-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map res st/string-transformer)
        res))))


(defn-spec create-namespaced-endpoints-with-http-info any?
  "
  create Endpoints"
  ([namespace string?, body v1-endpoints, ] (create-namespaced-endpoints-with-http-info namespace body nil))
  ([namespace string?, body v1-endpoints, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-endpoints v1-endpoints
  "
  create Endpoints"
  ([namespace string?, body v1-endpoints, ] (create-namespaced-endpoints namespace body nil))
  ([namespace string?, body v1-endpoints, optional-params any?]
   (let [res (:data (create-namespaced-endpoints-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints res st/string-transformer)
        res))))


(defn-spec create-namespaced-event-with-http-info any?
  "
  create an Event"
  ([namespace string?, body v1-event, ] (create-namespaced-event-with-http-info namespace body nil))
  ([namespace string?, body v1-event, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/events" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-event v1-event
  "
  create an Event"
  ([namespace string?, body v1-event, ] (create-namespaced-event namespace body nil))
  ([namespace string?, body v1-event, optional-params any?]
   (let [res (:data (create-namespaced-event-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event res st/string-transformer)
        res))))


(defn-spec create-namespaced-limit-range-with-http-info any?
  "
  create a LimitRange"
  ([namespace string?, body v1-limit-range, ] (create-namespaced-limit-range-with-http-info namespace body nil))
  ([namespace string?, body v1-limit-range, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-limit-range v1-limit-range
  "
  create a LimitRange"
  ([namespace string?, body v1-limit-range, ] (create-namespaced-limit-range namespace body nil))
  ([namespace string?, body v1-limit-range, optional-params any?]
   (let [res (:data (create-namespaced-limit-range-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range res st/string-transformer)
        res))))


(defn-spec create-namespaced-persistent-volume-claim-with-http-info any?
  "
  create a PersistentVolumeClaim"
  ([namespace string?, body v1-persistent-volume-claim, ] (create-namespaced-persistent-volume-claim-with-http-info namespace body nil))
  ([namespace string?, body v1-persistent-volume-claim, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-persistent-volume-claim v1-persistent-volume-claim
  "
  create a PersistentVolumeClaim"
  ([namespace string?, body v1-persistent-volume-claim, ] (create-namespaced-persistent-volume-claim namespace body nil))
  ([namespace string?, body v1-persistent-volume-claim, optional-params any?]
   (let [res (:data (create-namespaced-persistent-volume-claim-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec create-namespaced-pod-with-http-info any?
  "
  create a Pod"
  ([namespace string?, body v1-pod, ] (create-namespaced-pod-with-http-info namespace body nil))
  ([namespace string?, body v1-pod, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod v1-pod
  "
  create a Pod"
  ([namespace string?, body v1-pod, ] (create-namespaced-pod namespace body nil))
  ([namespace string?, body v1-pod, optional-params any?]
   (let [res (:data (create-namespaced-pod-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec create-namespaced-pod-binding-with-http-info any?
  "
  create binding of a Pod"
  ([name string?, namespace string?, body v1-binding, ] (create-namespaced-pod-binding-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-binding, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/binding" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod-binding v1-binding
  "
  create binding of a Pod"
  ([name string?, namespace string?, body v1-binding, ] (create-namespaced-pod-binding name namespace body nil))
  ([name string?, namespace string?, body v1-binding, optional-params any?]
   (let [res (:data (create-namespaced-pod-binding-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-binding res st/string-transformer)
        res))))


(defn-spec create-namespaced-pod-eviction-with-http-info any?
  "
  create eviction of a Pod"
  ([name string?, namespace string?, body v1beta1-eviction, ] (create-namespaced-pod-eviction-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-eviction, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/eviction" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod-eviction v1beta1-eviction
  "
  create eviction of a Pod"
  ([name string?, namespace string?, body v1beta1-eviction, ] (create-namespaced-pod-eviction name namespace body nil))
  ([name string?, namespace string?, body v1beta1-eviction, optional-params any?]
   (let [res (:data (create-namespaced-pod-eviction-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-eviction res st/string-transformer)
        res))))


(defn-spec create-namespaced-pod-template-with-http-info any?
  "
  create a PodTemplate"
  ([namespace string?, body v1-pod-template, ] (create-namespaced-pod-template-with-http-info namespace body nil))
  ([namespace string?, body v1-pod-template, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod-template v1-pod-template
  "
  create a PodTemplate"
  ([namespace string?, body v1-pod-template, ] (create-namespaced-pod-template namespace body nil))
  ([namespace string?, body v1-pod-template, optional-params any?]
   (let [res (:data (create-namespaced-pod-template-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template res st/string-transformer)
        res))))


(defn-spec create-namespaced-replication-controller-with-http-info any?
  "
  create a ReplicationController"
  ([namespace string?, body v1-replication-controller, ] (create-namespaced-replication-controller-with-http-info namespace body nil))
  ([namespace string?, body v1-replication-controller, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-replication-controller v1-replication-controller
  "
  create a ReplicationController"
  ([namespace string?, body v1-replication-controller, ] (create-namespaced-replication-controller namespace body nil))
  ([namespace string?, body v1-replication-controller, optional-params any?]
   (let [res (:data (create-namespaced-replication-controller-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec create-namespaced-resource-quota-with-http-info any?
  "
  create a ResourceQuota"
  ([namespace string?, body v1-resource-quota, ] (create-namespaced-resource-quota-with-http-info namespace body nil))
  ([namespace string?, body v1-resource-quota, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-resource-quota v1-resource-quota
  "
  create a ResourceQuota"
  ([namespace string?, body v1-resource-quota, ] (create-namespaced-resource-quota namespace body nil))
  ([namespace string?, body v1-resource-quota, optional-params any?]
   (let [res (:data (create-namespaced-resource-quota-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec create-namespaced-secret-with-http-info any?
  "
  create a Secret"
  ([namespace string?, body v1-secret, ] (create-namespaced-secret-with-http-info namespace body nil))
  ([namespace string?, body v1-secret, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/secrets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-secret v1-secret
  "
  create a Secret"
  ([namespace string?, body v1-secret, ] (create-namespaced-secret namespace body nil))
  ([namespace string?, body v1-secret, optional-params any?]
   (let [res (:data (create-namespaced-secret-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret res st/string-transformer)
        res))))


(defn-spec create-namespaced-service-with-http-info any?
  "
  create a Service"
  ([namespace string?, body v1-service, ] (create-namespaced-service-with-http-info namespace body nil))
  ([namespace string?, body v1-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/services" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-service v1-service
  "
  create a Service"
  ([namespace string?, body v1-service, ] (create-namespaced-service namespace body nil))
  ([namespace string?, body v1-service, optional-params any?]
   (let [res (:data (create-namespaced-service-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec create-namespaced-service-account-with-http-info any?
  "
  create a ServiceAccount"
  ([namespace string?, body v1-service-account, ] (create-namespaced-service-account-with-http-info namespace body nil))
  ([namespace string?, body v1-service-account, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-service-account v1-service-account
  "
  create a ServiceAccount"
  ([namespace string?, body v1-service-account, ] (create-namespaced-service-account namespace body nil))
  ([namespace string?, body v1-service-account, optional-params any?]
   (let [res (:data (create-namespaced-service-account-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account res st/string-transformer)
        res))))


(defn-spec create-namespaced-service-account-token-with-http-info any?
  "
  create token of a ServiceAccount"
  ([name string?, namespace string?, body v1-token-request, ] (create-namespaced-service-account-token-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-token-request, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}/token" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-service-account-token v1-token-request
  "
  create token of a ServiceAccount"
  ([name string?, namespace string?, body v1-token-request, ] (create-namespaced-service-account-token name namespace body nil))
  ([name string?, namespace string?, body v1-token-request, optional-params any?]
   (let [res (:data (create-namespaced-service-account-token-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-token-request res st/string-transformer)
        res))))


(defn-spec create-node-with-http-info any?
  "
  create a Node"
  ([body v1-node, ] (create-node-with-http-info body nil))
  ([body v1-node, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/api/v1/nodes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-node v1-node
  "
  create a Node"
  ([body v1-node, ] (create-node body nil))
  ([body v1-node, optional-params any?]
   (let [res (:data (create-node-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec create-persistent-volume-with-http-info any?
  "
  create a PersistentVolume"
  ([body v1-persistent-volume, ] (create-persistent-volume-with-http-info body nil))
  ([body v1-persistent-volume, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/api/v1/persistentvolumes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-persistent-volume v1-persistent-volume
  "
  create a PersistentVolume"
  ([body v1-persistent-volume, ] (create-persistent-volume body nil))
  ([body v1-persistent-volume, optional-params any?]
   (let [res (:data (create-persistent-volume-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-config-map-with-http-info any?
  "
  delete collection of ConfigMap"
  ([namespace string?, ] (delete-collection-namespaced-config-map-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-config-map v1-status
  "
  delete collection of ConfigMap"
  ([namespace string?, ] (delete-collection-namespaced-config-map namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-config-map-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-endpoints-with-http-info any?
  "
  delete collection of Endpoints"
  ([namespace string?, ] (delete-collection-namespaced-endpoints-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-endpoints v1-status
  "
  delete collection of Endpoints"
  ([namespace string?, ] (delete-collection-namespaced-endpoints namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-endpoints-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-event-with-http-info any?
  "
  delete collection of Event"
  ([namespace string?, ] (delete-collection-namespaced-event-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/events" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-event v1-status
  "
  delete collection of Event"
  ([namespace string?, ] (delete-collection-namespaced-event namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-event-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-limit-range-with-http-info any?
  "
  delete collection of LimitRange"
  ([namespace string?, ] (delete-collection-namespaced-limit-range-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-limit-range v1-status
  "
  delete collection of LimitRange"
  ([namespace string?, ] (delete-collection-namespaced-limit-range namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-limit-range-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-persistent-volume-claim-with-http-info any?
  "
  delete collection of PersistentVolumeClaim"
  ([namespace string?, ] (delete-collection-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-persistent-volume-claim v1-status
  "
  delete collection of PersistentVolumeClaim"
  ([namespace string?, ] (delete-collection-namespaced-persistent-volume-claim namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-persistent-volume-claim-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-pod-with-http-info any?
  "
  delete collection of Pod"
  ([namespace string?, ] (delete-collection-namespaced-pod-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-pod v1-status
  "
  delete collection of Pod"
  ([namespace string?, ] (delete-collection-namespaced-pod namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-pod-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-pod-template-with-http-info any?
  "
  delete collection of PodTemplate"
  ([namespace string?, ] (delete-collection-namespaced-pod-template-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-pod-template v1-status
  "
  delete collection of PodTemplate"
  ([namespace string?, ] (delete-collection-namespaced-pod-template namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-pod-template-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-replication-controller-with-http-info any?
  "
  delete collection of ReplicationController"
  ([namespace string?, ] (delete-collection-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-replication-controller v1-status
  "
  delete collection of ReplicationController"
  ([namespace string?, ] (delete-collection-namespaced-replication-controller namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-replication-controller-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-resource-quota-with-http-info any?
  "
  delete collection of ResourceQuota"
  ([namespace string?, ] (delete-collection-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-resource-quota v1-status
  "
  delete collection of ResourceQuota"
  ([namespace string?, ] (delete-collection-namespaced-resource-quota namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-resource-quota-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-secret-with-http-info any?
  "
  delete collection of Secret"
  ([namespace string?, ] (delete-collection-namespaced-secret-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/secrets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-secret v1-status
  "
  delete collection of Secret"
  ([namespace string?, ] (delete-collection-namespaced-secret namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-secret-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-service-account-with-http-info any?
  "
  delete collection of ServiceAccount"
  ([namespace string?, ] (delete-collection-namespaced-service-account-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-service-account v1-status
  "
  delete collection of ServiceAccount"
  ([namespace string?, ] (delete-collection-namespaced-service-account namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-service-account-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-node-with-http-info any?
  "
  delete collection of Node"
  ([] (delete-collection-node-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/api/v1/nodes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-node v1-status
  "
  delete collection of Node"
  ([] (delete-collection-node nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-node-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-persistent-volume-with-http-info any?
  "
  delete collection of PersistentVolume"
  ([] (delete-collection-persistent-volume-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/api/v1/persistentvolumes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-persistent-volume v1-status
  "
  delete collection of PersistentVolume"
  ([] (delete-collection-persistent-volume nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-persistent-volume-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespace-with-http-info any?
  "
  delete a Namespace"
  ([name string?, ] (delete-namespace-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/namespaces/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespace v1-status
  "
  delete a Namespace"
  ([name string?, ] (delete-namespace name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-namespace-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-config-map-with-http-info any?
  "
  delete a ConfigMap"
  ([name string?, namespace string?, ] (delete-namespaced-config-map-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-config-map v1-status
  "
  delete a ConfigMap"
  ([name string?, namespace string?, ] (delete-namespaced-config-map name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-config-map-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-endpoints-with-http-info any?
  "
  delete Endpoints"
  ([name string?, namespace string?, ] (delete-namespaced-endpoints-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-endpoints v1-status
  "
  delete Endpoints"
  ([name string?, namespace string?, ] (delete-namespaced-endpoints name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-endpoints-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-event-with-http-info any?
  "
  delete an Event"
  ([name string?, namespace string?, ] (delete-namespaced-event-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-event v1-status
  "
  delete an Event"
  ([name string?, namespace string?, ] (delete-namespaced-event name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-event-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-limit-range-with-http-info any?
  "
  delete a LimitRange"
  ([name string?, namespace string?, ] (delete-namespaced-limit-range-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-limit-range v1-status
  "
  delete a LimitRange"
  ([name string?, namespace string?, ] (delete-namespaced-limit-range name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-limit-range-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-persistent-volume-claim-with-http-info any?
  "
  delete a PersistentVolumeClaim"
  ([name string?, namespace string?, ] (delete-namespaced-persistent-volume-claim-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-persistent-volume-claim v1-status
  "
  delete a PersistentVolumeClaim"
  ([name string?, namespace string?, ] (delete-namespaced-persistent-volume-claim name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-persistent-volume-claim-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-pod-with-http-info any?
  "
  delete a Pod"
  ([name string?, namespace string?, ] (delete-namespaced-pod-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-pod v1-status
  "
  delete a Pod"
  ([name string?, namespace string?, ] (delete-namespaced-pod name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-pod-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-pod-template-with-http-info any?
  "
  delete a PodTemplate"
  ([name string?, namespace string?, ] (delete-namespaced-pod-template-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-pod-template v1-status
  "
  delete a PodTemplate"
  ([name string?, namespace string?, ] (delete-namespaced-pod-template name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-pod-template-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-replication-controller-with-http-info any?
  "
  delete a ReplicationController"
  ([name string?, namespace string?, ] (delete-namespaced-replication-controller-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-replication-controller v1-status
  "
  delete a ReplicationController"
  ([name string?, namespace string?, ] (delete-namespaced-replication-controller name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-replication-controller-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-resource-quota-with-http-info any?
  "
  delete a ResourceQuota"
  ([name string?, namespace string?, ] (delete-namespaced-resource-quota-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-resource-quota v1-status
  "
  delete a ResourceQuota"
  ([name string?, namespace string?, ] (delete-namespaced-resource-quota name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-resource-quota-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-secret-with-http-info any?
  "
  delete a Secret"
  ([name string?, namespace string?, ] (delete-namespaced-secret-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-secret v1-status
  "
  delete a Secret"
  ([name string?, namespace string?, ] (delete-namespaced-secret name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-secret-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-service-with-http-info any?
  "
  delete a Service"
  ([name string?, namespace string?, ] (delete-namespaced-service-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-service v1-status
  "
  delete a Service"
  ([name string?, namespace string?, ] (delete-namespaced-service name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-service-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-service-account-with-http-info any?
  "
  delete a ServiceAccount"
  ([name string?, namespace string?, ] (delete-namespaced-service-account-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-service-account v1-status
  "
  delete a ServiceAccount"
  ([name string?, namespace string?, ] (delete-namespaced-service-account name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-service-account-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-node-with-http-info any?
  "
  delete a Node"
  ([name string?, ] (delete-node-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-node v1-status
  "
  delete a Node"
  ([name string?, ] (delete-node name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-node-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-persistent-volume-with-http-info any?
  "
  delete a PersistentVolume"
  ([name string?, ] (delete-persistent-volume-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/persistentvolumes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-persistent-volume v1-status
  "
  delete a PersistentVolume"
  ([name string?, ] (delete-persistent-volume name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-persistent-volume-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/api/v1/" :get
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


(defn-spec list-component-status-with-http-info any?
  "
  list objects of kind ComponentStatus"
  ([] (list-component-status-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/componentstatuses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-component-status v1-component-status-list
  "
  list objects of kind ComponentStatus"
  ([] (list-component-status nil))
  ([optional-params any?]
   (let [res (:data (list-component-status-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-component-status-list res st/string-transformer)
        res))))


(defn-spec list-config-map-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ConfigMap"
  ([] (list-config-map-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/configmaps" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-config-map-for-all-namespaces v1-config-map-list
  "
  list or watch objects of kind ConfigMap"
  ([] (list-config-map-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-config-map-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map-list res st/string-transformer)
        res))))


(defn-spec list-endpoints-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Endpoints"
  ([] (list-endpoints-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/endpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-endpoints-for-all-namespaces v1-endpoints-list
  "
  list or watch objects of kind Endpoints"
  ([] (list-endpoints-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-endpoints-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints-list res st/string-transformer)
        res))))


(defn-spec list-event-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Event"
  ([] (list-event-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-event-for-all-namespaces v1-event-list
  "
  list or watch objects of kind Event"
  ([] (list-event-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-event-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event-list res st/string-transformer)
        res))))


(defn-spec list-limit-range-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind LimitRange"
  ([] (list-limit-range-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/limitranges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-limit-range-for-all-namespaces v1-limit-range-list
  "
  list or watch objects of kind LimitRange"
  ([] (list-limit-range-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-limit-range-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range-list res st/string-transformer)
        res))))


(defn-spec list-namespace-with-http-info any?
  "
  list or watch objects of kind Namespace"
  ([] (list-namespace-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/namespaces" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespace v1-namespace-list
  "
  list or watch objects of kind Namespace"
  ([] (list-namespace nil))
  ([optional-params any?]
   (let [res (:data (list-namespace-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-config-map-with-http-info any?
  "
  list or watch objects of kind ConfigMap"
  ([namespace string?, ] (list-namespaced-config-map-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-config-map v1-config-map-list
  "
  list or watch objects of kind ConfigMap"
  ([namespace string?, ] (list-namespaced-config-map namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-config-map-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-endpoints-with-http-info any?
  "
  list or watch objects of kind Endpoints"
  ([namespace string?, ] (list-namespaced-endpoints-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-endpoints v1-endpoints-list
  "
  list or watch objects of kind Endpoints"
  ([namespace string?, ] (list-namespaced-endpoints namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-endpoints-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-event-with-http-info any?
  "
  list or watch objects of kind Event"
  ([namespace string?, ] (list-namespaced-event-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-event v1-event-list
  "
  list or watch objects of kind Event"
  ([namespace string?, ] (list-namespaced-event namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-event-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-limit-range-with-http-info any?
  "
  list or watch objects of kind LimitRange"
  ([namespace string?, ] (list-namespaced-limit-range-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-limit-range v1-limit-range-list
  "
  list or watch objects of kind LimitRange"
  ([namespace string?, ] (list-namespaced-limit-range namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-limit-range-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-persistent-volume-claim-with-http-info any?
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([namespace string?, ] (list-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-persistent-volume-claim v1-persistent-volume-claim-list
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([namespace string?, ] (list-namespaced-persistent-volume-claim namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-persistent-volume-claim-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-pod-with-http-info any?
  "
  list or watch objects of kind Pod"
  ([namespace string?, ] (list-namespaced-pod-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-pod v1-pod-list
  "
  list or watch objects of kind Pod"
  ([namespace string?, ] (list-namespaced-pod namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-pod-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-pod-template-with-http-info any?
  "
  list or watch objects of kind PodTemplate"
  ([namespace string?, ] (list-namespaced-pod-template-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-pod-template v1-pod-template-list
  "
  list or watch objects of kind PodTemplate"
  ([namespace string?, ] (list-namespaced-pod-template namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-pod-template-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-replication-controller-with-http-info any?
  "
  list or watch objects of kind ReplicationController"
  ([namespace string?, ] (list-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-replication-controller v1-replication-controller-list
  "
  list or watch objects of kind ReplicationController"
  ([namespace string?, ] (list-namespaced-replication-controller namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-replication-controller-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-resource-quota-with-http-info any?
  "
  list or watch objects of kind ResourceQuota"
  ([namespace string?, ] (list-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-resource-quota v1-resource-quota-list
  "
  list or watch objects of kind ResourceQuota"
  ([namespace string?, ] (list-namespaced-resource-quota namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-resource-quota-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-secret-with-http-info any?
  "
  list or watch objects of kind Secret"
  ([namespace string?, ] (list-namespaced-secret-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/secrets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-secret v1-secret-list
  "
  list or watch objects of kind Secret"
  ([namespace string?, ] (list-namespaced-secret namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-secret-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-service-with-http-info any?
  "
  list or watch objects of kind Service"
  ([namespace string?, ] (list-namespaced-service-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/services" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-service v1-service-list
  "
  list or watch objects of kind Service"
  ([namespace string?, ] (list-namespaced-service namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-service-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-service-account-with-http-info any?
  "
  list or watch objects of kind ServiceAccount"
  ([namespace string?, ] (list-namespaced-service-account-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-service-account v1-service-account-list
  "
  list or watch objects of kind ServiceAccount"
  ([namespace string?, ] (list-namespaced-service-account namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-service-account-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account-list res st/string-transformer)
        res))))


(defn-spec list-node-with-http-info any?
  "
  list or watch objects of kind Node"
  ([] (list-node-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-node v1-node-list
  "
  list or watch objects of kind Node"
  ([] (list-node nil))
  ([optional-params any?]
   (let [res (:data (list-node-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node-list res st/string-transformer)
        res))))


(defn-spec list-persistent-volume-with-http-info any?
  "
  list or watch objects of kind PersistentVolume"
  ([] (list-persistent-volume-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/persistentvolumes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-persistent-volume v1-persistent-volume-list
  "
  list or watch objects of kind PersistentVolume"
  ([] (list-persistent-volume nil))
  ([optional-params any?]
   (let [res (:data (list-persistent-volume-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-list res st/string-transformer)
        res))))


(defn-spec list-persistent-volume-claim-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([] (list-persistent-volume-claim-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/persistentvolumeclaims" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-persistent-volume-claim-for-all-namespaces v1-persistent-volume-claim-list
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([] (list-persistent-volume-claim-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-persistent-volume-claim-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim-list res st/string-transformer)
        res))))


(defn-spec list-pod-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Pod"
  ([] (list-pod-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-for-all-namespaces v1-pod-list
  "
  list or watch objects of kind Pod"
  ([] (list-pod-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-pod-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-list res st/string-transformer)
        res))))


(defn-spec list-pod-template-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind PodTemplate"
  ([] (list-pod-template-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/podtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-template-for-all-namespaces v1-pod-template-list
  "
  list or watch objects of kind PodTemplate"
  ([] (list-pod-template-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-pod-template-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template-list res st/string-transformer)
        res))))


(defn-spec list-replication-controller-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ReplicationController"
  ([] (list-replication-controller-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/replicationcontrollers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-replication-controller-for-all-namespaces v1-replication-controller-list
  "
  list or watch objects of kind ReplicationController"
  ([] (list-replication-controller-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-replication-controller-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller-list res st/string-transformer)
        res))))


(defn-spec list-resource-quota-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ResourceQuota"
  ([] (list-resource-quota-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/resourcequotas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-resource-quota-for-all-namespaces v1-resource-quota-list
  "
  list or watch objects of kind ResourceQuota"
  ([] (list-resource-quota-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-resource-quota-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota-list res st/string-transformer)
        res))))


(defn-spec list-secret-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Secret"
  ([] (list-secret-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/secrets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-secret-for-all-namespaces v1-secret-list
  "
  list or watch objects of kind Secret"
  ([] (list-secret-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-secret-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret-list res st/string-transformer)
        res))))


(defn-spec list-service-account-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ServiceAccount"
  ([] (list-service-account-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/serviceaccounts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-service-account-for-all-namespaces v1-service-account-list
  "
  list or watch objects of kind ServiceAccount"
  ([] (list-service-account-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-service-account-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account-list res st/string-transformer)
        res))))


(defn-spec list-service-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Service"
  ([] (list-service-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/api/v1/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-service-for-all-namespaces v1-service-list
  "
  list or watch objects of kind Service"
  ([] (list-service-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-service-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-list res st/string-transformer)
        res))))


(defn-spec patch-namespace-with-http-info any?
  "
  partially update the specified Namespace"
  ([name string?, body any?, ] (patch-namespace-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/namespaces/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespace v1-namespace
  "
  partially update the specified Namespace"
  ([name string?, body any?, ] (patch-namespace name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-namespace-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec patch-namespace-status-with-http-info any?
  "
  partially update status of the specified Namespace"
  ([name string?, body any?, ] (patch-namespace-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/namespaces/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespace-status v1-namespace
  "
  partially update status of the specified Namespace"
  ([name string?, body any?, ] (patch-namespace-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-namespace-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec patch-namespaced-config-map-with-http-info any?
  "
  partially update the specified ConfigMap"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-config-map-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-config-map v1-config-map
  "
  partially update the specified ConfigMap"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-config-map name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-config-map-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map res st/string-transformer)
        res))))


(defn-spec patch-namespaced-endpoints-with-http-info any?
  "
  partially update the specified Endpoints"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-endpoints-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-endpoints v1-endpoints
  "
  partially update the specified Endpoints"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-endpoints name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-endpoints-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints res st/string-transformer)
        res))))


(defn-spec patch-namespaced-event-with-http-info any?
  "
  partially update the specified Event"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-event-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-event v1-event
  "
  partially update the specified Event"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-event name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-event-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event res st/string-transformer)
        res))))


(defn-spec patch-namespaced-limit-range-with-http-info any?
  "
  partially update the specified LimitRange"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-limit-range-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-limit-range v1-limit-range
  "
  partially update the specified LimitRange"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-limit-range name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-limit-range-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range res st/string-transformer)
        res))))


(defn-spec patch-namespaced-persistent-volume-claim-with-http-info any?
  "
  partially update the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-persistent-volume-claim-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-persistent-volume-claim v1-persistent-volume-claim
  "
  partially update the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-persistent-volume-claim name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-persistent-volume-claim-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec patch-namespaced-persistent-volume-claim-status-with-http-info any?
  "
  partially update status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-persistent-volume-claim-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-persistent-volume-claim-status v1-persistent-volume-claim
  "
  partially update status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-persistent-volume-claim-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-persistent-volume-claim-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-with-http-info any?
  "
  partially update the specified Pod"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod v1-pod
  "
  partially update the specified Pod"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-status-with-http-info any?
  "
  partially update status of the specified Pod"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod-status v1-pod
  "
  partially update status of the specified Pod"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-template-with-http-info any?
  "
  partially update the specified PodTemplate"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-template-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod-template v1-pod-template
  "
  partially update the specified PodTemplate"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-template name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-template-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replication-controller-with-http-info any?
  "
  partially update the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replication-controller v1-replication-controller
  "
  partially update the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replication-controller-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replication-controller-scale-with-http-info any?
  "
  partially update scale of the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replication-controller-scale v1-scale
  "
  partially update scale of the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replication-controller-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-scale res st/string-transformer)
        res))))


(defn-spec patch-namespaced-replication-controller-status-with-http-info any?
  "
  partially update status of the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-replication-controller-status v1-replication-controller
  "
  partially update status of the specified ReplicationController"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-replication-controller-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-replication-controller-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec patch-namespaced-resource-quota-with-http-info any?
  "
  partially update the specified ResourceQuota"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-resource-quota-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-resource-quota v1-resource-quota
  "
  partially update the specified ResourceQuota"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-resource-quota name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-resource-quota-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec patch-namespaced-resource-quota-status-with-http-info any?
  "
  partially update status of the specified ResourceQuota"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-resource-quota-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-resource-quota-status v1-resource-quota
  "
  partially update status of the specified ResourceQuota"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-resource-quota-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-resource-quota-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec patch-namespaced-secret-with-http-info any?
  "
  partially update the specified Secret"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-secret-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-secret v1-secret
  "
  partially update the specified Secret"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-secret name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-secret-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret res st/string-transformer)
        res))))


(defn-spec patch-namespaced-service-with-http-info any?
  "
  partially update the specified Service"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-service v1-service
  "
  partially update the specified Service"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-service-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec patch-namespaced-service-account-with-http-info any?
  "
  partially update the specified ServiceAccount"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service-account-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-service-account v1-service-account
  "
  partially update the specified ServiceAccount"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service-account name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-service-account-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account res st/string-transformer)
        res))))


(defn-spec patch-namespaced-service-status-with-http-info any?
  "
  partially update status of the specified Service"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-service-status v1-service
  "
  partially update status of the specified Service"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-service-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-service-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec patch-node-with-http-info any?
  "
  partially update the specified Node"
  ([name string?, body any?, ] (patch-node-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/nodes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-node v1-node
  "
  partially update the specified Node"
  ([name string?, body any?, ] (patch-node name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-node-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec patch-node-status-with-http-info any?
  "
  partially update status of the specified Node"
  ([name string?, body any?, ] (patch-node-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/nodes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-node-status v1-node
  "
  partially update status of the specified Node"
  ([name string?, body any?, ] (patch-node-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-node-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec patch-persistent-volume-with-http-info any?
  "
  partially update the specified PersistentVolume"
  ([name string?, body any?, ] (patch-persistent-volume-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/persistentvolumes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-persistent-volume v1-persistent-volume
  "
  partially update the specified PersistentVolume"
  ([name string?, body any?, ] (patch-persistent-volume name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-persistent-volume-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec patch-persistent-volume-status-with-http-info any?
  "
  partially update status of the specified PersistentVolume"
  ([name string?, body any?, ] (patch-persistent-volume-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/persistentvolumes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-persistent-volume-status v1-persistent-volume
  "
  partially update status of the specified PersistentVolume"
  ([name string?, body any?, ] (patch-persistent-volume-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-persistent-volume-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec read-component-status-with-http-info any?
  "
  read the specified ComponentStatus"
  ([name string?, ] (read-component-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/componentstatuses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-component-status v1-component-status
  "
  read the specified ComponentStatus"
  ([name string?, ] (read-component-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-component-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-component-status res st/string-transformer)
        res))))


(defn-spec read-namespace-with-http-info any?
  "
  read the specified Namespace"
  ([name string?, ] (read-namespace-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/namespaces/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespace v1-namespace
  "
  read the specified Namespace"
  ([name string?, ] (read-namespace name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-namespace-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec read-namespace-status-with-http-info any?
  "
  read status of the specified Namespace"
  ([name string?, ] (read-namespace-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/namespaces/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespace-status v1-namespace
  "
  read status of the specified Namespace"
  ([name string?, ] (read-namespace-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-namespace-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec read-namespaced-config-map-with-http-info any?
  "
  read the specified ConfigMap"
  ([name string?, namespace string?, ] (read-namespaced-config-map-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-config-map v1-config-map
  "
  read the specified ConfigMap"
  ([name string?, namespace string?, ] (read-namespaced-config-map name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-config-map-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map res st/string-transformer)
        res))))


(defn-spec read-namespaced-endpoints-with-http-info any?
  "
  read the specified Endpoints"
  ([name string?, namespace string?, ] (read-namespaced-endpoints-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-endpoints v1-endpoints
  "
  read the specified Endpoints"
  ([name string?, namespace string?, ] (read-namespaced-endpoints name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-endpoints-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints res st/string-transformer)
        res))))


(defn-spec read-namespaced-event-with-http-info any?
  "
  read the specified Event"
  ([name string?, namespace string?, ] (read-namespaced-event-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-event v1-event
  "
  read the specified Event"
  ([name string?, namespace string?, ] (read-namespaced-event name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-event-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event res st/string-transformer)
        res))))


(defn-spec read-namespaced-limit-range-with-http-info any?
  "
  read the specified LimitRange"
  ([name string?, namespace string?, ] (read-namespaced-limit-range-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-limit-range v1-limit-range
  "
  read the specified LimitRange"
  ([name string?, namespace string?, ] (read-namespaced-limit-range name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-limit-range-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range res st/string-transformer)
        res))))


(defn-spec read-namespaced-persistent-volume-claim-with-http-info any?
  "
  read the specified PersistentVolumeClaim"
  ([name string?, namespace string?, ] (read-namespaced-persistent-volume-claim-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-persistent-volume-claim v1-persistent-volume-claim
  "
  read the specified PersistentVolumeClaim"
  ([name string?, namespace string?, ] (read-namespaced-persistent-volume-claim name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-persistent-volume-claim-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec read-namespaced-persistent-volume-claim-status-with-http-info any?
  "
  read status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, ] (read-namespaced-persistent-volume-claim-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-persistent-volume-claim-status v1-persistent-volume-claim
  "
  read status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, ] (read-namespaced-persistent-volume-claim-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-persistent-volume-claim-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-with-http-info any?
  "
  read the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod v1-pod
  "
  read the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-log-with-http-info any?
  "
  read log of the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod-log-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [container follow insecureSkipTLSVerifyBackend limitBytes pretty previous sinceSeconds tailLines timestamps]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/log" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "follow" follow "insecureSkipTLSVerifyBackend" insecureSkipTLSVerifyBackend "limitBytes" limitBytes "pretty" pretty "previous" previous "sinceSeconds" sinceSeconds "tailLines" tailLines "timestamps" timestamps }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain" "application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-log string?
  "
  read log of the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod-log name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-log-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-status-with-http-info any?
  "
  read status of the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-status v1-pod
  "
  read status of the specified Pod"
  ([name string?, namespace string?, ] (read-namespaced-pod-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-template-with-http-info any?
  "
  read the specified PodTemplate"
  ([name string?, namespace string?, ] (read-namespaced-pod-template-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-template v1-pod-template
  "
  read the specified PodTemplate"
  ([name string?, namespace string?, ] (read-namespaced-pod-template name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-template-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template res st/string-transformer)
        res))))


(defn-spec read-namespaced-replication-controller-with-http-info any?
  "
  read the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replication-controller v1-replication-controller
  "
  read the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replication-controller-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec read-namespaced-replication-controller-scale-with-http-info any?
  "
  read scale of the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replication-controller-scale v1-scale
  "
  read scale of the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replication-controller-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-scale res st/string-transformer)
        res))))


(defn-spec read-namespaced-replication-controller-status-with-http-info any?
  "
  read status of the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-replication-controller-status v1-replication-controller
  "
  read status of the specified ReplicationController"
  ([name string?, namespace string?, ] (read-namespaced-replication-controller-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-replication-controller-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec read-namespaced-resource-quota-with-http-info any?
  "
  read the specified ResourceQuota"
  ([name string?, namespace string?, ] (read-namespaced-resource-quota-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-resource-quota v1-resource-quota
  "
  read the specified ResourceQuota"
  ([name string?, namespace string?, ] (read-namespaced-resource-quota name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-resource-quota-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec read-namespaced-resource-quota-status-with-http-info any?
  "
  read status of the specified ResourceQuota"
  ([name string?, namespace string?, ] (read-namespaced-resource-quota-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-resource-quota-status v1-resource-quota
  "
  read status of the specified ResourceQuota"
  ([name string?, namespace string?, ] (read-namespaced-resource-quota-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-resource-quota-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec read-namespaced-secret-with-http-info any?
  "
  read the specified Secret"
  ([name string?, namespace string?, ] (read-namespaced-secret-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-secret v1-secret
  "
  read the specified Secret"
  ([name string?, namespace string?, ] (read-namespaced-secret name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-secret-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret res st/string-transformer)
        res))))


(defn-spec read-namespaced-service-with-http-info any?
  "
  read the specified Service"
  ([name string?, namespace string?, ] (read-namespaced-service-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-service v1-service
  "
  read the specified Service"
  ([name string?, namespace string?, ] (read-namespaced-service name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-service-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec read-namespaced-service-account-with-http-info any?
  "
  read the specified ServiceAccount"
  ([name string?, namespace string?, ] (read-namespaced-service-account-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-service-account v1-service-account
  "
  read the specified ServiceAccount"
  ([name string?, namespace string?, ] (read-namespaced-service-account name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-service-account-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account res st/string-transformer)
        res))))


(defn-spec read-namespaced-service-status-with-http-info any?
  "
  read status of the specified Service"
  ([name string?, namespace string?, ] (read-namespaced-service-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-service-status v1-service
  "
  read status of the specified Service"
  ([name string?, namespace string?, ] (read-namespaced-service-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-service-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec read-node-with-http-info any?
  "
  read the specified Node"
  ([name string?, ] (read-node-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-node v1-node
  "
  read the specified Node"
  ([name string?, ] (read-node name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-node-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec read-node-status-with-http-info any?
  "
  read status of the specified Node"
  ([name string?, ] (read-node-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/nodes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-node-status v1-node
  "
  read status of the specified Node"
  ([name string?, ] (read-node-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-node-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec read-persistent-volume-with-http-info any?
  "
  read the specified PersistentVolume"
  ([name string?, ] (read-persistent-volume-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/persistentvolumes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-persistent-volume v1-persistent-volume
  "
  read the specified PersistentVolume"
  ([name string?, ] (read-persistent-volume name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-persistent-volume-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec read-persistent-volume-status-with-http-info any?
  "
  read status of the specified PersistentVolume"
  ([name string?, ] (read-persistent-volume-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/api/v1/persistentvolumes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-persistent-volume-status v1-persistent-volume
  "
  read status of the specified PersistentVolume"
  ([name string?, ] (read-persistent-volume-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-persistent-volume-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec replace-namespace-with-http-info any?
  "
  replace the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace-with-http-info name body nil))
  ([name string?, body v1-namespace, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/namespaces/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespace v1-namespace
  "
  replace the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace name body nil))
  ([name string?, body v1-namespace, optional-params any?]
   (let [res (:data (replace-namespace-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec replace-namespace-finalize-with-http-info any?
  "
  replace finalize of the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace-finalize-with-http-info name body nil))
  ([name string?, body v1-namespace, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/namespaces/{name}/finalize" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespace-finalize v1-namespace
  "
  replace finalize of the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace-finalize name body nil))
  ([name string?, body v1-namespace, optional-params any?]
   (let [res (:data (replace-namespace-finalize-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec replace-namespace-status-with-http-info any?
  "
  replace status of the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace-status-with-http-info name body nil))
  ([name string?, body v1-namespace, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/namespaces/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespace-status v1-namespace
  "
  replace status of the specified Namespace"
  ([name string?, body v1-namespace, ] (replace-namespace-status name body nil))
  ([name string?, body v1-namespace, optional-params any?]
   (let [res (:data (replace-namespace-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-namespace res st/string-transformer)
        res))))


(defn-spec replace-namespaced-config-map-with-http-info any?
  "
  replace the specified ConfigMap"
  ([name string?, namespace string?, body v1-config-map, ] (replace-namespaced-config-map-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-config-map, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-config-map v1-config-map
  "
  replace the specified ConfigMap"
  ([name string?, namespace string?, body v1-config-map, ] (replace-namespaced-config-map name namespace body nil))
  ([name string?, namespace string?, body v1-config-map, optional-params any?]
   (let [res (:data (replace-namespaced-config-map-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-config-map res st/string-transformer)
        res))))


(defn-spec replace-namespaced-endpoints-with-http-info any?
  "
  replace the specified Endpoints"
  ([name string?, namespace string?, body v1-endpoints, ] (replace-namespaced-endpoints-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-endpoints, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-endpoints v1-endpoints
  "
  replace the specified Endpoints"
  ([name string?, namespace string?, body v1-endpoints, ] (replace-namespaced-endpoints name namespace body nil))
  ([name string?, namespace string?, body v1-endpoints, optional-params any?]
   (let [res (:data (replace-namespaced-endpoints-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-endpoints res st/string-transformer)
        res))))


(defn-spec replace-namespaced-event-with-http-info any?
  "
  replace the specified Event"
  ([name string?, namespace string?, body v1-event, ] (replace-namespaced-event-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-event, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-event v1-event
  "
  replace the specified Event"
  ([name string?, namespace string?, body v1-event, ] (replace-namespaced-event name namespace body nil))
  ([name string?, namespace string?, body v1-event, optional-params any?]
   (let [res (:data (replace-namespaced-event-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-event res st/string-transformer)
        res))))


(defn-spec replace-namespaced-limit-range-with-http-info any?
  "
  replace the specified LimitRange"
  ([name string?, namespace string?, body v1-limit-range, ] (replace-namespaced-limit-range-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-limit-range, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-limit-range v1-limit-range
  "
  replace the specified LimitRange"
  ([name string?, namespace string?, body v1-limit-range, ] (replace-namespaced-limit-range name namespace body nil))
  ([name string?, namespace string?, body v1-limit-range, optional-params any?]
   (let [res (:data (replace-namespaced-limit-range-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-limit-range res st/string-transformer)
        res))))


(defn-spec replace-namespaced-persistent-volume-claim-with-http-info any?
  "
  replace the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body v1-persistent-volume-claim, ] (replace-namespaced-persistent-volume-claim-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-persistent-volume-claim, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-persistent-volume-claim v1-persistent-volume-claim
  "
  replace the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body v1-persistent-volume-claim, ] (replace-namespaced-persistent-volume-claim name namespace body nil))
  ([name string?, namespace string?, body v1-persistent-volume-claim, optional-params any?]
   (let [res (:data (replace-namespaced-persistent-volume-claim-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec replace-namespaced-persistent-volume-claim-status-with-http-info any?
  "
  replace status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body v1-persistent-volume-claim, ] (replace-namespaced-persistent-volume-claim-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-persistent-volume-claim, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-persistent-volume-claim-status v1-persistent-volume-claim
  "
  replace status of the specified PersistentVolumeClaim"
  ([name string?, namespace string?, body v1-persistent-volume-claim, ] (replace-namespaced-persistent-volume-claim-status name namespace body nil))
  ([name string?, namespace string?, body v1-persistent-volume-claim, optional-params any?]
   (let [res (:data (replace-namespaced-persistent-volume-claim-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume-claim res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-with-http-info any?
  "
  replace the specified Pod"
  ([name string?, namespace string?, body v1-pod, ] (replace-namespaced-pod-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-pod, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod v1-pod
  "
  replace the specified Pod"
  ([name string?, namespace string?, body v1-pod, ] (replace-namespaced-pod name namespace body nil))
  ([name string?, namespace string?, body v1-pod, optional-params any?]
   (let [res (:data (replace-namespaced-pod-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-status-with-http-info any?
  "
  replace status of the specified Pod"
  ([name string?, namespace string?, body v1-pod, ] (replace-namespaced-pod-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-pod, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod-status v1-pod
  "
  replace status of the specified Pod"
  ([name string?, namespace string?, body v1-pod, ] (replace-namespaced-pod-status name namespace body nil))
  ([name string?, namespace string?, body v1-pod, optional-params any?]
   (let [res (:data (replace-namespaced-pod-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-template-with-http-info any?
  "
  replace the specified PodTemplate"
  ([name string?, namespace string?, body v1-pod-template, ] (replace-namespaced-pod-template-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-pod-template, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod-template v1-pod-template
  "
  replace the specified PodTemplate"
  ([name string?, namespace string?, body v1-pod-template, ] (replace-namespaced-pod-template name namespace body nil))
  ([name string?, namespace string?, body v1-pod-template, optional-params any?]
   (let [res (:data (replace-namespaced-pod-template-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-pod-template res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replication-controller-with-http-info any?
  "
  replace the specified ReplicationController"
  ([name string?, namespace string?, body v1-replication-controller, ] (replace-namespaced-replication-controller-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-replication-controller, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replication-controller v1-replication-controller
  "
  replace the specified ReplicationController"
  ([name string?, namespace string?, body v1-replication-controller, ] (replace-namespaced-replication-controller name namespace body nil))
  ([name string?, namespace string?, body v1-replication-controller, optional-params any?]
   (let [res (:data (replace-namespaced-replication-controller-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replication-controller-scale-with-http-info any?
  "
  replace scale of the specified ReplicationController"
  ([name string?, namespace string?, body v1-scale, ] (replace-namespaced-replication-controller-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replication-controller-scale v1-scale
  "
  replace scale of the specified ReplicationController"
  ([name string?, namespace string?, body v1-scale, ] (replace-namespaced-replication-controller-scale name namespace body nil))
  ([name string?, namespace string?, body v1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-replication-controller-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-scale res st/string-transformer)
        res))))


(defn-spec replace-namespaced-replication-controller-status-with-http-info any?
  "
  replace status of the specified ReplicationController"
  ([name string?, namespace string?, body v1-replication-controller, ] (replace-namespaced-replication-controller-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-replication-controller, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-replication-controller-status v1-replication-controller
  "
  replace status of the specified ReplicationController"
  ([name string?, namespace string?, body v1-replication-controller, ] (replace-namespaced-replication-controller-status name namespace body nil))
  ([name string?, namespace string?, body v1-replication-controller, optional-params any?]
   (let [res (:data (replace-namespaced-replication-controller-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-replication-controller res st/string-transformer)
        res))))


(defn-spec replace-namespaced-resource-quota-with-http-info any?
  "
  replace the specified ResourceQuota"
  ([name string?, namespace string?, body v1-resource-quota, ] (replace-namespaced-resource-quota-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-resource-quota, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-resource-quota v1-resource-quota
  "
  replace the specified ResourceQuota"
  ([name string?, namespace string?, body v1-resource-quota, ] (replace-namespaced-resource-quota name namespace body nil))
  ([name string?, namespace string?, body v1-resource-quota, optional-params any?]
   (let [res (:data (replace-namespaced-resource-quota-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec replace-namespaced-resource-quota-status-with-http-info any?
  "
  replace status of the specified ResourceQuota"
  ([name string?, namespace string?, body v1-resource-quota, ] (replace-namespaced-resource-quota-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-resource-quota, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-resource-quota-status v1-resource-quota
  "
  replace status of the specified ResourceQuota"
  ([name string?, namespace string?, body v1-resource-quota, ] (replace-namespaced-resource-quota-status name namespace body nil))
  ([name string?, namespace string?, body v1-resource-quota, optional-params any?]
   (let [res (:data (replace-namespaced-resource-quota-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-resource-quota res st/string-transformer)
        res))))


(defn-spec replace-namespaced-secret-with-http-info any?
  "
  replace the specified Secret"
  ([name string?, namespace string?, body v1-secret, ] (replace-namespaced-secret-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-secret, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-secret v1-secret
  "
  replace the specified Secret"
  ([name string?, namespace string?, body v1-secret, ] (replace-namespaced-secret name namespace body nil))
  ([name string?, namespace string?, body v1-secret, optional-params any?]
   (let [res (:data (replace-namespaced-secret-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-secret res st/string-transformer)
        res))))


(defn-spec replace-namespaced-service-with-http-info any?
  "
  replace the specified Service"
  ([name string?, namespace string?, body v1-service, ] (replace-namespaced-service-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-service v1-service
  "
  replace the specified Service"
  ([name string?, namespace string?, body v1-service, ] (replace-namespaced-service name namespace body nil))
  ([name string?, namespace string?, body v1-service, optional-params any?]
   (let [res (:data (replace-namespaced-service-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec replace-namespaced-service-account-with-http-info any?
  "
  replace the specified ServiceAccount"
  ([name string?, namespace string?, body v1-service-account, ] (replace-namespaced-service-account-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-service-account, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-service-account v1-service-account
  "
  replace the specified ServiceAccount"
  ([name string?, namespace string?, body v1-service-account, ] (replace-namespaced-service-account name namespace body nil))
  ([name string?, namespace string?, body v1-service-account, optional-params any?]
   (let [res (:data (replace-namespaced-service-account-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service-account res st/string-transformer)
        res))))


(defn-spec replace-namespaced-service-status-with-http-info any?
  "
  replace status of the specified Service"
  ([name string?, namespace string?, body v1-service, ] (replace-namespaced-service-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-service, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-service-status v1-service
  "
  replace status of the specified Service"
  ([name string?, namespace string?, body v1-service, ] (replace-namespaced-service-status name namespace body nil))
  ([name string?, namespace string?, body v1-service, optional-params any?]
   (let [res (:data (replace-namespaced-service-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-service res st/string-transformer)
        res))))


(defn-spec replace-node-with-http-info any?
  "
  replace the specified Node"
  ([name string?, body v1-node, ] (replace-node-with-http-info name body nil))
  ([name string?, body v1-node, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/nodes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-node v1-node
  "
  replace the specified Node"
  ([name string?, body v1-node, ] (replace-node name body nil))
  ([name string?, body v1-node, optional-params any?]
   (let [res (:data (replace-node-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec replace-node-status-with-http-info any?
  "
  replace status of the specified Node"
  ([name string?, body v1-node, ] (replace-node-status-with-http-info name body nil))
  ([name string?, body v1-node, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/nodes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-node-status v1-node
  "
  replace status of the specified Node"
  ([name string?, body v1-node, ] (replace-node-status name body nil))
  ([name string?, body v1-node, optional-params any?]
   (let [res (:data (replace-node-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-node res st/string-transformer)
        res))))


(defn-spec replace-persistent-volume-with-http-info any?
  "
  replace the specified PersistentVolume"
  ([name string?, body v1-persistent-volume, ] (replace-persistent-volume-with-http-info name body nil))
  ([name string?, body v1-persistent-volume, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/persistentvolumes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-persistent-volume v1-persistent-volume
  "
  replace the specified PersistentVolume"
  ([name string?, body v1-persistent-volume, ] (replace-persistent-volume name body nil))
  ([name string?, body v1-persistent-volume, optional-params any?]
   (let [res (:data (replace-persistent-volume-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


(defn-spec replace-persistent-volume-status-with-http-info any?
  "
  replace status of the specified PersistentVolume"
  ([name string?, body v1-persistent-volume, ] (replace-persistent-volume-status-with-http-info name body nil))
  ([name string?, body v1-persistent-volume, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/api/v1/persistentvolumes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-persistent-volume-status v1-persistent-volume
  "
  replace status of the specified PersistentVolume"
  ([name string?, body v1-persistent-volume, ] (replace-persistent-volume-status name body nil))
  ([name string?, body v1-persistent-volume, optional-params any?]
   (let [res (:data (replace-persistent-volume-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-persistent-volume res st/string-transformer)
        res))))


