(ns clojure-kubernetes-client.specs.v1beta1-controller-revision
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-controller-revision-data v1beta1-controller-revision)
(def v1beta1-controller-revision-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :data) any?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :revision) int?
   })

(def v1beta1-controller-revision
  (ds/spec
    {:name ::v1beta1-controller-revision
     :spec v1beta1-controller-revision-data}))

