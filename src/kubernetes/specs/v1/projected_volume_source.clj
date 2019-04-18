(ns kubernetes.specs.v1/projected-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/volume-projection :refer :all]
            )
  (:import (java.io File)))


(def v1/projected-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/req :sources) (s/coll-of v1/volume-projection-spec)
   })

(def v1/projected-volume-source-spec
  (ds/spec
    {:name ::v1/projected-volume-source
     :spec v1/projected-volume-source-data}))
