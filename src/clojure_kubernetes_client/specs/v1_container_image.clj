(ns clojure-kubernetes-client.specs.v1-container-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-container-image-data v1-container-image)
(def v1-container-image-data
  {
   (ds/req :names) (s/coll-of string?)
   (ds/opt :sizeBytes) int?
   })

(def v1-container-image
  (ds/spec
    {:name ::v1-container-image
     :spec v1-container-image-data}))

