(ns kubernetes.specs.v1/config-map-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/key-to-path :refer :all]
            )
  (:import (java.io File)))


(def v1/config-map-projection-data
  {
   (ds/opt :items) (s/coll-of v1/key-to-path-spec)
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1/config-map-projection-spec
  (ds/spec
    {:name ::v1/config-map-projection
     :spec v1/config-map-projection-data}))
