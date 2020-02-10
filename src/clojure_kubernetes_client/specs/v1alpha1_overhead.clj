(ns clojure-kubernetes-client.specs.v1alpha1-overhead
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1alpha1-overhead-data v1alpha1-overhead)
(def v1alpha1-overhead-data
  {
   (ds/opt :podFixed) (s/map-of string? string?)
   })

(def v1alpha1-overhead
  (ds/spec
    {:name ::v1alpha1-overhead
     :spec v1alpha1-overhead-data}))

