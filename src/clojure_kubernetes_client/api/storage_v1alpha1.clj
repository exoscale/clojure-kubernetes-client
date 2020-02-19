(ns clojure-kubernetes-client.api.storage-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-volume-attachment :refer :all]
)
  (:import (java.io File)))


(defn-spec create-volume-attachment-with-http-info any?
  "
  create a VolumeAttachment"
  ([body v1alpha1-volume-attachment, ] (create-volume-attachment-with-http-info body nil))
  ([body v1alpha1-volume-attachment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-volume-attachment v1alpha1-volume-attachment
  "
  create a VolumeAttachment"
  ([body v1alpha1-volume-attachment, ] (create-volume-attachment body nil))
  ([body v1alpha1-volume-attachment, optional-params any?]
   (let [res (:data (create-volume-attachment-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-volume-attachment res st/string-transformer)
        res))))


(defn-spec delete-collection-volume-attachment-with-http-info any?
  "
  delete collection of VolumeAttachment"
  ([] (delete-collection-volume-attachment-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-volume-attachment v1-status
  "
  delete collection of VolumeAttachment"
  ([] (delete-collection-volume-attachment nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-volume-attachment-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-volume-attachment-with-http-info any?
  "
  delete a VolumeAttachment"
  ([name string?, ] (delete-volume-attachment-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-volume-attachment v1-status
  "
  delete a VolumeAttachment"
  ([name string?, ] (delete-volume-attachment name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-volume-attachment-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/storage.k8s.io/v1alpha1/" :get
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


(defn-spec list-volume-attachment-with-http-info any?
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-volume-attachment-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-volume-attachment v1alpha1-volume-attachment-list
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-volume-attachment nil))
  ([optional-params any?]
   (let [res (:data (list-volume-attachment-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-volume-attachment-list res st/string-transformer)
        res))))


(defn-spec patch-volume-attachment-with-http-info any?
  "
  partially update the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-volume-attachment v1alpha1-volume-attachment
  "
  partially update the specified VolumeAttachment"
  ([name string?, body any?, ] (patch-volume-attachment name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-volume-attachment-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-volume-attachment res st/string-transformer)
        res))))


(defn-spec read-volume-attachment-with-http-info any?
  "
  read the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-volume-attachment v1alpha1-volume-attachment
  "
  read the specified VolumeAttachment"
  ([name string?, ] (read-volume-attachment name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-volume-attachment-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-volume-attachment res st/string-transformer)
        res))))


(defn-spec replace-volume-attachment-with-http-info any?
  "
  replace the specified VolumeAttachment"
  ([name string?, body v1alpha1-volume-attachment, ] (replace-volume-attachment-with-http-info name body nil))
  ([name string?, body v1alpha1-volume-attachment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1alpha1/volumeattachments/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-volume-attachment v1alpha1-volume-attachment
  "
  replace the specified VolumeAttachment"
  ([name string?, body v1alpha1-volume-attachment, ] (replace-volume-attachment name body nil))
  ([name string?, body v1alpha1-volume-attachment, optional-params any?]
   (let [res (:data (replace-volume-attachment-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-volume-attachment res st/string-transformer)
        res))))


