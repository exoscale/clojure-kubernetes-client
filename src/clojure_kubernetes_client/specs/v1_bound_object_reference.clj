(ns clojure-kubernetes-client.specs.v1-bound-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-bound-object-reference-data v1-bound-object-reference)
(def v1-bound-object-reference-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :name) string?
   (ds/opt :uid) string?
   })

(def v1-bound-object-reference
  (ds/spec
    {:name ::v1-bound-object-reference
     :spec v1-bound-object-reference-data}))

