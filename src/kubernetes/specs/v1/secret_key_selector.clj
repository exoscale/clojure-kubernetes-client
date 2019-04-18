(ns kubernetes.specs.v1/secret-key-selector
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/secret-key-selector-data
  {
   (ds/req :key) string?
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   })

(def v1/secret-key-selector-spec
  (ds/spec
    {:name ::v1/secret-key-selector
     :spec v1/secret-key-selector-data}))
