(ns clojure-kubernetes-client.api.version
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs.version-info :refer :all]
)
  (:import (java.io File)))


(defn-spec get-code-with-http-info any?
  "
  get the code version"
  []
  (call-api "/version/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn-spec get-code version-info
  "
  get the code version"
  []
  (let [res (:data (get-code-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode version-info res st/string-transformer)
       res)))


