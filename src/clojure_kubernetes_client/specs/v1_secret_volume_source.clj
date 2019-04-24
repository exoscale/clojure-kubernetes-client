(ns clojure-kubernetes-client.specs.v1-secret-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-key-to-path :refer :all]
            )
  (:import (java.io File)))


(declare v1-secret-volume-source-data v1-secret-volume-source)
(def v1-secret-volume-source-data
  {
   (ds/opt :defaultMode) int?
   (ds/opt :items) (s/coll-of v1-key-to-path)
   (ds/opt :optional) boolean?
   (ds/opt :secretName) string?
   })

(def v1-secret-volume-source
  (ds/spec
    {:name ::v1-secret-volume-source
     :spec v1-secret-volume-source-data}))

