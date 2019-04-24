(ns clojure-kubernetes-client.specs.v1-downward-api-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-downward-api-volume-file :refer :all]
            )
  (:import (java.io File)))


(declare v1-downward-api-volume-source-data v1-downward-api-volume-source)
(def v1-downward-api-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1-downward-api-volume-file)
   })

(def v1-downward-api-volume-source
  (ds/spec
    {:name ::v1-downward-api-volume-source
     :spec v1-downward-api-volume-source-data}))

