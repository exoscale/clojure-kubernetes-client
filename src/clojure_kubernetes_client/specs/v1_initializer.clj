(ns clojure-kubernetes-client.specs.v1-initializer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-initializer-data v1-initializer)
(def v1-initializer-data
  {
   (ds/req :name) string?
   })

(def v1-initializer
  (ds/spec
    {:name ::v1-initializer
     :spec v1-initializer-data}))

