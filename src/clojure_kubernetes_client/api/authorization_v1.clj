(ns clojure-kubernetes-client.api.authorization-v1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-local-subject-access-review :refer :all]

            [clojure-kubernetes-client.specs.v1-self-subject-access-review :refer :all]

            [clojure-kubernetes-client.specs.v1-self-subject-rules-review :refer :all]

            [clojure-kubernetes-client.specs.v1-subject-access-review :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]
)
  (:import (java.io File)))


(defn-spec create-namespaced-local-subject-access-review-with-http-info any?
  "
  create a LocalSubjectAccessReview"
  ([namespace string?, body v1-local-subject-access-review, ] (create-namespaced-local-subject-access-review-with-http-info namespace body nil))
  ([namespace string?, body v1-local-subject-access-review, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params namespace body)
   (call-api "/apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-local-subject-access-review v1-local-subject-access-review
  "
  create a LocalSubjectAccessReview"
  ([namespace string?, body v1-local-subject-access-review, ] (create-namespaced-local-subject-access-review namespace body nil))
  ([namespace string?, body v1-local-subject-access-review, optional-params any?]
   (let [res (:data (create-namespaced-local-subject-access-review-with-http-info namespace body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-local-subject-access-review res st/string-transformer)
        res))))


(defn-spec create-self-subject-access-review-with-http-info any?
  "
  create a SelfSubjectAccessReview"
  ([body v1-self-subject-access-review, ] (create-self-subject-access-review-with-http-info body nil))
  ([body v1-self-subject-access-review, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1/selfsubjectaccessreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-self-subject-access-review v1-self-subject-access-review
  "
  create a SelfSubjectAccessReview"
  ([body v1-self-subject-access-review, ] (create-self-subject-access-review body nil))
  ([body v1-self-subject-access-review, optional-params any?]
   (let [res (:data (create-self-subject-access-review-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-self-subject-access-review res st/string-transformer)
        res))))


(defn-spec create-self-subject-rules-review-with-http-info any?
  "
  create a SelfSubjectRulesReview"
  ([body v1-self-subject-rules-review, ] (create-self-subject-rules-review-with-http-info body nil))
  ([body v1-self-subject-rules-review, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1/selfsubjectrulesreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-self-subject-rules-review v1-self-subject-rules-review
  "
  create a SelfSubjectRulesReview"
  ([body v1-self-subject-rules-review, ] (create-self-subject-rules-review body nil))
  ([body v1-self-subject-rules-review, optional-params any?]
   (let [res (:data (create-self-subject-rules-review-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-self-subject-rules-review res st/string-transformer)
        res))))


(defn-spec create-subject-access-review-with-http-info any?
  "
  create a SubjectAccessReview"
  ([body v1-subject-access-review, ] (create-subject-access-review-with-http-info body nil))
  ([body v1-subject-access-review, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1/subjectaccessreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-subject-access-review v1-subject-access-review
  "
  create a SubjectAccessReview"
  ([body v1-subject-access-review, ] (create-subject-access-review body nil))
  ([body v1-subject-access-review, optional-params any?]
   (let [res (:data (create-subject-access-review-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-subject-access-review res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/authorization.k8s.io/v1/" :get
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


