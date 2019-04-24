(ns clojure-kubernetes-client.specs.v1-pod-template-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-template-spec-data v1-pod-template-spec)
(def v1-pod-template-spec-data
  {
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-pod-spec
   })

(def v1-pod-template-spec
  (ds/spec
    {:name ::v1-pod-template-spec
     :spec v1-pod-template-spec-data}))

