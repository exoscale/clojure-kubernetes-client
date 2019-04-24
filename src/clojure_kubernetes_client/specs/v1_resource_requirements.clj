(ns clojure-kubernetes-client.specs.v1-resource-requirements
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-resource-requirements-data v1-resource-requirements)
(def v1-resource-requirements-data
  {
   (ds/opt :limits) (s/map-of string? string?)
   (ds/opt :requests) (s/map-of string? string?)
   })

(def v1-resource-requirements
  (ds/spec
    {:name ::v1-resource-requirements
     :spec v1-resource-requirements-data}))

