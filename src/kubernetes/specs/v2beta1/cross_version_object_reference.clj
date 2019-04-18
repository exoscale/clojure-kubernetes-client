(ns kubernetes.specs.v2beta1/cross-version-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v2beta1/cross-version-object-reference-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v2beta1/cross-version-object-reference-spec
  (ds/spec
    {:name ::v2beta1/cross-version-object-reference
     :spec v2beta1/cross-version-object-reference-data}))
