(ns clojure-kubernetes-client.api.settings-v1alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset-list :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset :refer :all]

            [clojure-kubernetes-client.specs.v1alpha1-pod-preset :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-pod-preset-with-http-info any?
  "
  create a PodPreset"
  ([namespace string?, body v1alpha1-pod-preset, ] (create-namespaced-pod-preset-with-http-info namespace body nil))
  ([namespace string?, body v1alpha1-pod-preset, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod-preset v1alpha1-pod-preset
  "
  create a PodPreset"
  ([namespace string?, body v1alpha1-pod-preset, ] (create-namespaced-pod-preset namespace body nil))
  ([namespace string?, body v1alpha1-pod-preset, optional-params any?]
   (let [res (:data (create-namespaced-pod-preset-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-pod-preset-with-http-info any?
  "
  delete collection of PodPreset"
  ([namespace string?, ] (delete-collection-namespaced-pod-preset-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-pod-preset v1-status
  "
  delete collection of PodPreset"
  ([namespace string?, ] (delete-collection-namespaced-pod-preset namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-pod-preset-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-pod-preset-with-http-info any?
  "
  delete a PodPreset"
  ([name string?, namespace string?, ] (delete-namespaced-pod-preset-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-pod-preset v1-status
  "
  delete a PodPreset"
  ([name string?, namespace string?, ] (delete-namespaced-pod-preset name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-pod-preset-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/settings.k8s.io/v1alpha1/" :get
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


(defn-spec list-namespaced-pod-preset-with-http-info any?
  "
  list or watch objects of kind PodPreset"
  ([namespace string?, ] (list-namespaced-pod-preset-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-pod-preset v1alpha1-pod-preset-list
  "
  list or watch objects of kind PodPreset"
  ([namespace string?, ] (list-namespaced-pod-preset namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-pod-preset-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset-list res st/string-transformer)
        res))))


(defn-spec list-pod-preset-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind PodPreset"
  ([] (list-pod-preset-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/settings.k8s.io/v1alpha1/podpresets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-preset-for-all-namespaces v1alpha1-pod-preset-list
  "
  list or watch objects of kind PodPreset"
  ([] (list-pod-preset-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-pod-preset-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-preset-with-http-info any?
  "
  partially update the specified PodPreset"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-preset-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod-preset v1alpha1-pod-preset
  "
  partially update the specified PodPreset"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-preset name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-preset-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-preset-with-http-info any?
  "
  read the specified PodPreset"
  ([name string?, namespace string?, ] (read-namespaced-pod-preset-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-preset v1alpha1-pod-preset
  "
  read the specified PodPreset"
  ([name string?, namespace string?, ] (read-namespaced-pod-preset name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-preset-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-preset-with-http-info any?
  "
  replace the specified PodPreset"
  ([name string?, namespace string?, body v1alpha1-pod-preset, ] (replace-namespaced-pod-preset-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1alpha1-pod-preset, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/settings.k8s.io/v1alpha1/namespaces/{namespace}/podpresets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod-preset v1alpha1-pod-preset
  "
  replace the specified PodPreset"
  ([name string?, namespace string?, body v1alpha1-pod-preset, ] (replace-namespaced-pod-preset name namespace body nil))
  ([name string?, namespace string?, body v1alpha1-pod-preset, optional-params any?]
   (let [res (:data (replace-namespaced-pod-preset-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1alpha1-pod-preset res st/string-transformer)
        res))))


