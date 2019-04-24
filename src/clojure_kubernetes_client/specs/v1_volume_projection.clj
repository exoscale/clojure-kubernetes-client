(ns clojure-kubernetes-client.specs.v1-volume-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-config-map-projection :refer :all]
            [clojure-kubernetes-client.specs.v1-downward-api-projection :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-projection :refer :all]
            [clojure-kubernetes-client.specs.v1-service-account-token-projection :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-projection-data v1-volume-projection)
(def v1-volume-projection-data
  {
   (ds/opt :configMap) v1-config-map-projection
   (ds/opt :downwardAPI) v1-downward-api-projection
   (ds/opt :secret) v1-secret-projection
   (ds/opt :serviceAccountToken) v1-service-account-token-projection
   })

(def v1-volume-projection
  (ds/spec
    {:name ::v1-volume-projection
     :spec v1-volume-projection-data}))

