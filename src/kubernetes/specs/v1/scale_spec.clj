(ns kubernetes.specs.v1/scale-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/scale-spec-data
  {
   (ds/opt :replicas) int?
   })

(def v1/scale-spec-spec
  (ds/spec
    {:name ::v1/scale-spec
     :spec v1/scale-spec-data}))
