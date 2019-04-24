(ns clojure-kubernetes-client.specs.v1-http-get-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-http-header :refer :all]
            
            )
  (:import (java.io File)))


(declare v1-http-get-action-data v1-http-get-action)
(def v1-http-get-action-data
  {
   (ds/opt :host) string?
   (ds/opt :httpHeaders) (s/coll-of v1-http-header)
   (ds/opt :path) string?
   (ds/req :port) any?
   (ds/opt :scheme) string?
   })

(def v1-http-get-action
  (ds/spec
    {:name ::v1-http-get-action
     :spec v1-http-get-action-data}))

