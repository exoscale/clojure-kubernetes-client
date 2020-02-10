(ns clojure-kubernetes-client.specs.v1beta1-overhead
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1beta1-overhead-data v1beta1-overhead)
(def v1beta1-overhead-data
  {
   (ds/opt :podFixed) (s/map-of string? string?)
   })

(def v1beta1-overhead
  (ds/spec
    {:name ::v1beta1-overhead
     :spec v1beta1-overhead-data}))

