(ns clojure-kubernetes-client.specs.v1-namespace-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-namespace-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1-namespace-status-data v1-namespace-status)
(def v1-namespace-status-data
  {
   (ds/opt :conditions) (s/coll-of v1-namespace-condition)
   (ds/opt :phase) string?
   })

(def v1-namespace-status
  (ds/spec
    {:name ::v1-namespace-status
     :spec v1-namespace-status-data}))

