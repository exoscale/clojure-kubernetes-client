(ns clojure-kubernetes-client.specs.v1alpha1-pod-preset-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-env-var :refer :all]
            [clojure-kubernetes-client.specs.v1-env-from-source :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-volume-mount :refer :all]
            [clojure-kubernetes-client.specs.v1-volume :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-pod-preset-spec-data v1alpha1-pod-preset-spec)
(def v1alpha1-pod-preset-spec-data
  {
   (ds/opt :env) (s/coll-of v1-env-var)
   (ds/opt :envFrom) (s/coll-of v1-env-from-source)
   (ds/opt :selector) v1-label-selector
   (ds/opt :volumeMounts) (s/coll-of v1-volume-mount)
   (ds/opt :volumes) (s/coll-of v1-volume)
   })

(def v1alpha1-pod-preset-spec
  (ds/spec
    {:name ::v1alpha1-pod-preset-spec
     :spec v1alpha1-pod-preset-spec-data}))

