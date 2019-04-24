(ns clojure-kubernetes-client.specs.v1-key-to-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-key-to-path-data v1-key-to-path)
(def v1-key-to-path-data
  {
   (ds/req :key) string?
   (ds/opt :mode) int?
   (ds/req :path) string?
   })

(def v1-key-to-path
  (ds/spec
    {:name ::v1-key-to-path
     :spec v1-key-to-path-data}))

