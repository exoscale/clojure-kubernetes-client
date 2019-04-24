(ns clojure-kubernetes-client.specs.v1-namespace
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-namespace-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-namespace-data v1-namespace)
(def v1-namespace-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-namespace-spec
   (ds/opt :status) v1-namespace-status
   })

(def v1-namespace
  (ds/spec
    {:name ::v1-namespace
     :spec v1-namespace-data}))

