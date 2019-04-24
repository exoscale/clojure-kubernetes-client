(ns clojure-kubernetes-client.specs.v1-secret-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-key-to-path :refer :all]
            )
  (:import (java.io File)))


(declare v1-secret-projection-data v1-secret-projection)
(def v1-secret-projection-data
  {
   (ds/opt :items) (s/coll-of v1-key-to-path)
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1-secret-projection
  (ds/spec
    {:name ::v1-secret-projection
     :spec v1-secret-projection-data}))

