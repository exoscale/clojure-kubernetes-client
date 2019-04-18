(ns kubernetes.specs.v1/key-to-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/key-to-path-data
  {
   (ds/req :key) string?
   (ds/opt :mode) int?
   (ds/req :path) string?
   })

(def v1/key-to-path-spec
  (ds/spec
    {:name ::v1/key-to-path
     :spec v1/key-to-path-data}))
