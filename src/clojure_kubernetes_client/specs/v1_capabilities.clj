(ns clojure-kubernetes-client.specs.v1-capabilities
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-capabilities-data v1-capabilities)
(def v1-capabilities-data
  {
   (ds/opt :add) (s/coll-of string?)
   (ds/opt :drop) (s/coll-of string?)
   })

(def v1-capabilities
  (ds/spec
    {:name ::v1-capabilities
     :spec v1-capabilities-data}))

