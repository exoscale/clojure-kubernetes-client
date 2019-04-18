(ns kubernetes.specs.v1/host-alias
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/host-alias-data
  {
   (ds/opt :hostnames) (s/coll-of string?)
   (ds/opt :ip) string?
   })

(def v1/host-alias-spec
  (ds/spec
    {:name ::v1/host-alias
     :spec v1/host-alias-data}))
