(ns clojure-kubernetes-client.api.custom-objects
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]

            [clojure-kubernetes-client.specs.any? :refer :all]
)
  (:import (java.io File)))


(defn-spec create-cluster-custom-object-with-http-info any?
  "
  Creates a cluster scoped Custom object"
  ([group string?, version string?, plural string?, body any?, ] (create-cluster-custom-object-with-http-info group version plural body nil))
  ([group string?, version string?, plural string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params group version plural body)
   (call-api "/apis/{group}/{version}/{plural}" :post
             {:path-params   {"group" group "version" version "plural" plural }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-cluster-custom-object any?
  "
  Creates a cluster scoped Custom object"
  ([group string?, version string?, plural string?, body any?, ] (create-cluster-custom-object group version plural body nil))
  ([group string?, version string?, plural string?, body any?, optional-params any?]
   (let [res (:data (create-cluster-custom-object-with-http-info group version plural body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec create-namespaced-custom-object-with-http-info any?
  "
  Creates a namespace scoped Custom object"
  ([group string?, version string?, namespace string?, plural string?, body any?, ] (create-namespaced-custom-object-with-http-info group version namespace plural body nil))
  ([group string?, version string?, namespace string?, plural string?, body any?, {:keys [pretty]} (s/map-of keyword? any?)]
   (check-required-params group version namespace plural body)
   (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}" :post
             {:path-params   {"group" group "version" version "namespace" namespace "plural" plural }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["BearerToken"]})))

(defn-spec create-namespaced-custom-object any?
  "
  Creates a namespace scoped Custom object"
  ([group string?, version string?, namespace string?, plural string?, body any?, ] (create-namespaced-custom-object group version namespace plural body nil))
  ([group string?, version string?, namespace string?, plural string?, body any?, optional-params any?]
   (let [res (:data (create-namespaced-custom-object-with-http-info group version namespace plural body optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec delete-cluster-custom-object-with-http-info any?
  "
  Deletes the specified cluster scoped custom object"
  ([group string?, version string?, plural string?, name string?, ] (delete-cluster-custom-object-with-http-info group version plural name nil))
  ([group string?, version string?, plural string?, name string?, {:keys [gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params group version plural name)
   (call-api "/apis/{group}/{version}/{plural}/{name}" :delete
             {:path-params   {"group" group "version" version "plural" plural "name" name }
              :header-params {}
              :query-params  {"gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-cluster-custom-object any?
  "
  Deletes the specified cluster scoped custom object"
  ([group string?, version string?, plural string?, name string?, ] (delete-cluster-custom-object group version plural name nil))
  ([group string?, version string?, plural string?, name string?, optional-params any?]
   (let [res (:data (delete-cluster-custom-object-with-http-info group version plural name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec delete-namespaced-custom-object-with-http-info any?
  "
  Deletes the specified namespace scoped custom object"
  ([group string?, version string?, namespace string?, plural string?, name string?, ] (delete-namespaced-custom-object-with-http-info group version namespace plural name nil))
  ([group string?, version string?, namespace string?, plural string?, name string?, {:keys [gracePeriodSeconds orphanDependents propagationPolicy body]} (s/map-of keyword? any?)]
   (check-required-params group version namespace plural name)
   (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}" :delete
             {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
              :header-params {}
              :query-params  {"gracePeriodSeconds" gracePeriodSeconds "orphanDependents" orphanDependents "propagationPolicy" propagationPolicy }
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["BearerToken"]})))

(defn-spec delete-namespaced-custom-object any?
  "
  Deletes the specified namespace scoped custom object"
  ([group string?, version string?, namespace string?, plural string?, name string?, ] (delete-namespaced-custom-object group version namespace plural name nil))
  ([group string?, version string?, namespace string?, plural string?, name string?, optional-params any?]
   (let [res (:data (delete-namespaced-custom-object-with-http-info group version namespace plural name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec get-cluster-custom-object-with-http-info any?
  "
  Returns a cluster scoped custom object"
  [group string?, version string?, plural string?, name string?]
  (check-required-params group version plural name)
  (call-api "/apis/{group}/{version}/{plural}/{name}" :get
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-cluster-custom-object any?
  "
  Returns a cluster scoped custom object"
  [group string?, version string?, plural string?, name string?]
  (let [res (:data (get-cluster-custom-object-with-http-info group version plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-cluster-custom-object-scale-with-http-info any?
  "
  read scale of the specified custom object"
  [group string?, version string?, plural string?, name string?]
  (check-required-params group version plural name)
  (call-api "/apis/{group}/{version}/{plural}/{name}/scale" :get
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-cluster-custom-object-scale any?
  "
  read scale of the specified custom object"
  [group string?, version string?, plural string?, name string?]
  (let [res (:data (get-cluster-custom-object-scale-with-http-info group version plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-cluster-custom-object-status-with-http-info any?
  "
  read status of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?]
  (check-required-params group version plural name)
  (call-api "/apis/{group}/{version}/{plural}/{name}/status" :get
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-cluster-custom-object-status any?
  "
  read status of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?]
  (let [res (:data (get-cluster-custom-object-status-with-http-info group version plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-namespaced-custom-object-with-http-info any?
  "
  Returns a namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (check-required-params group version namespace plural name)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}" :get
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-namespaced-custom-object any?
  "
  Returns a namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (let [res (:data (get-namespaced-custom-object-with-http-info group version namespace plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-namespaced-custom-object-scale-with-http-info any?
  "
  read scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (check-required-params group version namespace plural name)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale" :get
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-namespaced-custom-object-scale any?
  "
  read scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (let [res (:data (get-namespaced-custom-object-scale-with-http-info group version namespace plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-namespaced-custom-object-status-with-http-info any?
  "
  read status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (check-required-params group version namespace plural name)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status" :get
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-namespaced-custom-object-status any?
  "
  read status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?]
  (let [res (:data (get-namespaced-custom-object-status-with-http-info group version namespace plural name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec list-cluster-custom-object-with-http-info any?
  "
  list or watch cluster scoped custom objects"
  ([group string?, version string?, plural string?, ] (list-cluster-custom-object-with-http-info group version plural nil))
  ([group string?, version string?, plural string?, {:keys [pretty continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params group version plural)
   (call-api "/apis/{group}/{version}/{plural}" :get
             {:path-params   {"group" group "version" version "plural" plural }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/json;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-cluster-custom-object any?
  "
  list or watch cluster scoped custom objects"
  ([group string?, version string?, plural string?, ] (list-cluster-custom-object group version plural nil))
  ([group string?, version string?, plural string?, optional-params any?]
   (let [res (:data (list-cluster-custom-object-with-http-info group version plural optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec list-namespaced-custom-object-with-http-info any?
  "
  list or watch namespace scoped custom objects"
  ([group string?, version string?, namespace string?, plural string?, ] (list-namespaced-custom-object-with-http-info group version namespace plural nil))
  ([group string?, version string?, namespace string?, plural string?, {:keys [pretty continue fieldSelector labelSelector limit resourceVersion timeoutSeconds watch]} (s/map-of keyword? any?)]
   (check-required-params group version namespace plural)
   (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}" :get
             {:path-params   {"group" group "version" version "namespace" namespace "plural" plural }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" fieldSelector "labelSelector" labelSelector "limit" limit "resourceVersion" resourceVersion "timeoutSeconds" timeoutSeconds "watch" watch }
              :form-params   {}
              :content-types []
              :accepts       ["application/json" "application/json;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn-spec list-namespaced-custom-object any?
  "
  list or watch namespace scoped custom objects"
  ([group string?, version string?, namespace string?, plural string?, ] (list-namespaced-custom-object group version namespace plural nil))
  ([group string?, version string?, namespace string?, plural string?, optional-params any?]
   (let [res (:data (list-namespaced-custom-object-with-http-info group version namespace plural optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec patch-cluster-custom-object-with-http-info any?
  "
  patch the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}" :patch
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-cluster-custom-object any?
  "
  patch the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (patch-cluster-custom-object-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec patch-cluster-custom-object-scale-with-http-info any?
  "
  partially update scale of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}/scale" :patch
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-cluster-custom-object-scale any?
  "
  partially update scale of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (patch-cluster-custom-object-scale-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec patch-cluster-custom-object-status-with-http-info any?
  "
  partially update status of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}/status" :patch
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-cluster-custom-object-status any?
  "
  partially update status of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (patch-cluster-custom-object-status-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec patch-namespaced-custom-object-with-http-info any?
  "
  patch the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}" :patch
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-namespaced-custom-object any?
  "
  patch the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (patch-namespaced-custom-object-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec patch-namespaced-custom-object-scale-with-http-info any?
  "
  partially update scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale" :patch
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-namespaced-custom-object-scale any?
  "
  partially update scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (patch-namespaced-custom-object-scale-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec patch-namespaced-custom-object-status-with-http-info any?
  "
  partially update status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status" :patch
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json-patch+json" "application/merge-patch+json"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec patch-namespaced-custom-object-status any?
  "
  partially update status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (patch-namespaced-custom-object-status-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-cluster-custom-object-with-http-info any?
  "
  replace the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}" :put
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-cluster-custom-object any?
  "
  replace the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (replace-cluster-custom-object-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-cluster-custom-object-scale-with-http-info any?
  "
  replace scale of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}/scale" :put
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-cluster-custom-object-scale any?
  "
  replace scale of the specified cluster scoped custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (replace-cluster-custom-object-scale-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-cluster-custom-object-status-with-http-info any?
  "
  replace status of the cluster scoped specified custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (check-required-params group version plural name body)
  (call-api "/apis/{group}/{version}/{plural}/{name}/status" :put
            {:path-params   {"group" group "version" version "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-cluster-custom-object-status any?
  "
  replace status of the cluster scoped specified custom object"
  [group string?, version string?, plural string?, name string?, body any?]
  (let [res (:data (replace-cluster-custom-object-status-with-http-info group version plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-namespaced-custom-object-with-http-info any?
  "
  replace the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}" :put
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-namespaced-custom-object any?
  "
  replace the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (replace-namespaced-custom-object-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-namespaced-custom-object-scale-with-http-info any?
  "
  replace scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale" :put
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-namespaced-custom-object-scale any?
  "
  replace scale of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (replace-namespaced-custom-object-scale-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec replace-namespaced-custom-object-status-with-http-info any?
  "
  replace status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (check-required-params group version namespace plural name body)
  (call-api "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status" :put
            {:path-params   {"group" group "version" version "namespace" namespace "plural" plural "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec replace-namespaced-custom-object-status any?
  "
  replace status of the specified namespace scoped custom object"
  [group string?, version string?, namespace string?, plural string?, name string?, body any?]
  (let [res (:data (replace-namespaced-custom-object-status-with-http-info group version namespace plural name body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


