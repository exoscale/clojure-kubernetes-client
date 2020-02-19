(ns clojure-kubernetes-client.api.auditregistration-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-audit-sink-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-audit-sink :refer :all]
)
  (:import (java.io File)))


(defn-spec create-audit-sink-with-http-info any?
  "
  create an AuditSink"
  ([body v1alpha1-audit-sink, ] (create-audit-sink-with-http-info body nil))
  ([body v1alpha1-audit-sink, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-audit-sink v1alpha1-audit-sink
  "
  create an AuditSink"
  ([body v1alpha1-audit-sink, ] (create-audit-sink body nil))
  ([body v1alpha1-audit-sink, optional-params any?]
   (let [res (:data (create-audit-sink-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-audit-sink res st/string-transformer)
        res))))


(defn-spec delete-audit-sink-with-http-info any?
  "
  delete an AuditSink"
  ([name string?, ] (delete-audit-sink-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-audit-sink v1-status
  "
  delete an AuditSink"
  ([name string?, ] (delete-audit-sink name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-audit-sink-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-audit-sink-with-http-info any?
  "
  delete collection of AuditSink"
  ([] (delete-collection-audit-sink-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-audit-sink v1-status
  "
  delete collection of AuditSink"
  ([] (delete-collection-audit-sink nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-audit-sink-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/auditregistration.k8s.io/v1alpha1/" :get
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


(defn-spec list-audit-sink-with-http-info any?
  "
  list or watch objects of kind AuditSink"
  ([] (list-audit-sink-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-audit-sink v1alpha1-audit-sink-list
  "
  list or watch objects of kind AuditSink"
  ([] (list-audit-sink nil))
  ([optional-params any?]
   (let [res (:data (list-audit-sink-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-audit-sink-list res st/string-transformer)
        res))))


(defn-spec patch-audit-sink-with-http-info any?
  "
  partially update the specified AuditSink"
  ([name string?, body any?, ] (patch-audit-sink-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-audit-sink v1alpha1-audit-sink
  "
  partially update the specified AuditSink"
  ([name string?, body any?, ] (patch-audit-sink name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-audit-sink-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-audit-sink res st/string-transformer)
        res))))


(defn-spec read-audit-sink-with-http-info any?
  "
  read the specified AuditSink"
  ([name string?, ] (read-audit-sink-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-audit-sink v1alpha1-audit-sink
  "
  read the specified AuditSink"
  ([name string?, ] (read-audit-sink name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-audit-sink-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-audit-sink res st/string-transformer)
        res))))


(defn-spec replace-audit-sink-with-http-info any?
  "
  replace the specified AuditSink"
  ([name string?, body v1alpha1-audit-sink, ] (replace-audit-sink-with-http-info name body nil))
  ([name string?, body v1alpha1-audit-sink, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/auditregistration.k8s.io/v1alpha1/auditsinks/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-audit-sink v1alpha1-audit-sink
  "
  replace the specified AuditSink"
  ([name string?, body v1alpha1-audit-sink, ] (replace-audit-sink name body nil))
  ([name string?, body v1alpha1-audit-sink, optional-params any?]
   (let [res (:data (replace-audit-sink-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-audit-sink res st/string-transformer)
        res))))


