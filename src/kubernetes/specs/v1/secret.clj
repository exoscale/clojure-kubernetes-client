(ns kubernetes.specs.v1/secret
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/secret-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :data) (s/map-of string? any?)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :stringData) (s/map-of string? string?)
   (ds/opt :type) string?
   })

(def v1/secret-spec
  (ds/spec
    {:name ::v1/secret
     :spec v1/secret-data}))
