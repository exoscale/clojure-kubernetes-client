(ns kubernetes.specs.v1/resource-quota-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/resource-quota-status-data
  {
   (ds/opt :hard) (s/map-of string? string?)
   (ds/opt :used) (s/map-of string? string?)
   })

(def v1/resource-quota-status-spec
  (ds/spec
    {:name ::v1/resource-quota-status
     :spec v1/resource-quota-status-data}))
