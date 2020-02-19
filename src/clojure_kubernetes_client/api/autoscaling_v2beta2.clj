(ns clojure-kubernetes-client.api.autoscaling-v2beta2
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-list :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-list :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]

            [clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  create a HorizontalPodAutoscaler"
  ([namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (create-namespaced-horizontal-pod-autoscaler-with-http-info namespace body nil))
  ([namespace string?, body v2beta2-horizontal-pod-autoscaler, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-horizontal-pod-autoscaler v2beta2-horizontal-pod-autoscaler
  "
  create a HorizontalPodAutoscaler"
  ([namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (create-namespaced-horizontal-pod-autoscaler namespace body nil))
  ([namespace string?, body v2beta2-horizontal-pod-autoscaler, optional-params any?]
   (let [res (:data (create-namespaced-horizontal-pod-autoscaler-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace string?, ] (delete-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-horizontal-pod-autoscaler v1-status
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace string?, ] (delete-collection-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  delete a HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (delete-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-horizontal-pod-autoscaler v1-status
  "
  delete a HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (delete-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/autoscaling/v2beta2/" :get
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


(defn-spec list-horizontal-pod-autoscaler-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-horizontal-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/autoscaling/v2beta2/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-horizontal-pod-autoscaler-for-all-namespaces v2beta2-horizontal-pod-autoscaler-list
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-horizontal-pod-autoscaler-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-horizontal-pod-autoscaler-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace string?, ] (list-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-horizontal-pod-autoscaler v2beta2-horizontal-pod-autoscaler-list
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace string?, ] (list-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-horizontal-pod-autoscaler v2beta2-horizontal-pod-autoscaler
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec patch-namespaced-horizontal-pod-autoscaler-status-with-http-info any?
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-horizontal-pod-autoscaler-status v2beta2-horizontal-pod-autoscaler
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec read-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  read the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (read-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-horizontal-pod-autoscaler v2beta2-horizontal-pod-autoscaler
  "
  read the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (read-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec read-namespaced-horizontal-pod-autoscaler-status-with-http-info any?
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (read-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-horizontal-pod-autoscaler-status v2beta2-horizontal-pod-autoscaler
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, ] (read-namespaced-horizontal-pod-autoscaler-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec replace-namespaced-horizontal-pod-autoscaler-with-http-info any?
  "
  replace the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (replace-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-horizontal-pod-autoscaler v2beta2-horizontal-pod-autoscaler
  "
  replace the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (replace-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, optional-params any?]
   (let [res (:data (replace-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


(defn-spec replace-namespaced-horizontal-pod-autoscaler-status-with-http-info any?
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (replace-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-horizontal-pod-autoscaler-status v2beta2-horizontal-pod-autoscaler
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, ] (replace-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name string?, namespace string?, body v2beta2-horizontal-pod-autoscaler, optional-params any?]
   (let [res (:data (replace-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2beta2-horizontal-pod-autoscaler res st/string-transformer)
        res))))


