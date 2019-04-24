(ns clojure-kubernetes-client.specs.v1-scale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-scale-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-scale-data v1-scale)
(def v1-scale-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-scale-spec
   (ds/opt :status) v1-scale-status
   })

(def v1-scale
  (ds/spec
    {:name ::v1-scale
     :spec v1-scale-data}))

