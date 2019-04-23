(ns kubernetes.specs.v1/typed-local-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/typed-local-object-reference-data
  {
   (ds/opt :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v1/typed-local-object-reference-spec
  (ds/spec
    {:name ::v1/typed-local-object-reference
     :spec v1/typed-local-object-reference-data}))
