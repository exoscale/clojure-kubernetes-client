(ns clojure-kubernetes-client.specs.v1-secret-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-secret-reference-data v1-secret-reference)
(def v1-secret-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   })

(def v1-secret-reference
  (ds/spec
    {:name ::v1-secret-reference
     :spec v1-secret-reference-data}))

