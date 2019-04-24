(ns clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta1-horizontal-pod-autoscaler :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-horizontal-pod-autoscaler-list-data v2beta1-horizontal-pod-autoscaler-list)
(def v2beta1-horizontal-pod-autoscaler-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v2beta1-horizontal-pod-autoscaler)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v2beta1-horizontal-pod-autoscaler-list
  (ds/spec
    {:name ::v2beta1-horizontal-pod-autoscaler-list
     :spec v2beta1-horizontal-pod-autoscaler-list-data}))

