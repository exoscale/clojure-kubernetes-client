(ns kubernetes.specs.v1/container-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/container-image-data
  {
   (ds/req :names) (s/coll-of string?)
   (ds/opt :sizeBytes) int?
   })

(def v1/container-image-spec
  (ds/spec
    {:name ::v1/container-image
     :spec v1/container-image-data}))
