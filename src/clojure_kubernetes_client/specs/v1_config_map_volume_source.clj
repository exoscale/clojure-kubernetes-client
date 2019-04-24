(ns clojure-kubernetes-client.specs.v1-config-map-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-key-to-path :refer :all]
            )
  (:import (java.io File)))


(declare v1-config-map-volume-source-data v1-config-map-volume-source)
(def v1-config-map-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1-key-to-path)
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1-config-map-volume-source
  (ds/spec
    {:name ::v1-config-map-volume-source
     :spec v1-config-map-volume-source-data}))

