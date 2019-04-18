(ns kubernetes.specs.v1/config-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/config-map-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :data) (s/map-of string? string?)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   })

(def v1/config-map-spec
  (ds/spec
    {:name ::v1/config-map
     :spec v1/config-map-data}))
