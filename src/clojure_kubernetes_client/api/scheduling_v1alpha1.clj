(ns clojure-kubernetes-client.api.scheduling-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-priority-class :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-class-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-class :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-class :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-priority-class :refer :all]
)
  (:import (java.io File)))


(defn-spec create-priority-class-with-http-info any?
  "
  create a PriorityClass"
  ([body v1alpha1-priority-class, ] (create-priority-class-with-http-info body nil))
  ([body v1alpha1-priority-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-priority-class v1alpha1-priority-class
  "
  create a PriorityClass"
  ([body v1alpha1-priority-class, ] (create-priority-class body nil))
  ([body v1alpha1-priority-class, optional-params any?]
   (let [res (:data (create-priority-class-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-class res st/string-transformer)
        res))))


(defn-spec delete-collection-priority-class-with-http-info any?
  "
  delete collection of PriorityClass"
  ([] (delete-collection-priority-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-priority-class v1-status
  "
  delete collection of PriorityClass"
  ([] (delete-collection-priority-class nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-priority-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-priority-class-with-http-info any?
  "
  delete a PriorityClass"
  ([name string?, ] (delete-priority-class-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-priority-class v1-status
  "
  delete a PriorityClass"
  ([name string?, ] (delete-priority-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-priority-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/scheduling.k8s.io/v1alpha1/" :get
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


(defn-spec list-priority-class-with-http-info any?
  "
  list or watch objects of kind PriorityClass"
  ([] (list-priority-class-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-priority-class v1alpha1-priority-class-list
  "
  list or watch objects of kind PriorityClass"
  ([] (list-priority-class nil))
  ([optional-params any?]
   (let [res (:data (list-priority-class-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-class-list res st/string-transformer)
        res))))


(defn-spec patch-priority-class-with-http-info any?
  "
  partially update the specified PriorityClass"
  ([name string?, body any?, ] (patch-priority-class-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-priority-class v1alpha1-priority-class
  "
  partially update the specified PriorityClass"
  ([name string?, body any?, ] (patch-priority-class name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-priority-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-class res st/string-transformer)
        res))))


(defn-spec read-priority-class-with-http-info any?
  "
  read the specified PriorityClass"
  ([name string?, ] (read-priority-class-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-priority-class v1alpha1-priority-class
  "
  read the specified PriorityClass"
  ([name string?, ] (read-priority-class name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-priority-class-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-class res st/string-transformer)
        res))))


(defn-spec replace-priority-class-with-http-info any?
  "
  replace the specified PriorityClass"
  ([name string?, body v1alpha1-priority-class, ] (replace-priority-class-with-http-info name body nil))
  ([name string?, body v1alpha1-priority-class, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/scheduling.k8s.io/v1alpha1/priorityclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-priority-class v1alpha1-priority-class
  "
  replace the specified PriorityClass"
  ([name string?, body v1alpha1-priority-class, ] (replace-priority-class name body nil))
  ([name string?, body v1alpha1-priority-class, optional-params any?]
   (let [res (:data (replace-priority-class-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-priority-class res st/string-transformer)
        res))))


