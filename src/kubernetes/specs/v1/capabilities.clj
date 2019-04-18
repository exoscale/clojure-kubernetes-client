(ns kubernetes.specs.v1/capabilities
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/capabilities-data
  {
   (ds/opt :add) (s/coll-of string?)
   (ds/opt :drop) (s/coll-of string?)
   })

(def v1/capabilities-spec
  (ds/spec
    {:name ::v1/capabilities
     :spec v1/capabilities-data}))
