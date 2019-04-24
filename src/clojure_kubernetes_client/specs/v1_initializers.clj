(ns clojure-kubernetes-client.specs.v1-initializers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-initializer :refer :all]
            [clojure-kubernetes-client.specs.v1-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-initializers-data v1-initializers)
(def v1-initializers-data
  {
   (ds/req :pending) (s/coll-of v1-initializer)
   (ds/opt :result) v1-status
   })

(def v1-initializers
  (ds/spec
    {:name ::v1-initializers
     :spec v1-initializers-data}))

