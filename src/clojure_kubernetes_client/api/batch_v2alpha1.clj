(ns clojure-kubernetes-client.api.batch-v2alpha1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job-list :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job-list :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]

            [clojure-kubernetes-client.specs.v2alpha1-cron-job :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-cron-job-with-http-info any?
  "
  create a CronJob"
  ([namespace string?, body v2alpha1-cron-job, ] (create-namespaced-cron-job-with-http-info namespace body nil))
  ([namespace string?, body v2alpha1-cron-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-cron-job v2alpha1-cron-job
  "
  create a CronJob"
  ([namespace string?, body v2alpha1-cron-job, ] (create-namespaced-cron-job namespace body nil))
  ([namespace string?, body v2alpha1-cron-job, optional-params any?]
   (let [res (:data (create-namespaced-cron-job-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-cron-job-with-http-info any?
  "
  delete collection of CronJob"
  ([namespace string?, ] (delete-collection-namespaced-cron-job-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-cron-job v1-status
  "
  delete collection of CronJob"
  ([namespace string?, ] (delete-collection-namespaced-cron-job namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-cron-job-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-cron-job-with-http-info any?
  "
  delete a CronJob"
  ([name string?, namespace string?, ] (delete-namespaced-cron-job-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-cron-job v1-status
  "
  delete a CronJob"
  ([name string?, namespace string?, ] (delete-namespaced-cron-job name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-cron-job-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/batch/v2alpha1/" :get
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


(defn-spec list-cron-job-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind CronJob"
  ([] (list-cron-job-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/batch/v2alpha1/cronjobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cron-job-for-all-namespaces v2alpha1-cron-job-list
  "
  list or watch objects of kind CronJob"
  ([] (list-cron-job-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-cron-job-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-cron-job-with-http-info any?
  "
  list or watch objects of kind CronJob"
  ([namespace string?, ] (list-namespaced-cron-job-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-cron-job v2alpha1-cron-job-list
  "
  list or watch objects of kind CronJob"
  ([namespace string?, ] (list-namespaced-cron-job namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-cron-job-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-cron-job-with-http-info any?
  "
  partially update the specified CronJob"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-cron-job-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-cron-job v2alpha1-cron-job
  "
  partially update the specified CronJob"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-cron-job name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-cron-job-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec patch-namespaced-cron-job-status-with-http-info any?
  "
  partially update status of the specified CronJob"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-cron-job-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-cron-job-status v2alpha1-cron-job
  "
  partially update status of the specified CronJob"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-cron-job-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-cron-job-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec read-namespaced-cron-job-with-http-info any?
  "
  read the specified CronJob"
  ([name string?, namespace string?, ] (read-namespaced-cron-job-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-cron-job v2alpha1-cron-job
  "
  read the specified CronJob"
  ([name string?, namespace string?, ] (read-namespaced-cron-job name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-cron-job-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec read-namespaced-cron-job-status-with-http-info any?
  "
  read status of the specified CronJob"
  ([name string?, namespace string?, ] (read-namespaced-cron-job-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-cron-job-status v2alpha1-cron-job
  "
  read status of the specified CronJob"
  ([name string?, namespace string?, ] (read-namespaced-cron-job-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-cron-job-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec replace-namespaced-cron-job-with-http-info any?
  "
  replace the specified CronJob"
  ([name string?, namespace string?, body v2alpha1-cron-job, ] (replace-namespaced-cron-job-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v2alpha1-cron-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-cron-job v2alpha1-cron-job
  "
  replace the specified CronJob"
  ([name string?, namespace string?, body v2alpha1-cron-job, ] (replace-namespaced-cron-job name namespace body nil))
  ([name string?, namespace string?, body v2alpha1-cron-job, optional-params any?]
   (let [res (:data (replace-namespaced-cron-job-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


(defn-spec replace-namespaced-cron-job-status-with-http-info any?
  "
  replace status of the specified CronJob"
  ([name string?, namespace string?, body v2alpha1-cron-job, ] (replace-namespaced-cron-job-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v2alpha1-cron-job, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-cron-job-status v2alpha1-cron-job
  "
  replace status of the specified CronJob"
  ([name string?, namespace string?, body v2alpha1-cron-job, ] (replace-namespaced-cron-job-status name namespace body nil))
  ([name string?, namespace string?, body v2alpha1-cron-job, optional-params any?]
   (let [res (:data (replace-namespaced-cron-job-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v2alpha1-cron-job res st/string-transformer)
        res))))


