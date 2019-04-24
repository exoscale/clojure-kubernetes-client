(ns clojure-kubernetes-client.specs.v1-service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-service-reference-data v1-service-reference)
(def v1-service-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   })

(def v1-service-reference
  (ds/spec
    {:name ::v1-service-reference
     :spec v1-service-reference-data}))

