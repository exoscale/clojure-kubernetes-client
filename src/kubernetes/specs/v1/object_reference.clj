(ns kubernetes.specs.v1/object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/object-reference-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :fieldPath) string?
   (ds/opt :kind) string?
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   (ds/opt :resourceVersion) string?
   (ds/opt :uid) string?
   })

(def v1/object-reference-spec
  (ds/spec
    {:name ::v1/object-reference
     :spec v1/object-reference-data}))
