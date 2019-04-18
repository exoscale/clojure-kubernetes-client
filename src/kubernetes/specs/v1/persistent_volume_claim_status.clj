(ns kubernetes.specs.v1/persistent-volume-claim-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/persistent-volume-claim-condition :refer :all]
            )
  (:import (java.io File)))


(def v1/persistent-volume-claim-status-data
  {
   (ds/opt :accessModes) (s/coll-of string?)
   (ds/opt :capacity) (s/map-of string? string?)
   (ds/opt :conditions) (s/coll-of v1/persistent-volume-claim-condition-spec)
   (ds/opt :phase) string?
   })

(def v1/persistent-volume-claim-status-spec
  (ds/spec
    {:name ::v1/persistent-volume-claim-status
     :spec v1/persistent-volume-claim-status-data}))
