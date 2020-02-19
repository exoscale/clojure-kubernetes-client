(ns clojure-kubernetes-client.specs.apiextensions-v1-service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare apiextensions-v1-service-reference-data apiextensions-v1-service-reference)
(def apiextensions-v1-service-reference-data
  {
   (ds/req :name) string?
   (ds/req :namespace) string?
   (ds/opt :path) string?
   (ds/opt :port) int?
   })

(def apiextensions-v1-service-reference
  (ds/spec
    {:name ::apiextensions-v1-service-reference
     :spec apiextensions-v1-service-reference-data}))

