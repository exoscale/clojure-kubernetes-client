(ns clojure-kubernetes-client.specs.v1-secret-key-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-secret-key-selector-data v1-secret-key-selector)
(def v1-secret-key-selector-data
  {
   (ds/req :key) string?
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1-secret-key-selector
  (ds/spec
    {:name ::v1-secret-key-selector
     :spec v1-secret-key-selector-data}))

