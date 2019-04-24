(ns clojure-kubernetes-client.specs.v1-downward-api-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-downward-api-volume-file :refer :all]
            )
  (:import (java.io File)))


(declare v1-downward-api-projection-data v1-downward-api-projection)
(def v1-downward-api-projection-data
  {
   (ds/opt :items) (s/coll-of v1-downward-api-volume-file)
   })

(def v1-downward-api-projection
  (ds/spec
    {:name ::v1-downward-api-projection
     :spec v1-downward-api-projection-data}))

