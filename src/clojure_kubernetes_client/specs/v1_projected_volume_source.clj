(ns clojure-kubernetes-client.specs.v1-projected-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-volume-projection :refer :all]
            )
  (:import (java.io File)))


(declare v1-projected-volume-source-data v1-projected-volume-source)
(def v1-projected-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/req :sources) (s/coll-of v1-volume-projection)
   })

(def v1-projected-volume-source
  (ds/spec
    {:name ::v1-projected-volume-source
     :spec v1-projected-volume-source-data}))

