(ns clojure-kubernetes-client.api.batch-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-job-list :refer :all]

            [clojure-kubernetes-client.specs.v1-job-list :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]

            [clojure-kubernetes-client.specs.v1-job :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-job-with-http-info any?
  "
  create a Job"
  ([namespace string?, body v1-job, ] (create-namespaced-job-with-http-info namespace body nil))
  ([namespace string?, body v1-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-job v1-job
  "
  create a Job"
  ([namespace string?, body v1-job, ] (create-namespaced-job namespace body nil))
  ([namespace string?, body v1-job, optional-params any?]
   (let [res (:data (create-namespaced-job-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-job-with-http-info any?
  "
  delete collection of Job"
  ([namespace string?, ] (delete-collection-namespaced-job-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-job v1-status
  "
  delete collection of Job"
  ([namespace string?, ] (delete-collection-namespaced-job namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-job-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-job-with-http-info any?
  "
  delete a Job"
  ([name string?, namespace string?, ] (delete-namespaced-job-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-job v1-status
  "
  delete a Job"
  ([name string?, namespace string?, ] (delete-namespaced-job name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-job-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/batch/v1/" :get
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


(defn-spec list-job-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Job"
  ([] (list-job-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/batch/v1/jobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-job-for-all-namespaces v1-job-list
  "
  list or watch objects of kind Job"
  ([] (list-job-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-job-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-job-with-http-info any?
  "
  list or watch objects of kind Job"
  ([namespace string?, ] (list-namespaced-job-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-job v1-job-list
  "
  list or watch objects of kind Job"
  ([namespace string?, ] (list-namespaced-job namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-job-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-job-with-http-info any?
  "
  partially update the specified Job"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-job-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-job v1-job
  "
  partially update the specified Job"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-job name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-job-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec patch-namespaced-job-status-with-http-info any?
  "
  partially update status of the specified Job"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-job-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-job-status v1-job
  "
  partially update status of the specified Job"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-job-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-job-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec read-namespaced-job-with-http-info any?
  "
  read the specified Job"
  ([name string?, namespace string?, ] (read-namespaced-job-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-job v1-job
  "
  read the specified Job"
  ([name string?, namespace string?, ] (read-namespaced-job name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-job-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec read-namespaced-job-status-with-http-info any?
  "
  read status of the specified Job"
  ([name string?, namespace string?, ] (read-namespaced-job-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-job-status v1-job
  "
  read status of the specified Job"
  ([name string?, namespace string?, ] (read-namespaced-job-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-job-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec replace-namespaced-job-with-http-info any?
  "
  replace the specified Job"
  ([name string?, namespace string?, body v1-job, ] (replace-namespaced-job-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-job v1-job
  "
  replace the specified Job"
  ([name string?, namespace string?, body v1-job, ] (replace-namespaced-job name namespace body nil))
  ([name string?, namespace string?, body v1-job, optional-params any?]
   (let [res (:data (replace-namespaced-job-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


(defn-spec replace-namespaced-job-status-with-http-info any?
  "
  replace status of the specified Job"
  ([name string?, namespace string?, body v1-job, ] (replace-namespaced-job-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-job-status v1-job
  "
  replace status of the specified Job"
  ([name string?, namespace string?, body v1-job, ] (replace-namespaced-job-status name namespace body nil))
  ([name string?, namespace string?, body v1-job, optional-params any?]
   (let [res (:data (replace-namespaced-job-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-job res st/string-transformer)
        res))))


