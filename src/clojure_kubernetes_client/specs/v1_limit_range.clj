(ns clojure-kubernetes-client.specs.v1-limit-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-limit-range-data v1-limit-range)
(def v1-limit-range-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-limit-range-spec
   })

(def v1-limit-range
  (ds/spec
    {:name ::v1-limit-range
     :spec v1-limit-range-data}))

