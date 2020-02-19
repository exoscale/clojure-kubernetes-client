(ns clojure-kubernetes-client.api.admissionregistration-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration-list :refer :all]

            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration-list :refer :all]

            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-mutating-webhook-configuration :refer :all]

            [clojure-kubernetes-client.specs.v1-validating-webhook-configuration :refer :all]
)
  (:import (java.io File)))


(defn-spec create-mutating-webhook-configuration-with-http-info any?
  "
  create a MutatingWebhookConfiguration"
  ([body v1-mutating-webhook-configuration, ] (create-mutating-webhook-configuration-with-http-info body nil))
  ([body v1-mutating-webhook-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-mutating-webhook-configuration v1-mutating-webhook-configuration
  "
  create a MutatingWebhookConfiguration"
  ([body v1-mutating-webhook-configuration, ] (create-mutating-webhook-configuration body nil))
  ([body v1-mutating-webhook-configuration, optional-params any?]
   (let [res (:data (create-mutating-webhook-configuration-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-mutating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec create-validating-webhook-configuration-with-http-info any?
  "
  create a ValidatingWebhookConfiguration"
  ([body v1-validating-webhook-configuration, ] (create-validating-webhook-configuration-with-http-info body nil))
  ([body v1-validating-webhook-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-validating-webhook-configuration v1-validating-webhook-configuration
  "
  create a ValidatingWebhookConfiguration"
  ([body v1-validating-webhook-configuration, ] (create-validating-webhook-configuration body nil))
  ([body v1-validating-webhook-configuration, optional-params any?]
   (let [res (:data (create-validating-webhook-configuration-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-validating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec delete-collection-mutating-webhook-configuration-with-http-info any?
  "
  delete collection of MutatingWebhookConfiguration"
  ([] (delete-collection-mutating-webhook-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-mutating-webhook-configuration v1-status
  "
  delete collection of MutatingWebhookConfiguration"
  ([] (delete-collection-mutating-webhook-configuration nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-mutating-webhook-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-validating-webhook-configuration-with-http-info any?
  "
  delete collection of ValidatingWebhookConfiguration"
  ([] (delete-collection-validating-webhook-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-validating-webhook-configuration v1-status
  "
  delete collection of ValidatingWebhookConfiguration"
  ([] (delete-collection-validating-webhook-configuration nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-validating-webhook-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-mutating-webhook-configuration-with-http-info any?
  "
  delete a MutatingWebhookConfiguration"
  ([name string?, ] (delete-mutating-webhook-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-mutating-webhook-configuration v1-status
  "
  delete a MutatingWebhookConfiguration"
  ([name string?, ] (delete-mutating-webhook-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-mutating-webhook-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-validating-webhook-configuration-with-http-info any?
  "
  delete a ValidatingWebhookConfiguration"
  ([name string?, ] (delete-validating-webhook-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-validating-webhook-configuration v1-status
  "
  delete a ValidatingWebhookConfiguration"
  ([name string?, ] (delete-validating-webhook-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-validating-webhook-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/admissionregistration.k8s.io/v1/" :get
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


(defn-spec list-mutating-webhook-configuration-with-http-info any?
  "
  list or watch objects of kind MutatingWebhookConfiguration"
  ([] (list-mutating-webhook-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-mutating-webhook-configuration v1-mutating-webhook-configuration-list
  "
  list or watch objects of kind MutatingWebhookConfiguration"
  ([] (list-mutating-webhook-configuration nil))
  ([optional-params any?]
   (let [res (:data (list-mutating-webhook-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-mutating-webhook-configuration-list res st/string-transformer)
        res))))


(defn-spec list-validating-webhook-configuration-with-http-info any?
  "
  list or watch objects of kind ValidatingWebhookConfiguration"
  ([] (list-validating-webhook-configuration-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-validating-webhook-configuration v1-validating-webhook-configuration-list
  "
  list or watch objects of kind ValidatingWebhookConfiguration"
  ([] (list-validating-webhook-configuration nil))
  ([optional-params any?]
   (let [res (:data (list-validating-webhook-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-validating-webhook-configuration-list res st/string-transformer)
        res))))


(defn-spec patch-mutating-webhook-configuration-with-http-info any?
  "
  partially update the specified MutatingWebhookConfiguration"
  ([name string?, body any?, ] (patch-mutating-webhook-configuration-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-mutating-webhook-configuration v1-mutating-webhook-configuration
  "
  partially update the specified MutatingWebhookConfiguration"
  ([name string?, body any?, ] (patch-mutating-webhook-configuration name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-mutating-webhook-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-mutating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec patch-validating-webhook-configuration-with-http-info any?
  "
  partially update the specified ValidatingWebhookConfiguration"
  ([name string?, body any?, ] (patch-validating-webhook-configuration-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-validating-webhook-configuration v1-validating-webhook-configuration
  "
  partially update the specified ValidatingWebhookConfiguration"
  ([name string?, body any?, ] (patch-validating-webhook-configuration name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-validating-webhook-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-validating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec read-mutating-webhook-configuration-with-http-info any?
  "
  read the specified MutatingWebhookConfiguration"
  ([name string?, ] (read-mutating-webhook-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-mutating-webhook-configuration v1-mutating-webhook-configuration
  "
  read the specified MutatingWebhookConfiguration"
  ([name string?, ] (read-mutating-webhook-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-mutating-webhook-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-mutating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec read-validating-webhook-configuration-with-http-info any?
  "
  read the specified ValidatingWebhookConfiguration"
  ([name string?, ] (read-validating-webhook-configuration-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-validating-webhook-configuration v1-validating-webhook-configuration
  "
  read the specified ValidatingWebhookConfiguration"
  ([name string?, ] (read-validating-webhook-configuration name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-validating-webhook-configuration-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-validating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec replace-mutating-webhook-configuration-with-http-info any?
  "
  replace the specified MutatingWebhookConfiguration"
  ([name string?, body v1-mutating-webhook-configuration, ] (replace-mutating-webhook-configuration-with-http-info name body nil))
  ([name string?, body v1-mutating-webhook-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1/mutatingwebhookconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-mutating-webhook-configuration v1-mutating-webhook-configuration
  "
  replace the specified MutatingWebhookConfiguration"
  ([name string?, body v1-mutating-webhook-configuration, ] (replace-mutating-webhook-configuration name body nil))
  ([name string?, body v1-mutating-webhook-configuration, optional-params any?]
   (let [res (:data (replace-mutating-webhook-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-mutating-webhook-configuration res st/string-transformer)
        res))))


(defn-spec replace-validating-webhook-configuration-with-http-info any?
  "
  replace the specified ValidatingWebhookConfiguration"
  ([name string?, body v1-validating-webhook-configuration, ] (replace-validating-webhook-configuration-with-http-info name body nil))
  ([name string?, body v1-validating-webhook-configuration, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1/validatingwebhookconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-validating-webhook-configuration v1-validating-webhook-configuration
  "
  replace the specified ValidatingWebhookConfiguration"
  ([name string?, body v1-validating-webhook-configuration, ] (replace-validating-webhook-configuration name body nil))
  ([name string?, body v1-validating-webhook-configuration, optional-params any?]
   (let [res (:data (replace-validating-webhook-configuration-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-validating-webhook-configuration res st/string-transformer)
        res))))


