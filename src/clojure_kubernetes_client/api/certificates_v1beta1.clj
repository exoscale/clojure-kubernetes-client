(ns clojure-kubernetes-client.api.certificates-v1beta1
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-status :refer :all]

            [clojure-kubernetes-client.specs.v1-api-resource-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request-list :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]

            [clojure-kubernetes-client.specs.v1beta1-certificate-signing-request :refer :all]
)
  (:import (java.io File)))


(defn-spec create-certificate-signing-request-with-http-info any?
  "
  create a CertificateSigningRequest"
  ([body v1beta1-certificate-signing-request, ] (create-certificate-signing-request-with-http-info body nil))
  ([body v1beta1-certificate-signing-request, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-certificate-signing-request v1beta1-certificate-signing-request
  "
  create a CertificateSigningRequest"
  ([body v1beta1-certificate-signing-request, ] (create-certificate-signing-request body nil))
  ([body v1beta1-certificate-signing-request, optional-params any?]
   (let [res (:data (create-certificate-signing-request-with-http-info body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec delete-certificate-signing-request-with-http-info any?
  "
  delete a CertificateSigningRequest"
  ([name string?, ] (delete-certificate-signing-request-with-http-info name nil))
  ([name string?, {:keys [pretty dryRun gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-certificate-signing-request v1-status
  "
  delete a CertificateSigningRequest"
  ([name string?, ] (delete-certificate-signing-request name nil))
  ([name string?, optional-params any?]
   (let [res (:data (delete-certificate-signing-request-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec delete-collection-certificate-signing-request-with-http-info any?
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-collection-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue dryRun fieldSelector gracePeriodSeconds labelSelector limit orphanDependents propagationPolicy resourceVersion timeoutSeconds watch body]} (s/map-of keyword? any?)]
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "dryRun" dryRun "fieldSelector" fieldSelector "gracePeriodSeconds" gracePeriodSeconds "labelSelector" labelSelector "limit" limit "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-collection-certificate-signing-request v1-status
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-collection-certificate-signing-request nil))
  ([optional-params any?]
   (let [res (:data (delete-collection-certificate-signing-request-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1-status res st/string-transformer)
        res))))


(defn-spec get-api-resources-with-http-info any?
  "
  get available resources"
  []
  (call-api "/apis/certificates.k8s.io/v1beta1/" :get
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


(defn-spec list-certificate-signing-request-with-http-info any?
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty allowWatchBookmarks continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allowWatchBookmarks "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-certificate-signing-request v1beta1-certificate-signing-request-list
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificate-signing-request nil))
  ([optional-params any?]
   (let [res (:data (list-certificate-signing-request-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request-list res st/string-transformer)
        res))))


(defn-spec patch-certificate-signing-request-with-http-info any?
  "
  partially update the specified CertificateSigningRequest"
  ([name string?, body any?, ] (patch-certificate-signing-request-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-certificate-signing-request v1beta1-certificate-signing-request
  "
  partially update the specified CertificateSigningRequest"
  ([name string?, body any?, ] (patch-certificate-signing-request name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-certificate-signing-request-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec patch-certificate-signing-request-status-with-http-info any?
  "
  partially update status of the specified CertificateSigningRequest"
  ([name string?, body any?, ] (patch-certificate-signing-request-status-with-http-info name body nil))
  ([name string?, body any?, {:keys [pretty dryRun fieldManager force]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec patch-certificate-signing-request-status v1beta1-certificate-signing-request
  "
  partially update status of the specified CertificateSigningRequest"
  ([name string?, body any?, ] (patch-certificate-signing-request-status name body nil))
  ([name string?, body any?, optional-params any?]
   (let [res (:data (patch-certificate-signing-request-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec read-certificate-signing-request-with-http-info any?
  "
  read the specified CertificateSigningRequest"
  ([name string?, ] (read-certificate-signing-request-with-http-info name nil))
  ([name string?, {:keys [pretty exact export]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-certificate-signing-request v1beta1-certificate-signing-request
  "
  read the specified CertificateSigningRequest"
  ([name string?, ] (read-certificate-signing-request name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-certificate-signing-request-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec read-certificate-signing-request-status-with-http-info any?
  "
  read status of the specified CertificateSigningRequest"
  ([name string?, ] (read-certificate-signing-request-status-with-http-info name nil))
  ([name string?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec read-certificate-signing-request-status v1beta1-certificate-signing-request
  "
  read status of the specified CertificateSigningRequest"
  ([name string?, ] (read-certificate-signing-request-status name nil))
  ([name string?, optional-params any?]
   (let [res (:data (read-certificate-signing-request-status-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec replace-certificate-signing-request-with-http-info any?
  "
  replace the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request-with-http-info name body nil))
  ([name string?, body v1beta1-certificate-signing-request, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-certificate-signing-request v1beta1-certificate-signing-request
  "
  replace the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request name body nil))
  ([name string?, body v1beta1-certificate-signing-request, optional-params any?]
   (let [res (:data (replace-certificate-signing-request-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec replace-certificate-signing-request-approval-with-http-info any?
  "
  replace approval of the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request-approval-with-http-info name body nil))
  ([name string?, body v1beta1-certificate-signing-request, {:keys [dryRun fieldManager pretty]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/approval" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"dryRun" dryRun "fieldManager" fieldManager "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-certificate-signing-request-approval v1beta1-certificate-signing-request
  "
  replace approval of the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request-approval name body nil))
  ([name string?, body v1beta1-certificate-signing-request, optional-params any?]
   (let [res (:data (replace-certificate-signing-request-approval-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


(defn-spec replace-certificate-signing-request-status-with-http-info any?
  "
  replace status of the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request-status-with-http-info name body nil))
  ([name string?, body v1beta1-certificate-signing-request, {:keys [pretty dryRun fieldManager]} (s/map-of keyword? any?)]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dryRun "fieldManager" fieldManager }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn-spec replace-certificate-signing-request-status v1beta1-certificate-signing-request
  "
  replace status of the specified CertificateSigningRequest"
  ([name string?, body v1beta1-certificate-signing-request, ] (replace-certificate-signing-request-status name body nil))
  ([name string?, body v1beta1-certificate-signing-request, optional-params any?]
   (let [res (:data (replace-certificate-signing-request-status-with-http-info name body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode v1beta1-certificate-signing-request res st/string-transformer)
        res))))


