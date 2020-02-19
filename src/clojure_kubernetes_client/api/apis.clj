(ns clojure-kubernetes-client.api.apis
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-api-group-list :refer :all]
)
  (:import (java.io File)))


(defn-spec get-api-versions-with-http-info any?
  "
  get available API versions"
  []
  (call-api "/apis/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-api-versions v1-api-group-list
  "
  get available API versions"
  []
  (let [res (:data (get-api-versions-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1-api-group-list res st/string-transformer)
       res)))


