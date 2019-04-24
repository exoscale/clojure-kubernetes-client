(ns clojure-kubernetes-client.specs.v1-host-alias
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-host-alias-data v1-host-alias)
(def v1-host-alias-data
  {
   (ds/opt :hostnames) (s/coll-of string?)
   (ds/opt :ip) string?
   })

(def v1-host-alias
  (ds/spec
    {:name ::v1-host-alias
     :spec v1-host-alias-data}))

