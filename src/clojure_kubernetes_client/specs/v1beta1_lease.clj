(ns clojure-kubernetes-client.specs.v1beta1-lease
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-lease-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-lease-data v1beta1-lease)
(def v1beta1-lease-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-lease-spec
   })

(def v1beta1-lease
  (ds/spec
    {:name ::v1beta1-lease
     :spec v1beta1-lease-data}))

