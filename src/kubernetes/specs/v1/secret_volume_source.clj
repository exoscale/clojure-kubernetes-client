(ns kubernetes.specs.v1/secret-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/key-to-path :refer :all]
            )
  (:import (java.io File)))


(def v1/secret-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1/key-to-path-spec)
   (ds/opt :optional) boolean?
   (ds/opt :secretName) string?
   })

(def v1/secret-volume-source-spec
  (ds/spec
    {:name ::v1/secret-volume-source
     :spec v1/secret-volume-source-data}))
