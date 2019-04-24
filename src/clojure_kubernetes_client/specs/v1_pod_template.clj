(ns clojure-kubernetes-client.specs.v1-pod-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-template-data v1-pod-template)
(def v1-pod-template-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :template) v1-pod-template-spec
   })

(def v1-pod-template
  (ds/spec
    {:name ::v1-pod-template
     :spec v1-pod-template-data}))

