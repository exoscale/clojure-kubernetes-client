(ns clojure-kubernetes-client.api.apps-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision-list :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision-list :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-controller-revision :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-deployment :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]

            [clojure-kubernetes-client.specs.apps-v1beta1-scale :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-controller-revision-with-http-info any?
  "
  create a ControllerRevision"
  ([namespace string?, body v1beta1-controller-revision, ] (create-namespaced-controller-revision-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-controller-revision, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-controller-revision v1beta1-controller-revision
  "
  create a ControllerRevision"
  ([namespace string?, body v1beta1-controller-revision, ] (create-namespaced-controller-revision namespace body nil))
  ([namespace string?, body v1beta1-controller-revision, optional-params any?]
   (let [res (:data (create-namespaced-controller-revision-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision res st/string-transformer)
        res))))


(defn-spec create-namespaced-deployment-with-http-info any?
  "
  create a Deployment"
  ([namespace string?, body apps-v1beta1-deployment, ] (create-namespaced-deployment-with-http-info namespace body nil))
  ([namespace string?, body apps-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-deployment apps-v1beta1-deployment
  "
  create a Deployment"
  ([namespace string?, body apps-v1beta1-deployment, ] (create-namespaced-deployment namespace body nil))
  ([namespace string?, body apps-v1beta1-deployment, optional-params any?]
   (let [res (:data (create-namespaced-deployment-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec create-namespaced-deployment-rollback-with-http-info any?
  "
  create rollback of a Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment-rollback, ] (create-namespaced-deployment-rollback-with-http-info name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment-rollback, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/rollback" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-deployment-rollback v1-status
  "
  create rollback of a Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment-rollback, ] (create-namespaced-deployment-rollback name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment-rollback, optional-params any?]
   (let [res (:data (create-namespaced-deployment-rollback-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec create-namespaced-stateful-set-with-http-info any?
  "
  create a StatefulSet"
  ([namespace string?, body v1beta1-stateful-set, ] (create-namespaced-stateful-set-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-stateful-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-stateful-set v1beta1-stateful-set
  "
  create a StatefulSet"
  ([namespace string?, body v1beta1-stateful-set, ] (create-namespaced-stateful-set namespace body nil))
  ([namespace string?, body v1beta1-stateful-set, optional-params any?]
   (let [res (:data (create-namespaced-stateful-set-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-controller-revision-with-http-info any?
  "
  delete collection of ControllerRevision"
  ([namespace string?, ] (delete-collection-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-controller-revision v1-status
  "
  delete collection of ControllerRevision"
  ([namespace string?, ] (delete-collection-namespaced-controller-revision namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-controller-revision-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-deployment-with-http-info any?
  "
  delete collection of Deployment"
  ([namespace string?, ] (delete-collection-namespaced-deployment-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-deployment v1-status
  "
  delete collection of Deployment"
  ([namespace string?, ] (delete-collection-namespaced-deployment namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-deployment-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-stateful-set-with-http-info any?
  "
  delete collection of StatefulSet"
  ([namespace string?, ] (delete-collection-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-stateful-set v1-status
  "
  delete collection of StatefulSet"
  ([namespace string?, ] (delete-collection-namespaced-stateful-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-stateful-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-controller-revision-with-http-info any?
  "
  delete a ControllerRevision"
  ([name string?, namespace string?, ] (delete-namespaced-controller-revision-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-controller-revision v1-status
  "
  delete a ControllerRevision"
  ([name string?, namespace string?, ] (delete-namespaced-controller-revision name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-controller-revision-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-deployment-with-http-info any?
  "
  delete a Deployment"
  ([name string?, namespace string?, ] (delete-namespaced-deployment-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-deployment v1-status
  "
  delete a Deployment"
  ([name string?, namespace string?, ] (delete-namespaced-deployment name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-deployment-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-stateful-set-with-http-info any?
  "
  delete a StatefulSet"
  ([name string?, namespace string?, ] (delete-namespaced-stateful-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-stateful-set v1-status
  "
  delete a StatefulSet"
  ([name string?, namespace string?, ] (delete-namespaced-stateful-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-stateful-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/apps/v1beta1/" :get
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


(defn-spec list-controller-revision-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-controller-revision-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/apps/v1beta1/controllerrevisions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-controller-revision-for-all-namespaces v1beta1-controller-revision-list
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-controller-revision-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-controller-revision-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision-list res st/string-transformer)
        res))))


(defn-spec list-deployment-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind Deployment"
  ([] (list-deployment-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/apps/v1beta1/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-deployment-for-all-namespaces apps-v1beta1-deployment-list
  "
  list or watch objects of kind Deployment"
  ([] (list-deployment-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-deployment-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-controller-revision-with-http-info any?
  "
  list or watch objects of kind ControllerRevision"
  ([namespace string?, ] (list-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-controller-revision v1beta1-controller-revision-list
  "
  list or watch objects of kind ControllerRevision"
  ([namespace string?, ] (list-namespaced-controller-revision namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-controller-revision-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-deployment-with-http-info any?
  "
  list or watch objects of kind Deployment"
  ([namespace string?, ] (list-namespaced-deployment-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-deployment apps-v1beta1-deployment-list
  "
  list or watch objects of kind Deployment"
  ([namespace string?, ] (list-namespaced-deployment namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-deployment-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment-list res st/string-transformer)
        res))))


(defn-spec list-namespaced-stateful-set-with-http-info any?
  "
  list or watch objects of kind StatefulSet"
  ([namespace string?, ] (list-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-stateful-set v1beta1-stateful-set-list
  "
  list or watch objects of kind StatefulSet"
  ([namespace string?, ] (list-namespaced-stateful-set namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-stateful-set-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set-list res st/string-transformer)
        res))))


(defn-spec list-stateful-set-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind StatefulSet"
  ([] (list-stateful-set-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/apps/v1beta1/statefulsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-stateful-set-for-all-namespaces v1beta1-stateful-set-list
  "
  list or watch objects of kind StatefulSet"
  ([] (list-stateful-set-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-stateful-set-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-controller-revision-with-http-info any?
  "
  partially update the specified ControllerRevision"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-controller-revision v1beta1-controller-revision
  "
  partially update the specified ControllerRevision"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-controller-revision name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-controller-revision-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-with-http-info any?
  "
  partially update the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment apps-v1beta1-deployment
  "
  partially update the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-scale-with-http-info any?
  "
  partially update scale of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment-scale apps-v1beta1-scale
  "
  partially update scale of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec patch-namespaced-deployment-status-with-http-info any?
  "
  partially update status of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-deployment-status apps-v1beta1-deployment
  "
  partially update status of the specified Deployment"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-deployment-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-deployment-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec patch-namespaced-stateful-set-with-http-info any?
  "
  partially update the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-stateful-set v1beta1-stateful-set
  "
  partially update the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-stateful-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec patch-namespaced-stateful-set-scale-with-http-info any?
  "
  partially update scale of the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-stateful-set-scale apps-v1beta1-scale
  "
  partially update scale of the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set-scale name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec patch-namespaced-stateful-set-status-with-http-info any?
  "
  partially update status of the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-stateful-set-status v1beta1-stateful-set
  "
  partially update status of the specified StatefulSet"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-stateful-set-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-stateful-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-controller-revision-with-http-info any?
  "
  read the specified ControllerRevision"
  ([name string?, namespace string?, ] (read-namespaced-controller-revision-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-controller-revision v1beta1-controller-revision
  "
  read the specified ControllerRevision"
  ([name string?, namespace string?, ] (read-namespaced-controller-revision name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-controller-revision-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-with-http-info any?
  "
  read the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment apps-v1beta1-deployment
  "
  read the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-scale-with-http-info any?
  "
  read scale of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment-scale apps-v1beta1-scale
  "
  read scale of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec read-namespaced-deployment-status-with-http-info any?
  "
  read status of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-deployment-status apps-v1beta1-deployment
  "
  read status of the specified Deployment"
  ([name string?, namespace string?, ] (read-namespaced-deployment-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-deployment-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec read-namespaced-stateful-set-with-http-info any?
  "
  read the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-stateful-set v1beta1-stateful-set
  "
  read the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-stateful-set-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec read-namespaced-stateful-set-scale-with-http-info any?
  "
  read scale of the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set-scale-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-stateful-set-scale apps-v1beta1-scale
  "
  read scale of the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set-scale name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-stateful-set-scale-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec read-namespaced-stateful-set-status-with-http-info any?
  "
  read status of the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-stateful-set-status v1beta1-stateful-set
  "
  read status of the specified StatefulSet"
  ([name string?, namespace string?, ] (read-namespaced-stateful-set-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-stateful-set-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-controller-revision-with-http-info any?
  "
  replace the specified ControllerRevision"
  ([name string?, namespace string?, body v1beta1-controller-revision, ] (replace-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-controller-revision, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-controller-revision v1beta1-controller-revision
  "
  replace the specified ControllerRevision"
  ([name string?, namespace string?, body v1beta1-controller-revision, ] (replace-namespaced-controller-revision name namespace body nil))
  ([name string?, namespace string?, body v1beta1-controller-revision, optional-params any?]
   (let [res (:data (replace-namespaced-controller-revision-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-controller-revision res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-with-http-info any?
  "
  replace the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment, ] (replace-namespaced-deployment-with-http-info name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment apps-v1beta1-deployment
  "
  replace the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment, ] (replace-namespaced-deployment name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-scale-with-http-info any?
  "
  replace scale of the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-scale, ] (replace-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment-scale apps-v1beta1-scale
  "
  replace scale of the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-scale, ] (replace-namespaced-deployment-scale name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec replace-namespaced-deployment-status-with-http-info any?
  "
  replace status of the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment, ] (replace-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-deployment-status apps-v1beta1-deployment
  "
  replace status of the specified Deployment"
  ([name string?, namespace string?, body apps-v1beta1-deployment, ] (replace-namespaced-deployment-status name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-deployment, optional-params any?]
   (let [res (:data (replace-namespaced-deployment-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-deployment res st/string-transformer)
        res))))


(defn-spec replace-namespaced-stateful-set-with-http-info any?
  "
  replace the specified StatefulSet"
  ([name string?, namespace string?, body v1beta1-stateful-set, ] (replace-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-stateful-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-stateful-set v1beta1-stateful-set
  "
  replace the specified StatefulSet"
  ([name string?, namespace string?, body v1beta1-stateful-set, ] (replace-namespaced-stateful-set name namespace body nil))
  ([name string?, namespace string?, body v1beta1-stateful-set, optional-params any?]
   (let [res (:data (replace-namespaced-stateful-set-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


(defn-spec replace-namespaced-stateful-set-scale-with-http-info any?
  "
  replace scale of the specified StatefulSet"
  ([name string?, namespace string?, body apps-v1beta1-scale, ] (replace-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-scale, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-stateful-set-scale apps-v1beta1-scale
  "
  replace scale of the specified StatefulSet"
  ([name string?, namespace string?, body apps-v1beta1-scale, ] (replace-namespaced-stateful-set-scale name namespace body nil))
  ([name string?, namespace string?, body apps-v1beta1-scale, optional-params any?]
   (let [res (:data (replace-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode apps-v1beta1-scale res st/string-transformer)
        res))))


(defn-spec replace-namespaced-stateful-set-status-with-http-info any?
  "
  replace status of the specified StatefulSet"
  ([name string?, namespace string?, body v1beta1-stateful-set, ] (replace-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-stateful-set, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-stateful-set-status v1beta1-stateful-set
  "
  replace status of the specified StatefulSet"
  ([name string?, namespace string?, body v1beta1-stateful-set, ] (replace-namespaced-stateful-set-status name namespace body nil))
  ([name string?, namespace string?, body v1beta1-stateful-set, optional-params any?]
   (let [res (:data (replace-namespaced-stateful-set-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-stateful-set res st/string-transformer)
        res))))


