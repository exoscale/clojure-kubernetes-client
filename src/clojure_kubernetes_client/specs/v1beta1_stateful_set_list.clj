(ns clojure-kubernetes-client.specs.v1beta1-stateful-set-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-stateful-set :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-stateful-set-list-data v1beta1-stateful-set-list)
(def v1beta1-stateful-set-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1-stateful-set)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta1-stateful-set-list
  (ds/spec
    {:name ::v1beta1-stateful-set-list
     :spec v1beta1-stateful-set-list-data}))

