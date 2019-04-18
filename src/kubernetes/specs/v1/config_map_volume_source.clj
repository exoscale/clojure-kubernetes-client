(ns kubernetes.specs.v1/config-map-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/key-to-path :refer :all]
            )
  (:import (java.io File)))


(def v1/config-map-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1/key-to-path-spec)
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1/config-map-volume-source-spec
  (ds/spec
    {:name ::v1/config-map-volume-source
     :spec v1/config-map-volume-source-data}))
