(ns kubernetes.specs.v1/cross-version-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/cross-version-object-reference-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v1/cross-version-object-reference-spec
  (ds/spec
    {:name ::v1/cross-version-object-reference
     :spec v1/cross-version-object-reference-data}))
