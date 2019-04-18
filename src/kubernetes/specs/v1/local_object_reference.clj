(ns kubernetes.specs.v1/local-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/local-object-reference-data
  {
   (ds/opt :name) string?
   })

(def v1/local-object-reference-spec
  (ds/spec
    {:name ::v1/local-object-reference
     :spec v1/local-object-reference-data}))
