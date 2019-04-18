(ns kubernetes.specs.v1/namespace-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/namespace-spec-data
  {
   (ds/opt :finalizers) (s/coll-of string?)
   })

(def v1/namespace-spec-spec
  (ds/spec
    {:name ::v1/namespace-spec
     :spec v1/namespace-spec-data}))
