(ns clojure-kubernetes-client.specs.apiregistration-v1-service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare apiregistration-v1-service-reference-data apiregistration-v1-service-reference)
(def apiregistration-v1-service-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   (ds/opt :port) int?
   })

(def apiregistration-v1-service-reference
  (ds/spec
    {:name ::apiregistration-v1-service-reference
     :spec apiregistration-v1-service-reference-data}))

