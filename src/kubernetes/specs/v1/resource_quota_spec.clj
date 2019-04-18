(ns kubernetes.specs.v1/resource-quota-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/resource-quota-spec-data
  {
   (ds/opt :hard) (s/map-of string? string?)
   (ds/opt :scopes) (s/coll-of string?)
   })

(def v1/resource-quota-spec-spec
  (ds/spec
    {:name ::v1/resource-quota-spec
     :spec v1/resource-quota-spec-data}))
