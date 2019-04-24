(ns clojure-kubernetes-client.specs.v1-pod
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-data v1-pod)
(def v1-pod-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-pod-spec
   (ds/opt :status) v1-pod-status
   })

(def v1-pod
  (ds/spec
    {:name ::v1-pod
     :spec v1-pod-data}))

