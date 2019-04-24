(ns clojure-kubernetes-client.specs.v1-typed-local-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-typed-local-object-reference-data v1-typed-local-object-reference)
(def v1-typed-local-object-reference-data
  {
   (ds/opt :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v1-typed-local-object-reference
  (ds/spec
    {:name ::v1-typed-local-object-reference
     :spec v1-typed-local-object-reference-data}))

