(ns clojure-kubernetes-client.specs.v1-config-map-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-key-to-path :refer :all]
            )
  (:import (java.io File)))


(declare v1-config-map-projection-data v1-config-map-projection)
(def v1-config-map-projection-data
  {
   (ds/opt :items) (s/coll-of v1-key-to-path)
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1-config-map-projection
  (ds/spec
    {:name ::v1-config-map-projection
     :spec v1-config-map-projection-data}))

