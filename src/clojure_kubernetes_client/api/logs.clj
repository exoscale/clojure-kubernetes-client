(ns clojure-kubernetes-client.api.logs
  (:require [clojure-kubernetes-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]

            [clojure-kubernetes-client.specs. :refer :all]

            [clojure-kubernetes-client.specs. :refer :all]
)
  (:import (java.io File)))


(defn-spec log-file-handler-with-http-info any?
  ""
  [logpath string?]
  (check-required-params logpath)
  (call-api "/logs/{logpath}" :get
            {:path-params   {"logpath" logpath }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["BearerToken"]}))

(defn-spec log-file-handler any?
  ""
  [logpath string?]
  (let [res (:data (log-file-handler-with-http-info logpath))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec log-file-list-handler-with-http-info any?
  ""
  []
  (call-api "/logs/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["BearerToken"]}))

(defn-spec log-file-list-handler any?
  ""
  []
  (let [res (:data (log-file-list-handler-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


