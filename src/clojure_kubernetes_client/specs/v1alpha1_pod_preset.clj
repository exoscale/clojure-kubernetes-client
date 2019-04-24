(ns clojure-kubernetes-client.specs.v1alpha1-pod-preset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-pod-preset-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-pod-preset-data v1alpha1-pod-preset)
(def v1alpha1-pod-preset-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1alpha1-pod-preset-spec
   })

(def v1alpha1-pod-preset
  (ds/spec
    {:name ::v1alpha1-pod-preset
     :spec v1alpha1-pod-preset-data}))

