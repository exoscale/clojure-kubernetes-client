(ns clojure-kubernetes-client.api.authentication-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-token-review :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]
)
  (:import (java.io File)))


(defn-spec create-token-review-with-http-info any?
  "
  create a TokenReview"
  ([body v1beta1-token-review, ] (create-token-review-with-http-info body nil))
  ([body v1beta1-token-review, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/authentication.k8s.io/v1beta1/tokenreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-token-review v1beta1-token-review
  "
  create a TokenReview"
  ([body v1beta1-token-review, ] (create-token-review body nil))
  ([body v1beta1-token-review, optional-params any?]
   (let [res (:data (create-token-review-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-token-review res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/authentication.k8s.io/v1beta1/" :get
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


