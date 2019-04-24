(ns clojure-kubernetes-client.specs.v1-local-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-local-object-reference-data v1-local-object-reference)
(def v1-local-object-reference-data
  {
   (ds/opt :name) string?
   })

(def v1-local-object-reference
  (ds/spec
    {:name ::v1-local-object-reference
     :spec v1-local-object-reference-data}))

