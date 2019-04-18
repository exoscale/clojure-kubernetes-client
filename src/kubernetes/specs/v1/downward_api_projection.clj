(ns kubernetes.specs.v1/downward-api-projection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/downward-api-volume-file :refer :all]
            )
  (:import (java.io File)))


(def v1/downward-api-projection-data
  {
   (ds/opt :items) (s/coll-of v1/downward-api-volume-file-spec)
   })

(def v1/downward-api-projection-spec
  (ds/spec
    {:name ::v1/downward-api-projection
     :spec v1/downward-api-projection-data}))
