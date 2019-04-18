(ns kubernetes.specs.v1beta2/scale-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1beta2/scale-spec-data
  {
   (ds/opt :replicas) int?
   })

(def v1beta2/scale-spec-spec
  (ds/spec
    {:name ::v1beta2/scale-spec
     :spec v1beta2/scale-spec-data}))
