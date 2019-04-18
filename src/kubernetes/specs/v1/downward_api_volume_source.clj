(ns kubernetes.specs.v1/downward-api-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/downward-api-volume-file :refer :all]
            )
  (:import (java.io File)))


(def v1/downward-api-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1/downward-api-volume-file-spec)
   })

(def v1/downward-api-volume-source-spec
  (ds/spec
    {:name ::v1/downward-api-volume-source
     :spec v1/downward-api-volume-source-data}))
