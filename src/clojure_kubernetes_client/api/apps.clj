(ns clojure-kubernetes-client.api.apps
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.v1-api-group :refer :all]
)
  (:import (java.io File)))


(defn-spec get-api-group-with-http-info any?
  "
  get information of a group"
  []
  (call-api "/apis/apps/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-api-group v1-api-group
  "
  get information of a group"
  []
  (let [res (:data (get-api-group-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode v1-api-group res st/string-transformer)
       res)))


