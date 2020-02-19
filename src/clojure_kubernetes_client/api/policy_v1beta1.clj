(ns clojure-kubernetes-client.api.policy-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-list :refer :all]

            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget :refer :all]

            [clojure-kubernetes-client.specs.policy-v1beta1-pod-security-policy :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-pod-disruption-budget-with-http-info any?
  "
  create a PodDisruptionBudget"
  ([namespace string?, body v1beta1-pod-disruption-budget, ] (create-namespaced-pod-disruption-budget-with-http-info namespace body nil))
  ([namespace string?, body v1beta1-pod-disruption-budget, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-pod-disruption-budget v1beta1-pod-disruption-budget
  "
  create a PodDisruptionBudget"
  ([namespace string?, body v1beta1-pod-disruption-budget, ] (create-namespaced-pod-disruption-budget namespace body nil))
  ([namespace string?, body v1beta1-pod-disruption-budget, optional-params any?]
   (let [res (:data (create-namespaced-pod-disruption-budget-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec create-pod-security-policy-with-http-info any?
  "
  create a PodSecurityPolicy"
  ([body policy-v1beta1-pod-security-policy, ] (create-pod-security-policy-with-http-info body nil))
  ([body policy-v1beta1-pod-security-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/policy/v1beta1/podsecuritypolicies" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-pod-security-policy policy-v1beta1-pod-security-policy
  "
  create a PodSecurityPolicy"
  ([body policy-v1beta1-pod-security-policy, ] (create-pod-security-policy body nil))
  ([body policy-v1beta1-pod-security-policy, optional-params any?]
   (let [res (:data (create-pod-security-policy-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode policy-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec delete-collection-namespaced-pod-disruption-budget-with-http-info any?
  "
  delete collection of PodDisruptionBudget"
  ([namespace string?, ] (delete-collection-namespaced-pod-disruption-budget-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-namespaced-pod-disruption-budget v1-status
  "
  delete collection of PodDisruptionBudget"
  ([namespace string?, ] (delete-collection-namespaced-pod-disruption-budget namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (delete-collection-namespaced-pod-disruption-budget-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-pod-security-policy-with-http-info any?
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-collection-pod-security-policy-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/policy/v1beta1/podsecuritypolicies" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-pod-security-policy v1-status
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-collection-pod-security-policy nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-pod-security-policy-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-namespaced-pod-disruption-budget-with-http-info any?
  "
  delete a PodDisruptionBudget"
  ([name string?, namespace string?, ] (delete-namespaced-pod-disruption-budget-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-pod-disruption-budget v1-status
  "
  delete a PodDisruptionBudget"
  ([name string?, namespace string?, ] (delete-namespaced-pod-disruption-budget name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (delete-namespaced-pod-disruption-budget-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-pod-security-policy-with-http-info any?
  "
  delete a PodSecurityPolicy"
  ([name string?, ] (delete-pod-security-policy-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/policy/v1beta1/podsecuritypolicies/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-pod-security-policy v1-status
  "
  delete a PodSecurityPolicy"
  ([name string?, ] (delete-pod-security-policy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-pod-security-policy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/policy/v1beta1/" :get
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


(defn-spec list-namespaced-pod-disruption-budget-with-http-info any?
  "
  list or watch objects of kind PodDisruptionBudget"
  ([namespace string?, ] (list-namespaced-pod-disruption-budget-with-http-info namespace nil))
  ([namespace string?, {:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params namespace)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-pod-disruption-budget v1beta1-pod-disruption-budget-list
  "
  list or watch objects of kind PodDisruptionBudget"
  ([namespace string?, ] (list-namespaced-pod-disruption-budget namespace nil))
  ([namespace string?, optional-params any?]
   (let [res (:data (list-namespaced-pod-disruption-budget-with-http-info namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget-list res st/string-transformer)
        res))))


(defn-spec list-pod-disruption-budget-for-all-namespaces-with-http-info any?
  "
  list or watch objects of kind PodDisruptionBudget"
  ([] (list-pod-disruption-budget-for-all-namespaces-with-http-info nil))
  ([{:keys [allowWatchBookmarks continue fieldSelector labelSelector limit pretty resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/policy/v1beta1/poddisruptionbudgets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "pretty" pretty "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-disruption-budget-for-all-namespaces v1beta1-pod-disruption-budget-list
  "
  list or watch objects of kind PodDisruptionBudget"
  ([] (list-pod-disruption-budget-for-all-namespaces nil))
  ([optional-params any?]
   (let [res (:data (list-pod-disruption-budget-for-all-namespaces-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget-list res st/string-transformer)
        res))))


(defn-spec list-pod-security-policy-with-http-info any?
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-pod-security-policy-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/policy/v1beta1/podsecuritypolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-pod-security-policy policy-v1beta1-pod-security-policy-list
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-pod-security-policy nil))
  ([optional-params any?]
   (let [res (:data (list-pod-security-policy-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode policy-v1beta1-pod-security-policy-list res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-disruption-budget-with-http-info any?
  "
  partially update the specified PodDisruptionBudget"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-disruption-budget-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod-disruption-budget v1beta1-pod-disruption-budget
  "
  partially update the specified PodDisruptionBudget"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-disruption-budget name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-disruption-budget-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec patch-namespaced-pod-disruption-budget-status-with-http-info any?
  "
  partially update status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-disruption-budget-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-namespaced-pod-disruption-budget-status v1beta1-pod-disruption-budget
  "
  partially update status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, body any?, ] (patch-namespaced-pod-disruption-budget-status name namespace body nil))
  ([name string?, namespace string?, body any?, optional-params any?]
   (let [res (:data (patch-namespaced-pod-disruption-budget-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec patch-pod-security-policy-with-http-info any?
  "
  partially update the specified PodSecurityPolicy"
  ([name string?, body any?, ] (patch-pod-security-policy-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/policy/v1beta1/podsecuritypolicies/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-pod-security-policy policy-v1beta1-pod-security-policy
  "
  partially update the specified PodSecurityPolicy"
  ([name string?, body any?, ] (patch-pod-security-policy name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-pod-security-policy-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode policy-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-disruption-budget-with-http-info any?
  "
  read the specified PodDisruptionBudget"
  ([name string?, namespace string?, ] (read-namespaced-pod-disruption-budget-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-disruption-budget v1beta1-pod-disruption-budget
  "
  read the specified PodDisruptionBudget"
  ([name string?, namespace string?, ] (read-namespaced-pod-disruption-budget name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-disruption-budget-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec read-namespaced-pod-disruption-budget-status-with-http-info any?
  "
  read status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, ] (read-namespaced-pod-disruption-budget-status-with-http-info name namespace nil))
  ([name string?, namespace string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name namespace)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-namespaced-pod-disruption-budget-status v1beta1-pod-disruption-budget
  "
  read status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, ] (read-namespaced-pod-disruption-budget-status name namespace nil))
  ([name string?, namespace string?, optional-params any?]
   (let [res (:data (read-namespaced-pod-disruption-budget-status-with-http-info name namespace optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec read-pod-security-policy-with-http-info any?
  "
  read the specified PodSecurityPolicy"
  ([name string?, ] (read-pod-security-policy-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/policy/v1beta1/podsecuritypolicies/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-pod-security-policy policy-v1beta1-pod-security-policy
  "
  read the specified PodSecurityPolicy"
  ([name string?, ] (read-pod-security-policy name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-pod-security-policy-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode policy-v1beta1-pod-security-policy res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-disruption-budget-with-http-info any?
  "
  replace the specified PodDisruptionBudget"
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, ] (replace-namespaced-pod-disruption-budget-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod-disruption-budget v1beta1-pod-disruption-budget
  "
  replace the specified PodDisruptionBudget"
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, ] (replace-namespaced-pod-disruption-budget name namespace body nil))
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, optional-params any?]
   (let [res (:data (replace-namespaced-pod-disruption-budget-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec replace-namespaced-pod-disruption-budget-status-with-http-info any?
  "
  replace status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, ] (replace-namespaced-pod-disruption-budget-status-with-http-info name namespace body nil))
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name namespace body)
   (call-api "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-namespaced-pod-disruption-budget-status v1beta1-pod-disruption-budget
  "
  replace status of the specified PodDisruptionBudget"
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, ] (replace-namespaced-pod-disruption-budget-status name namespace body nil))
  ([name string?, namespace string?, body v1beta1-pod-disruption-budget, optional-params any?]
   (let [res (:data (replace-namespaced-pod-disruption-budget-status-with-http-info name namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-pod-disruption-budget res st/string-transformer)
        res))))


(defn-spec replace-pod-security-policy-with-http-info any?
  "
  replace the specified PodSecurityPolicy"
  ([name string?, body policy-v1beta1-pod-security-policy, ] (replace-pod-security-policy-with-http-info name body nil))
  ([name string?, body policy-v1beta1-pod-security-policy, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/policy/v1beta1/podsecuritypolicies/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-pod-security-policy policy-v1beta1-pod-security-policy
  "
  replace the specified PodSecurityPolicy"
  ([name string?, body policy-v1beta1-pod-security-policy, ] (replace-pod-security-policy name body nil))
  ([name string?, body policy-v1beta1-pod-security-policy, optional-params any?]
   (let [res (:data (replace-pod-security-policy-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode policy-v1beta1-pod-security-policy res st/string-transformer)
        res))))


